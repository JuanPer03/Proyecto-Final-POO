package login;
import AparatosAmbiente.ReproduccionADA;
import Productos.CatalogoProductos;
import java.util.Scanner;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Poyecro final
 * Arrollo Chavarria Jose Luis
 * Barrera Guardia Francisco Mosies
 * Peralta Rodríguez Juan Manuel
 * Reséndiz Cruz Rodrigo Daniel
 */
public class AcomodadorControlador {
/**
 * Metodo DC de la clase AcomodadorControlador del paquete login
 * Se encarga de mostrar los menus correspodientes a las diferentes actividades que un acomodador puede hacer
 * @param u es de tipo String y contiene el nombre del empleado que esta en el programa
 */    
    void DC(String u){
        Scanner entrada = new Scanner(System.in);        
        // El while será ejecutado hasta que salir sea TRUE.
        boolean salir = false;
        while (!salir) {   
            // Le indicamos al usuario cuales son sus opciones:
            System.out.println("");
            System.out.println("-----------");
            System.out.println("bienvenido acomodador"+u+" !");
            System.out.println("¿Que quiere hacer hoy?");
            System.out.println("1.-Imprimir catalogo");
            System.out.println("2.-Reproducir Discos");                
            System.out.println("3.-Modificar perfil");
            System.out.println("0.-Salir");              
            // Obtenemos el numero ingresado por el usuario en la consola:
            int opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("");
                    System.out.println("-----------");
                    System.out.println("¿Qué catalogo quieres consultar?");
                    System.out.println("1.-Empleados");
                    System.out.println("2.-Productos");
                    System.out.println("3.-Aparatos de ambiente");
                    int choice = Integer.parseInt(entrada.nextLine());
                    switch (choice) {
                        case 1:
                            CatalogoEmpleados a = new CatalogoEmpleados();
                            a.CatalogoE();
                            break;
                        case 2:
                            CatalogoProductos x = new CatalogoProductos();
                            x.CatalogoP();
                        case 3:
                            CatalogoAparatosDA z = new CatalogoAparatosDA();
                            z.CatalogoADA();
                            break;
                        default:
                            System.out.println("opcion invalida");
                    }
                    break;
                case 2:
                    boolean salir7 = false;
                    do{
                        System.out.println("¿Cual aparato quiere usar?");
                        System.out.println("1.-MusicPlayer");
                        System.out.println("2.-VideoPlayer");
                        System.out.println("0.-Salir");
                        int opcion7 = Integer.parseInt(entrada.nextLine());
                        switch (opcion7) {
                            case 1:
                                 ReproduccionADA rep = new ReproduccionADA();
                                 rep.playVp();  
                                break;
                            case 2:
                                ReproduccionADA rep2 = new ReproduccionADA();
                                rep2.playMS();
                                break;
                            case 3:
                                salir = true;
                                break;
                            default:
                                System.out.println("opcion invalida");
                        }                        
                    }while (!salir7);
                    break;
                case 3:
                    ModificarPerfil a = new ModificarPerfil();
                    a.modificarPerfilAcomodador(u);
                    break;                    
                case 0:
                    salir = true;                    
                    break;                    
                default:
                    System.out.println("opcion invalida");                    
            }
        }
    }
}
