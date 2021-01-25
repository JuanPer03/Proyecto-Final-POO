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
public class Login {

/**
 * Metodo main de todo el programa
 * @param args indica el inico de la ejecución
 */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        // El while será ejecutado hasta que salir sea TRUE.
        boolean salir = false;
        while (!salir) {   
            // Le indicamos al usuario cuales son sus opciones:
            System.out.println("Tienda de musica Shark DJ");
            System.out.println("Bienvenido");
            System.out.println("¿QUE TIPO DE USUARIO ES USTED?");
            System.out.println(" 1 - Gerente");
            System.out.println(" 2 - Vendedor");
            System.out.println(" 3 - Acomodador");
            System.out.println(" 0 - Salir ");
              
            // Obtenemos el numero ingresado por el usuario en la consola:
            int opcion = Integer.parseInt(entrada.nextLine());            
            switch (opcion) {
                case 1:
                    boolean exit = false;
                    do {                                                                    
                        Scanner op = new Scanner(System.in);
                        System.out.println("");
                        System.out.println("-----------");
                        System.out.println("INICIO DE SESION DE GERENTE");
                        System.out.println("¿Qué acción quiere hacer?");
                        System.out.println("1.-Entrar");
                        System.out.println("2.-Registrarse");
                        System.out.println("0.-Salir");
                        int opcion2 = Integer.parseInt(entrada.nextLine());
                        switch (opcion2) {
                            case 1:
                                LoginGerente a = new LoginGerente();
                                a.contraseña();
                                break;
                            case 2:
                                LoginGerente b = new LoginGerente();
                                b.crear();                            
                            break;                            
                            case 0:
                                exit = true;
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                throw new AssertionError();
                        }
                    } while (!exit);
                    break;
                case 2:
                     boolean exit2 = false;
                    do {                                                                    
                        Scanner op = new Scanner(System.in);
                        System.out.println("");
                        System.out.println("-----------");
                        System.out.println("INICIO DE SESION DE VENDEDOR");
                        System.out.println("¿Qué acción quiere hacer?");
                        System.out.println("1.-Entrar");
                        System.out.println("2.-Registrarse");
                        System.out.println("0.-Salir");
                        int opcion2 = Integer.parseInt(entrada.nextLine());
                        switch (opcion2) {
                            case 1:
                                LoginVendedor a = new LoginVendedor();
                                a.contraseña();
                                break;
                            case 2:
                                LoginVendedor b = new LoginVendedor();
                                b.crear();                            
                            break;                            
                            case 0:
                                exit2 = true;
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                throw new AssertionError();
                        }
                    } while (!exit2);                   
                    break;                   
                case 3:
                    boolean exit3 = false;
                    do {                                                                    
                        Scanner op3 = new Scanner(System.in);
                        System.out.println("");
                        System.out.println("-----------");
                        System.out.println("INICIO DE SESION DE ACOMODADOR");
                        System.out.println("¿Qué acción quiere hacer?");
                        System.out.println("1.-Entrar");
                        System.out.println("2.-Registrarse");
                        System.out.println("0.-Salir");
                        int opcion3 = Integer.parseInt(entrada.nextLine());
                        switch (opcion3) {
                            case 1:
                                LoginAcomodador a = new LoginAcomodador();
                                a.contraseña();
                                break;
                            case 2:
                                LoginAcomodador b = new LoginAcomodador();
                                b.crear();                            
                            break;                            
                            case 0:
                                exit3 = true;
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                throw new AssertionError();
                        }
                    } while (!exit3);
                    break;                   
                case 0:
                        salir = true;
                        System.out.println("Hasta pronto...");
                    break;                    
                default:
                    System.out.println("Opcion invalida");
                    throw new AssertionError();
        }
        }   

    }
}
