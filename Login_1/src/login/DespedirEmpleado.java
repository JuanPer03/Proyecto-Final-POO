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
public class DespedirEmpleado {
/**
 * Metodo despedir de la clase DespedirEmpleado del paquete login
 * Se encarga de permitir al gerente despedir un empleado eliminando su informacion correspondiente 
 * del archivo correspondiente
 */    
    void despedir(){
        Scanner entrada = new Scanner(System.in);                
        boolean salir = false;
        while(!salir) {                    
            System.out.println("¿A qué tipo de empledo quiere despedir?");
            System.out.println("1.-Vededor");
            System.out.println("2.-Acomodador");
            int opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion) {
                case 1:
                    ArrayList <Vendedor> temp = new ArrayList();
                    File archivo = new File("Vendedor.dat");                     
                    System.out.println("Escriba el id o el nombre del empleado a eliminar");
                    String user = entrada.nextLine();  
                    try {            
                    FileInputStream fis = new FileInputStream(archivo);
                    ObjectInputStream ois;
                    while (fis.available()>0) {
                        ois = new ObjectInputStream(fis);
                        Vendedor vendedor = (Vendedor) ois.readObject();
                        if (!(user.equals(vendedor.getNombre())||user.equals(vendedor.getIdVendedor()))){
                            temp.add(vendedor);
                        }                
                    }
                        fis.close();
                    } catch (Exception e) {
                        System.out.println("Error:");     
                    }
                    NevpV a = new NevpV();
                    a.borrar(temp);
                    System.out.println("Quiere Despedir a alguien más?");
                    System.out.println("1.-Si");
                    System.out.println("0.-No");
                    int s = Integer.parseInt(entrada.nextLine());
                    if (s==0){
                        salir = true;
                    }                    
                    break;
                case 2:
                    ArrayList <Acomodador> tempA = new ArrayList();
                    File archivoA = new File("Acomodador.dat");                                   
                    System.out.println("Escriba el id o nombre del empleado a eliminar");
                    String userA = entrada.nextLine();  
                    try {            
                    FileInputStream fis = new FileInputStream(archivoA);
                    ObjectInputStream ois;
                    while (fis.available()>0) {
                        ois = new ObjectInputStream(fis);
                        Acomodador acomodador = (Acomodador) ois.readObject();
                        if (!(userA.equals(acomodador.getNombre())||userA.equals(acomodador.getIdAcomodador()))){
                            tempA.add(acomodador);
                        }                
                    }
                        fis.close();
                    } catch (Exception e) {
                        System.out.println("Error:");     
                    }
                    NevpA a2 = new NevpA();
                    a2.borrar(tempA);
                    System.out.println("Quiere Despedir a alguien más?");
                    System.out.println("1.-Si");
                    System.out.println("0.-No");
                    int s1 = Integer.parseInt(entrada.nextLine());
                    if (s1==0){
                        salir = true;
                    }
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        }
    }
}
