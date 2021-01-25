package login;
import AparatosAmbiente.CrearMusicPlayer;
import AparatosAmbiente.CrearVideoPlayer;
import AparatosAmbiente.EliminarADA;
import AparatosAmbiente.ModificarADA;
import AparatosAmbiente.ReproduccionADA;
import Productos.CatalogoProductos;
import Productos.CrearAudifonos;
import Productos.CrearDiscoVideo;
import Productos.CrearDiscoMusica;
import Productos.EliminarProducto;
import Productos.ModificarProducto;
import Productos.VenderProducto;
import java.util.Scanner;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Poyecro final
 * Arrollo Chavarria Jose Luis
 * Barrera Guardia Francisco Mosies
 * Peralta Rodríguez Juan Manuel
 * Reséndiz Cruz Rodrigo Daniel
 */
public class GerenteControlador {
/**
 * Metodo DC de la clase GerenteControlador del paquete login
 * Se encarga de mostrar los menus correspodientes a las diferentes actividades que un gerente puede hacer
 * @param u es de tipo String y contiene el nombre del empleado que esta en el programa
 * @param n es de tipo String y contiene el nombre de un producto que se vendera
 */    
    void AC(String u, String n){
        Scanner entrada = new Scanner(System.in);                
        boolean salir = false;
        while (!salir) {   
            // Le indicamos al usuario cuales son sus opciones:
            System.out.println("");
            System.out.println("-----------");
            System.out.println("bienvenido gerente "+u+" !");
            System.out.println("¿Que quiere hacer hoy?");
            System.out.println("1.-Imprimir catalogo");
            System.out.println("2.-Gestionar productos");
            System.out.println("3.-Gestion de aparatos de ambiente");
            System.out.println("4.-Despedir empleado");                
            System.out.println("5.-Modificar perfil");
            System.out.println("6.-Vender");
            System.out.println("7.- Reproducir Discos");
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
                    do {
                    System.out.println("");
                    System.out.println("-----------");
                    System.out.println("¿Que accion desea realizar");
                    System.out.println("1.-Agregar un producto");
                    System.out.println("2.-Modificar un producto");
                    System.out.println("3.-Eliminar un producto");
                    System.out.println("0.-Salir");
                    int choice2 = Integer.parseInt(entrada.nextLine());
                    switch (choice2) {
                        case 1:
                            int res=0;
                            do{
                                System.out.println("¿Que producto deseas agregar?");
                                System.out.println("1.-Audifonos");
                                System.out.println("2.-Disco de muscia");
                                System.out.println("3.-Disco de video");
                                System.out.println("4.-Regresar");
                                int choice3 = Integer.parseInt(entrada.nextLine());
                                switch (choice3){
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
                                    case 4:
                                        res=4;
                                        break;
                                    default:
                                        System.out.println("OPCION INVALIDA");
                                }
                            }while(res!=4);
                            break;
                        case 2:
                            int res2=0;
                            do{
                                System.out.println("¿Que producto deseas modificar?");
                                System.out.println("1.-Audifonos");
                                System.out.println("2.-Disco de muscia");
                                System.out.println("3.-Disco de video");
                                System.out.println("4.-Regresar");
                                int choice3 = Integer.parseInt(entrada.nextLine());
                                switch (choice3){
                                    case 1:
                                        System.out.println("Ingresa el nombre o el ID de los audifonos a modificar.");
                                        String value = entrada.nextLine();
                                        ModificarProducto aud = new ModificarProducto();
                                        aud.modificarAudifonos(value);
                                        break;
                                    case 2:
                                        System.out.println("Ingresa el nombre o el ID del disco de musica a modificar.");
                                        String value2 = entrada.nextLine();
                                        ModificarProducto cd = new ModificarProducto();
                                        cd.modificarDiscoMusica(value2);
                                        break;
                                    case 3:
                                        System.out.println("Ingresa el nombre o el ID del disco de video a modificar.");
                                        String value3 = entrada.nextLine();
                                        ModificarProducto dvd = new ModificarProducto();
                                        dvd.modificarDicoVideo(value3);
                                        break;
                                    case 4:
                                        res2=4;
                                        break;
                                    default:
                                        System.out.println("OPCION INVALIDA");
                                }
                            }while (res2!=4);
                            break;
                        case 3:
                            EliminarProducto z = new EliminarProducto();
                            z.eliminar();
                            break;
                        case 0:
                            salir2 = true;
                            break;
                        default:
                            System.out.println("opcion invalida");
                    }
                    } while (!salir2);
                    
                    break;
                case 3:
                    boolean salir3 = false;
                    do{
                    System.out.println("¿Que quiere hacer?");
                    System.out.println("1.-Crear un aparato de ambiente");
                    System.out.println("2.-Modificar un aparato de ambiente");
                    System.out.println("3.-Borrar un aparato de ambiente"); 
                    System.out.println("0.-Salir");
                     int opcion3 = Integer.parseInt(entrada.nextLine());
                     switch (opcion3) {
                        case 1:
                            System.out.println("¿Que aparato quiere crear?");
                            System.out.println("1.-VideoPlayer");
                            System.out.println("2.-MusicPlayer");
                            int opcion3b = Integer.parseInt(entrada.nextLine());
                            switch (opcion3b) {
                                case 1:
                                    CrearVideoPlayer vp = new CrearVideoPlayer();
                                    vp.crear();
                                    break;
                                case 2:
                                    CrearMusicPlayer mp = new CrearMusicPlayer();
                                    mp.crear();
                                    break;
                                default:
                                    System.out.println("opcion invalida");
                            }
                            break;
                        case 2:
                            System.out.println("¿Qué tipo de aparato quiere Modificar?");
                            System.out.println("1.-MusicPlayer");
                            System.out.println("2.-VideoPlayer");
                            System.out.println("3.-Salir");
                            int opcion3c = Integer.parseInt(entrada.nextLine());
                            switch (opcion3c) {
                                case 1:
                                    ModificarADA mp2 = new ModificarADA();                                   
                                    mp2.ModificarMP();
                                    break;
                                case 2:
                                    ModificarADA vp2 = new ModificarADA();                                   
                                    vp2.ModificarVP();                                   
                                    break;
                                case 3:
                                    salir=true;
                                    break;
                                default:
                                    System.out.println("opcion invalida");
                            }

                            break;
                        case 3:
                            EliminarADA eVP = new EliminarADA();
                            eVP.eliminar();
                        case 0:
                            salir3 = true;
                            break;
                        default:
                            System.out.println("opcion invalida");
                    }
                    }while(!salir3); 
                    break;
                case 4:
                    DespedirEmpleado e = new DespedirEmpleado();
                    e.despedir();
                    break;   
                case 5:
                    ModificarPerfil a = new ModificarPerfil();
                    a.modificarPerfilGerente(u);
                    break;
                case 6:
                    VenderProducto sale = new VenderProducto();
                    sale.venderP(n);
                    break;
                case 7:
                    boolean salir7 = false;
                    do{
                        System.out.println("¿Cual aparato quiere usar?");
                        System.out.println("1.-VideoPlayer");
                        System.out.println("2.-MusicPlayer");
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
                            case 0:
                                salir7 = true;
                                break;
                            default:
                                System.out.println("opcion invalida");
                        }                        
                    }while (!salir7);
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
