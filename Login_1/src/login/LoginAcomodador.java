package login;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Poyecro final
 * Arrollo Chavarria Jose Luis
 * Barrera Guardia Francisco Mosies
 * Peralta Rodríguez Juan Manuel
 * Reséndiz Cruz Rodrigo Daniel
 */
public class LoginAcomodador {
/**
 * Metodo contraseña de la clase LoginAcomodador del paquete login
 * Se encarga de verificar que al momento en que un empleado de tipo Acomodador ingrese 
 * su nomre de usuario y/o contraseña sean correctos y concuerden con los datos del 
 * archivo correspondiente para poder continuar con los menus correspondientes
 */    
    void contraseña() {
        int opcion = 0;
        do{
            Scanner entrada = new Scanner(System.in);
            File archivo = new File("Acomodador.dat");
            boolean correcto = false;
            System.out.println("");
            System.out.println("-----------");
            System.out.println("Ingrese el nombre de usuario (ACOMODADOR)");
            String user = entrada.nextLine();
            System.out.println("ingrese la contraseña (ACOMODADOR)");
            String password = entrada.nextLine();        
            try {            
                FileInputStream fis = new FileInputStream(archivo);
                ObjectInputStream ois;
                while (fis.available()>0) {
                    ois = new ObjectInputStream(fis);
                    Acomodador acomodador = (Acomodador) ois.readObject();
                    if (password.equals(acomodador.getContrasena()) && user.equals(acomodador.getUsuario())) {
                        correcto = true;            
                        user = acomodador.getUsuario();
                        break;                   
                    }                
                }
                fis.close();
            } catch (Exception e) {
                System.out.println("Error:");      
            }
        if (correcto == true) {
            AcomodadorControlador a = new AcomodadorControlador();
            a.DC(user);
            opcion=0;
        }else{
            System.out.println("La contraseña o el nombre de usuario es invalido");
            System.out.println("¿quiere intentarlo de nuevo?");
            System.out.println("1.-si");
            System.out.println("0.-no");
            opcion = Integer.parseInt(entrada.nextLine());
        }
        }while(opcion ==1);
    }  
/**
 * Metodo crear de la clase LoginAcomodador del paquete login
 * Se encarga de crear un nuevo empleado de tipo Acomodador solicitando
 * su nombre, nombre de usuario, contraseña y asignando un ID aleatorio
 * para guardar los datos en un archivo
 */    
    void crear(){
        Acomodador acomodador = new Acomodador();
        Scanner entrada = new Scanner(System.in);
        System.out.println("");
        System.out.println("-----------");
        System.out.println("Ingrese su nombre");
        String name = entrada.nextLine();
        acomodador.setNombre(name);
        System.out.println("Ingrese su nombre de usuario (ACOMODADOR)");        
        String user = entrada.nextLine();        
        acomodador.setUsuario(user);
        System.out.println("Ingrese su contraseña (ACOMODADOR)");
        String password = entrada.nextLine();
        acomodador.setContrasena(password);
        String ID = ("AC"+String.valueOf((int)(Math.random()*1000+1)));
        System.out.println("Su id es el siguiente: "+ID);
        acomodador.setIdAcomodador(ID);       
        File archivo = new File("Acomodador.dat");
        try {
            FileOutputStream fos = new FileOutputStream(archivo, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(acomodador);
            oos.close();
            fos.close();
            
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
