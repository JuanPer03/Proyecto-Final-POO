package login;
import AparatosAmbiente.ReproduccionADA;
import Productos.CatalogoProductos;
import Productos.CrearAudifonos;
import Productos.CrearDiscoVideo;
import Productos.CrearDiscoMusica;
import Productos.VenderProductoVendedor;
import java.util.Scanner;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Poyecro final
 * Arrollo Chavarria Jose Luis
 * Barrera Guardia Francisco Mosies
 * Peralta Rodríguez Juan Manuel
 * Reséndiz Cruz Rodrigo Daniel
 */
public class VendedorControlador {
 /**
 * Metodo DC de la clase VendedorControlador del paquete login
 * Se encarga de mostrar los menus correspodientes a las diferentes actividades que un vendedor puede hacer
 * @param u es de tipo String y contiene el nombre del empleado que esta en el programa
 * @param n es de tipo String y contiene el nombre de un producto que se vendera
 */
    void BC(String u, String n){
        Scanner entrada = new Scanner(System.in);        
        // El while será ejecutado hasta que salir sea TRUE.
        boolean salir = false;
        while (!salir) {   
            // Le indicamos al usuario cuales son sus opciones:
            System.out.println("");
            System.out.println("-----------");
            System.out.println("bienvenido vendedor "+u+" !");
            System.out.println("¿Que quiere hacer hoy?");
            System.out.println("1.-Imprimir catalogo");
            System.out.println("2.-Agregar productos");
            System.out.println("3.-Reproducir discos");                
            System.out.println("4.-Modificar perfil");
            System.out.println("5.-Vender");
            System.out.println("0.-Salir");              
            // Obtenemos el numero ingresado por el usuario en la consola:
            int opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion) {
                case 1:
                    boolean salir1 = false;
                    while(!salir1){        
                    System.out.println("");
                    System.out.println("-----------");
                    System.out.println("¿Qué catalogo quieres consultar?");
                    System.out.println("1.-Empleados");
                    System.out.println("2.-Productos");
                    System.out.println("3.-Aparatos de ambiente");
                    System.out.println("0-Salir");
                    int choice = Integer.parseInt(entrada.nextLine());
                    switch (choice) {
                        case 1:
                            CatalogoEmpleados a = new CatalogoEmpleados();
                            a.CatalogoE();
                            break;
                        case 2:
                            CatalogoProductos x = new CatalogoProductos();
                            x.CatalogoP();
                            break;
                        case 3:
                            CatalogoAparatosDA z = new CatalogoAparatosDA();
                            z.CatalogoADA();
                            break;
                        case 0:
                            salir1 = true;
                            break;
                        default:
                            System.out.println("opcion invalida");
                    }
                    }
                    break;
                case 2:
                    boolean salir2 = false;
                    do{
                    System.out.println("");
                    System.out.println("-----------");
                    System.out.println("¿Que producto deseas agregar?");
                    System.out.println("1.-Audifonos");
                    System.out.println("2.-Disco de muscia");
                    System.out.println("3.-Disco de video");
                    System.out.println("0.-Salir");
                    int choice2 = Integer.parseInt(entrada.nextLine());
                    switch (choice2) {
                        case 1:
                            CrearAudifonos aud = new CrearAudifonos();
                            aud.crear();
                            break;
                        case 2:
                            CrearDiscoMusica cd = new CrearDiscoMusica();
                            cd.crear();
                            break;
                        case 3:
                            CrearDiscoVideo dvd = new CrearDiscoVideo();
                            dvd.crear();
                            break;
                        case 0:
                            salir2 = true;
                            break;
                        default:
                            System.out.println("Opcion invalida");
                    }
                    }while(!salir2);
                    break;
                case 3:
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
                case 4:
                    ModificarPerfil a = new ModificarPerfil();
                    a.modificarPerfilVendedor(u);
                    break;   
                case 5:
                    VenderProductoVendedor sale = new VenderProductoVendedor();
                    sale.venderP(n);                    
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
