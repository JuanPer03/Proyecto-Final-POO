package Productos;

import java.util.Scanner;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Poyecro final
 * Arrollo Chavarria Jose Luis
 * Barrera Guardia Francisco Mosies
 * Peralta Rodríguez Juan Manuel
 * Reséndiz Cruz Rodrigo Daniel
 */
public class CatalogoProductos {
/**
 * Metodo CatalogoP de la clase CatalogoProductos del paquete Productos
 * Se encarga de imprimir los diferentes productos (audifonos, discos de musica y discos de video)
 * existentes en la tienda
 */    
    public void CatalogoP(){
        Scanner entrada = new Scanner(System.in);                
        boolean salir = false;
        while (!salir) {   
            // Le indicamos al usuario cuales son sus opciones:
            System.out.println("");            
            System.out.println("¿Que tipo de producto quiere consultar?");
            System.out.println("1.-Audifonos");
            System.out.println("2.-Discos de muscia");
            System.out.println("3.-Discos de video");
            System.out.println("4.-Todos los poductos");                
            int opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("Audifonos en el inventario:");
                    ShowAudifonos a= new ShowAudifonos();
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
                    System.out.println("Discos de musica en el inventario:");
                    ShowDiscosMusica b = new ShowDiscosMusica();
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
                    System.out.println("Discos de video en el inventario:");
                    ShowDiscosVideo c = new ShowDiscosVideo();
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
                    ShowAudifonos all = new ShowAudifonos();
                    ShowDiscosMusica bll = new ShowDiscosMusica();                    
                    ShowDiscosVideo cll = new ShowDiscosVideo();
                    System.out.println("----------------------------------------");
                    System.out.println("Audifonos en el inventario:");
                    all.Show();
                    System.out.println("----------------------------------------");
                    System.out.println("Discos de musica en el inventario:");
                    bll.Show();
                    System.out.println("----------------------------------------");
                    System.out.println("Discos de video en el inventario:");
                    System.out.println("----------------------------------------");
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
