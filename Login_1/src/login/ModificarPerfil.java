package login;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Poyecro final
 * Arrollo Chavarria Jose Luis
 * Barrera Guardia Francisco Mosies
 * Peralta Rodríguez Juan Manuel
 * Reséndiz Cruz Rodrigo Daniel
 */
public class ModificarPerfil {
/**
 * Metodo modificarPerfilGerente de la clase ModificarPerfil del paquete login
 * Tiene la funcion de modificr los datos de un empleado de tipo Gerente
 * @param u es de tipo String y es utilizado para localizar al objeto dentro de las funciones
 */    
    void modificarPerfilGerente(String u){  
        ArrayList <Gerente> temp = new ArrayList();
        File archivo = new File("Gerente.dat");
        boolean correcto = false;            
        String user = u;       
        try {            
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois;
            while (fis.available()>0) {
            ois = new ObjectInputStream(fis);
            Gerente gerente = (Gerente) ois.readObject();
            if (!user.equals(gerente.getUsuario())){
                temp.add(gerente);
            }
            if (user.equals(gerente.getUsuario())) {
                Scanner entrada2 = new Scanner(System.in);
                do{
                    System.out.println("¿Que quiere modificar?");
                    System.out.println("1.-Nombre");
                    System.out.println("2.-Usuario");
                    System.out.println("3.-Contraseña");
                    int option = Integer.parseInt(entrada2.nextLine());
                    switch (option) {
                    case 1:
                        System.out.println("ingrese el nuevo nombre");
                        String newName = entrada2.nextLine();
                        gerente.setNombre(newName);                        
                        System.out.println("Nombre modificado exitosamente");
                            System.out.println("¿Quiere modificar otro campo?");
                            System.out.println("1.- si");
                            System.out.println("0.- no");
                            int op = Integer.parseInt(entrada2.nextLine());
                            if (op == 0) {
                                correcto = true;
                            }
                        break;
                    case 2:
                        System.out.println("ingrese el nuevo nombre de usuario");
                        String newUser = entrada2.nextLine();
                        gerente.setUsuario(newUser);
                        System.out.println("Nombre de usuario modificado exitosamente");
                            System.out.println("¿Quiere modificar otro campo?");
                            System.out.println("1.- si");
                            System.out.println("0.- no");
                            int opu = Integer.parseInt(entrada2.nextLine());
                            if (opu == 0) {
                                correcto = true;
                            }
                        break;
                    case 3:
                       System.out.println("ingrese la nueva contraseña");
                       String newPassword = entrada2.nextLine();
                       gerente.setContrasena(newPassword);
                       System.out.println("Contraseña modificada exitosamente");
                            System.out.println("¿Quiere modificar otro campo?");
                            System.out.println("1.- si");
                            System.out.println("0.- no");
                            int opc = Integer.parseInt(entrada2.nextLine());                       
                            if (opc == 0) {
                                correcto = true;
                            }
                       break;                                
                    default:
                        System.out.println("opción invalida");
                        throw new AssertionError();
                    }
                        }while(!correcto); 
                        temp.add(gerente);
                    }                
                }
                fis.close();
            } catch (Exception e) {
                System.out.println("Error:");     
            }
        Nevp a = new Nevp();
        a.borrar(temp);
    }
 /**
 * Metodo modificarPerfilVendedor de la clase ModificarPerfil del paquete login
 * Tiene la funcion de modificr los datos de un empleado de tipo Vendedor
 * @param u es de tipo String y es utilizado para localizar al objeto dentro de las funciones
 */   
    void modificarPerfilVendedor(String u){
        ArrayList <Vendedor> temp = new ArrayList();
        File archivo = new File("Vendedor.dat");
        boolean correcto = false;            
        String user = u;       
        try {            
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois;
            while (fis.available()>0) {
            ois = new ObjectInputStream(fis);
            Vendedor vendedor = (Vendedor) ois.readObject();
            if (!user.equals(vendedor.getUsuario())){
                temp.add(vendedor);
            }
            if (user.equals(vendedor.getUsuario())) {
                Scanner entrada2 = new Scanner(System.in);
                do{
                    System.out.println("¿Que quiere modificar?");
                    System.out.println("1.-Nombre");
                    System.out.println("2.-Usuario");
                    System.out.println("3.-Contraseña");
                    int option = Integer.parseInt(entrada2.nextLine());
                    switch (option) {
                    case 1:
                        System.out.println("ingrese el nuevo nombre");
                        String newName = entrada2.nextLine();
                        vendedor.setNombre(newName);                        
                        System.out.println("Nombre modificado exitosamente");
                            System.out.println("¿Quiere modificar otro campo?");
                            System.out.println("1.- si");
                            System.out.println("0.- no");
                            int op = Integer.parseInt(entrada2.nextLine());
                            if (op == 0) {
                                correcto = true;
                            }
                        break;
                    case 2:
                        System.out.println("ingrese el nuevo nombre de usuario");
                        String newUser = entrada2.nextLine();
                        vendedor.setUsuario(newUser);
                        System.out.println("Nombre de usuario modificado exitosamente");
                            System.out.println("¿Quiere modificar otro campo?");
                            System.out.println("1.- si");
                            System.out.println("0.- no");
                            int opu = Integer.parseInt(entrada2.nextLine());
                            if (opu == 0) {
                                correcto = true;
                            }
                        break;
                    case 3:
                       System.out.println("ingrese la nueva contraseña");
                       String newPassword = entrada2.nextLine();
                       vendedor.setContrasena(newPassword);
                       System.out.println("Contraseña modificada exitosamente");
                            System.out.println("¿Quiere modificar otro campo?");
                            System.out.println("1.- si");
                            System.out.println("0.- no");
                            int opc = Integer.parseInt(entrada2.nextLine());                       
                            if (opc == 0) {
                                correcto = true;
                            }
                       break;                                
                    default:
                        System.out.println("opción invalida");                      
                    }
                        }while(!correcto); 
                        temp.add(vendedor);
                    }                
                }
                fis.close();
            } catch (Exception e) {
                System.out.println("Error:");     
            }
        NevpV a = new NevpV();
        a.borrar(temp);
    }
/**
 * Metodo modificarPerfilAcomodador de la clase ModificarPerfil del paquete login
 * Tiene la funcion de modificr los datos de un empleado de tipo Acomodador
 * @param u es de tipo String y es utilizado para localizar al objeto dentro de las funciones
 */    
    void modificarPerfilAcomodador(String u){
        ArrayList <Acomodador> temp = new ArrayList();
        File archivo = new File("Acomodador.dat");
        boolean correcto = false;            
        String user = u;       
        try {            
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois;
            while (fis.available()>0) {
            ois = new ObjectInputStream(fis);
            Acomodador acomodador = (Acomodador) ois.readObject();
            if (!user.equals(acomodador.getUsuario())){
                temp.add(acomodador);
            }
            if (user.equals(acomodador.getUsuario())) {
                Scanner entrada2 = new Scanner(System.in);
                do{
                    System.out.println("¿Que quiere modificar?");
                    System.out.println("1.-Nombre");
                    System.out.println("2.-Usuario");
                    System.out.println("3.-Contraseña");
                    int option = Integer.parseInt(entrada2.nextLine());
                    switch (option) {
                    case 1:
                        System.out.println("ingrese el nuevo nombre");
                        String newName = entrada2.nextLine();
                        acomodador.setNombre(newName);                        
                        System.out.println("Nombre modificado exitosamente");
                            System.out.println("¿Quiere modificar otro campo?");
                            System.out.println("1.- si");
                            System.out.println("0.- no");
                            int op = Integer.parseInt(entrada2.nextLine());
                            if (op == 0) {
                                correcto = true;
                            }
                        break;
                    case 2:
                        System.out.println("ingrese el nuevo nombre de usuario");
                        String newUser = entrada2.nextLine();
                        acomodador.setUsuario(newUser);
                        System.out.println("Nombre de usuario modificado exitosamente");
                            System.out.println("¿Quiere modificar otro campo?");
                            System.out.println("1.- si");
                            System.out.println("0.- no");
                            int opu = Integer.parseInt(entrada2.nextLine());
                            if (opu == 0) {
                                correcto = true;
                            }
                        break;
                    case 3:
                       System.out.println("ingrese la nueva contraseña");
                       String newPassword = entrada2.nextLine();
                       acomodador.setContrasena(newPassword);
                       System.out.println("Contraseña modificada exitosamente");
                            System.out.println("¿Quiere modificar otro campo?");
                            System.out.println("1.- si");
                            System.out.println("0.- no");
                            int opc = Integer.parseInt(entrada2.nextLine());                       
                            if (opc == 0) {
                                correcto = true;
                            }
                       break;                                
                    default:
                        System.out.println("opción invalida");                       
                    }
                        }while(!correcto); 
                        temp.add(acomodador);
                    }                
                }
                fis.close();
            } catch (Exception e) {
                System.out.println("Error:");     
            }
        NevpA a = new NevpA();
        a.borrar(temp);
    }
}
