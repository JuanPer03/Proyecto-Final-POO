
package login;

import java.util.Scanner;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Poyecro final
 * Arrollo Chavarria Jose Luis
 * Barrera Guardia Francisco Mosies
 * Peralta Rodríguez Juan Manuel
 * Reséndiz Cruz Rodrigo Daniel
 */
public class CatalogoEmpleados {
 /**
 * Metodo CatalogoE de la clase CatalogoEmpleados del paquete login
 * Se encarga de imprimir los diferentes empleados (gerentes, vendedores y acomodadores)
 * existentes en la tienda
 */   
    void CatalogoE(){
        Scanner entrada = new Scanner(System.in);                
        boolean salir = false;
        while (!salir) {   
            // Le indicamos al usuario cuales son sus opciones:
            System.out.println("");            
            System.out.println("¿Que tipo de empleado quiere consultar?");
            System.out.println("1.-Gerentes");
            System.out.println("2.-Vendedores");
            System.out.println("3.-Acomodadores");
            System.out.println("4.-Todos los empleados");                
            int opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("Gerentes en la plantilla:");
                    ShowGerente a= new ShowGerente();
                    a.Show();
                    System.out.println("¿Quiere consultar otro catalogo?");
                    System.out.println("1.-Si");
                    System.out.println("0.-No");
                    int choice = Integer.parseInt(entrada.nextLine());
                    if (choice == 0){
                        salir = true;
                    }
                    break;
                case 2:                    
                    System.out.println("Vendedores en la plantilla:");
                    ShowVendedor b = new ShowVendedor();
                    b.Show();
                    System.out.println("¿Quiere consultar otro catalogo?");
                    System.out.println("1.-Si");
                    System.out.println("0.-No");
                    int choice2 = Integer.parseInt(entrada.nextLine());
                    if (choice2 == 0){
                        salir = true;
                    }                    
                    break;
                case 3:
                    System.out.println("Acomodadores en la plantilla:");
                    ShowAcomodador c = new ShowAcomodador();
                    c.Show();
                    System.out.println("¿Quiere consultar otro catalogo?");
                    System.out.println("1.-Si");
                    System.out.println("0.-No");
                    int choice3 = Integer.parseInt(entrada.nextLine());
                    if (choice3 == 0){
                        salir = true;
                    }                    
                    break;
                case 4:
                    System.out.println("Todos los empleados en la plantilla");
                    ShowGerente all = new ShowGerente();
                    ShowVendedor bll = new ShowVendedor();                    
                    ShowAcomodador cll = new ShowAcomodador();
                    System.out.println("----------------------------------------");
                    System.out.println("Gerentes en la plantilla:");
                    all.Show();
                    System.out.println("----------------------------------------");
                    System.out.println("Vendedores en la plantilla:");
                    bll.Show();
                    System.out.println("----------------------------------------");
                    System.out.println("Acomodadores en la plantilla:");
                    cll.Show();
                    System.out.println("-----------");
                    System.out.println("¿Quiere consultar otro catalogo?");
                    System.out.println("1.-Si");
                    System.out.println("0.-No");
                    int choice4 = Integer.parseInt(entrada.nextLine());
                    if (choice4 == 0){
                        salir = true;
                    }                    
                    break;                    
                default:
                    System.out.println("Opción invalida");
            }
        }
    }
}
