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
public class LoginGerente {
/**
 * Metodo contraseña de la clase LoginGerente del paquete login
 * Se encarga de verificar que al momento en que un empleado de tipo Gerente ingrese 
 * su nomre de usuario y/o contraseña sean correctos y concuerden con los datos del 
 * archivo correspondiente para poder continuar con los menus correspondientes
 */
    void contraseña() {
        int opcion = 0;
        do{
            Scanner entrada = new Scanner(System.in);
            File archivo = new File("Gerente.dat");
            boolean correcto = false;
            String name = "";
            System.out.println("");
            System.out.println("-----------");
            System.out.println("Ingrese el nombre de usuario (GERENTE)");
            String user = entrada.nextLine();
            System.out.println("ingrese la contraseña (GERENTE)");
            String password = entrada.nextLine();        
            try {            
                FileInputStream fis = new FileInputStream(archivo);
                ObjectInputStream ois;
                while (fis.available()>0) {
                    ois = new ObjectInputStream(fis);
                    Gerente gerente = (Gerente) ois.readObject();
                    if (password.equals(gerente.getContrasena()) && user.equals(gerente.getUsuario())) {
                        correcto = true;            
                        user = gerente.usuario;
                        name = gerente.getNombre();
                        break;                   
                    }                
                }                
                fis.close();
            } catch (Exception e) {
                System.out.println("Error: no hay usuarios registrados, registre uno");     
            }
        if (correcto == true) {
            GerenteControlador a = new GerenteControlador();
            a.AC(user, name);
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
 * Metodo crear de la clase LoginGerente del paquete login
 * Se encarga de crear un nuevo empleado de tipo Gerente solicitando
 * su nombre, nombre de usuario, contraseña y asignando un ID aleatorio
 * para guardar los datos en un archivo
 */    
    void crear(){        
        Gerente gerente = new Gerente();
        Scanner entrada = new Scanner(System.in);
        System.out.println("");
        System.out.println("-----------");
        System.out.println("Ingrese su nombre");
        String name = entrada.nextLine();
        gerente.setNombre(name);
        System.out.println("Ingrese su nombre de usuario (GERENTE)");        
        String user = entrada.nextLine();        
        gerente.setUsuario(user);
        System.out.println("Ingrese su contraseña (GERENTE)");
        String password = entrada.nextLine();
        gerente.setContrasena(password);
        String ID = ("GT"+String.valueOf((int)(Math.random()*1000+1)));
        System.out.println("Su id es el siguiente: "+ID);
        gerente.setIdGerente(ID);       
        File archivo = new File("Gerente.dat");
        try {
            FileOutputStream fos = new FileOutputStream(archivo, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(gerente);
            oos.close();
            fos.close();
            
        } catch (Exception e) {
            System.out.println("Error");
        }        
    }
}
