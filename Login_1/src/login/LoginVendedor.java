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
public class LoginVendedor {
 /**
 * Metodo contraseña de la clase LoginVendedor del paquete login
 * Se encarga de verificar que al momento en que un empleado de tipo Vendedor ingrese 
 * su nomre de usuario y/o contraseña sean correctos y concuerden con los datos del 
 * archivo correspondiente para poder continuar con los menus correspondientes
 */   
    void contraseña() {
        int opcion = 0;
        do{
            Scanner entrada = new Scanner(System.in);
            File archivo = new File("Vendedor.dat");
            boolean correcto = false;
            String name = "";
            System.out.println("");
            System.out.println("-----------");
            System.out.println("Ingrese el nombre de usuario (VENDEDOR)");
            String user = entrada.nextLine();
            System.out.println("ingrese la contraseña (VENDEDOR)");
            String password = entrada.nextLine();        
            try {            
                FileInputStream fis = new FileInputStream(archivo);
                ObjectInputStream ois;
                while (fis.available()>0) {
                    ois = new ObjectInputStream(fis);
                    Vendedor vendedor = (Vendedor) ois.readObject();
                    if (password.equals(vendedor.getContrasena()) && user.equals(vendedor.getUsuario())) {
                    correcto = true;            
                    user = vendedor.getUsuario();
                    name = vendedor.getNombre();
                    break;                   
                    }                
                }
                fis.close();
            } catch (Exception e) {
                System.out.println("Error: no hay usuarios registrados, registre uno");     
            }
        if (correcto == true) {
            VendedorControlador a = new VendedorControlador();
            a.BC(user, name);
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
 * Metodo crear de la clase LoginVendedor del paquete login
 * Se encarga de crear un nuevo empleado de tipo Vendedor solicitando
 * su nombre, nombre de usuario, contraseña y asignando un ID aleatorio
 * para guardar los datos en un archivo
 */    
    void crear(){
        Vendedor vendedor = new Vendedor();
        Scanner entrada = new Scanner(System.in); 
        System.out.println("");
        System.out.println("-----------");
        System.out.println("Ingrese su nombre");
        String name = entrada.nextLine();
        vendedor.setNombre(name);
        System.out.println("Ingrese su nombre de usuario (VENDEDOR)");        
        String user = entrada.nextLine();        
        vendedor.setUsuario(user);
        System.out.println("Ingrese su contraseña (VENDEDOR)");
        String password = entrada.nextLine();
        vendedor.setContrasena(password);
        String ID = ("VD"+String.valueOf((int)(Math.random()*1000+1)));
        System.out.println("Su id es el siguiente: "+ID);
        vendedor.setIdVendedor(ID);       
        File archivo = new File("Vendedor.dat");
        try {
            FileOutputStream fos = new FileOutputStream(archivo, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(vendedor);
            oos.close();
            fos.close();            
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
