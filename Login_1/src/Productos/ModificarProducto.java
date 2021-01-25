package Productos;
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
public class ModificarProducto {
/**
 * Metodo modificarAudifonos de la clase ModificarProducto del paquete Productos
 * Tiene la funcion de modificr los datos de un producto de tipo Audifonos
 * @param u es de tipo String y es utilizado para localizar al objeto dentro de las funciones
 */    
    public void modificarAudifonos(String u){  
        ArrayList <Audifonos> temp = new ArrayList();
        File archivo = new File("Audifonos.dat");
        boolean correcto = false;            
        String audifono = u;       
        try {            
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois;
            while (fis.available()>0) {
            ois = new ObjectInputStream(fis);
            Audifonos aud = (Audifonos) ois.readObject();
            if (!(audifono.equals(aud.getNombre())||audifono.equals(aud.getCodigo()))){
                temp.add(aud);
            }
            if (audifono.equals(aud.getNombre())||audifono.equals(aud.getCodigo())) {
                Scanner entrada2 = new Scanner(System.in);
                do{
                    System.out.println("¿Que quiere modificar?");
                    System.out.println("1.-Nombre");
                    System.out.println("2.-Marca");
                    System.out.println("3.-Precio");
                    int option = Integer.parseInt(entrada2.nextLine());
                    switch (option) {
                    case 1:
                        System.out.println("ingrese el nuevo nombre");
                        String newName = entrada2.nextLine();
                        aud.setNombre(newName);
                        System.out.println("Nombre modificado exitosamente");
                        System.out.println(aud);
                            System.out.println("¿Quiere modificar otro campo?");
                            System.out.println("1.- si");
                            System.out.println("0.- no");
                            int op = Integer.parseInt(entrada2.nextLine());
                            if (op == 0) {
                                correcto = true;
                            }
                        break;
                    case 2:
                        System.out.println("ingrese la nuevo marca");
                        String newMarca = entrada2.nextLine();
                        aud.setMarca(newMarca);
                        System.out.println("Marca modificado exitosamente");
                            System.out.println("¿Quiere modificar otro campo?");
                            System.out.println("1.- si");
                            System.out.println("0.- no");
                            int opu = Integer.parseInt(entrada2.nextLine());
                            if (opu == 0) {
                                correcto = true;
                            }
                        break;
                    case 3:
                       System.out.println("ingrese el nuevo precio");
                       int newPrecio = entrada2.nextInt();
                       aud.setPrecio(newPrecio);
                       System.out.println("Precio modificado exitosamente");
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
                        temp.add(aud);
                    }                
                }
                fis.close();
            } catch (Exception e) {
                System.out.println("Error:");     
            }
        NevA a = new NevA();
        a.borrar(temp);
    }
/**
 * Metodo modificarDiscoVideo de la clase ModificarProducto del paquete Productos
 * Tiene la funcion de modificr los datos de un producto de tipo Disco de video
 * @param u es de tipo String y es utilizado para localizar al objeto dentro de las funciones
 */    
    public void modificarDicoVideo(String u){
        ArrayList <DiscosVideo> temp = new ArrayList();
        File archivo = new File("DiscosVideo.dat");
        boolean correcto = false;            
        String video = u;       
        try {            
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois;
            while (fis.available()>0) {
            ois = new ObjectInputStream(fis);
            DiscosVideo dvd = (DiscosVideo) ois.readObject();
            if (!(video.equals(dvd.getNombre())||video.equals(dvd.getCodigo()))){
                temp.add(dvd);
            }
            if (video.equals(dvd.getNombre())||video.equals(dvd.getCodigo())) {
                Scanner entrada2 = new Scanner(System.in);
                do{
                    System.out.println("¿Que quiere modificar?");
                    System.out.println("1.-Nombre");
                    System.out.println("2.-Artista");
                    System.out.println("3.-Precio");
                    int option = Integer.parseInt(entrada2.nextLine());
                    switch (option) {
                    case 1:
                        System.out.println("ingrese el nuevo nombre");
                        String newName = entrada2.nextLine();
                        dvd.setNombre(newName);
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
                        System.out.println("ingrese el nuevo Artista del disco");
                        String newArtista = entrada2.nextLine();
                        dvd.setArtista(newArtista);
                        System.out.println("Nombre del artista modificado exitosamente");
                            System.out.println("¿Quiere modificar otro campo?");
                            System.out.println("1.- si");
                            System.out.println("0.- no");
                            int opu = Integer.parseInt(entrada2.nextLine());
                            if (opu == 0) {
                                correcto = true;
                            }
                        break;
                    case 3:
                       System.out.println("ingrese El nuevo precio del disco");
                       int newPrecio = entrada2.nextInt();
                       dvd.setPrecio(newPrecio);
                       System.out.println("Precio modificado exitosamente");
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
                        temp.add(dvd);
                    }                
                }
                fis.close();
            } catch (Exception e) {
                System.out.println("Error:");     
            }
        NevDV a = new NevDV();
        a.borrar(temp);
    }
/**
 * Metodo modificarDiscoMusica de la clase ModificarProducto del paquete Productos
 * Tiene la funcion de modificr los datos de un producto de tipo Disco de musica
 * @param u es de tipo String y es utilizado para localizar al objeto dentro de las funciones
 */    
    public void modificarDiscoMusica(String u){
        ArrayList <DiscosMusica> temp = new ArrayList();
        File archivo = new File("DiscosMusica.dat");
        boolean correcto = false;            
        String musica = u;       
        try {            
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois;
            while (fis.available()>0) {
            ois = new ObjectInputStream(fis);
            DiscosMusica cd = (DiscosMusica) ois.readObject();
            if (!(musica.equals(cd.getNombre())||musica.equals(cd.getCodigo()))){
                temp.add(cd);
            }
            if (musica.equals(cd.getNombre())||musica.equals(cd.getCodigo())) {
                Scanner entrada2 = new Scanner(System.in);
                do{
                    System.out.println("¿Que quiere modificar?");
                    System.out.println("1.-Nombre");
                    System.out.println("2.-Artista");
                    System.out.println("3.-Precio");
                    int option = Integer.parseInt(entrada2.nextLine());
                    switch (option) {
                    case 1:
                        System.out.println("ingrese el nuevo nombre");
                        String newName = entrada2.nextLine();
                        cd.setNombre(newName);
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
                        System.out.println("ingrese el nuevo Artista");
                        String newArtista = entrada2.nextLine();
                        cd.setArtista(newArtista);
                        System.out.println("Nombre de artsita modificado exitosamente");
                            System.out.println("¿Quiere modificar otro campo?");
                            System.out.println("1.- si");
                            System.out.println("0.- no");
                            int opu = Integer.parseInt(entrada2.nextLine());
                            if (opu == 0) {
                                correcto = true;
                            }
                        break;
                    case 3:
                       System.out.println("ingrese el nuevo precio");
                       int newPrecio = entrada2.nextInt();
                       cd.setPrecio(newPrecio);
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
                        temp.add(cd);
                    }                
                }
                fis.close();
            } catch (Exception e) {
                System.out.println("Error:");     
            }
        NevDM a = new NevDM();
        a.borrar(temp);
    }
}
