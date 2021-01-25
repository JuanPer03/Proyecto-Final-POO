package Productos;
import java.io.File;
import java.io.FileOutputStream;
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
public class CrearDiscoVideo {
/**
 * Metodo crear de la clase CrearDiscoVideo del paquete Productos
 * Se encarga de crear un nuevo producto de tipo Disco de video solicitando
 * su nombre, artista, numero de canciones, duracion del disco, precio y asignando un ID aleatorio 
 * para guardar los datos en un archivo
 */    
    public void crear(){
        DiscosVideo dvd = new DiscosVideo();
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Ingrese el nombre del DVD.");
        String name = entrada.nextLine();
        dvd.setNombre(name);
        System.out.println("Ingrese el noombre del artista del DVD.");
        String art = entrada.nextLine();
        dvd.setArtista(art);
        System.out.println("Ingrese el numero de canciones del DVD.");
        int num = entrada.nextInt();
        dvd.setNumCanciones(num);
        System.out.println("Ingrese la duracion en horas del DVD.");
        float dur = entrada.nextFloat();
        dvd.setDuracion(dur);
        System.out.println("Ingrese el precio del DVD en pesos mexicanos (NUMEROS ENTEROS).");
        int moni = entrada.nextInt();
        dvd.setPrecio(moni);
        String ID = ("DV"+String.valueOf((int)(Math.random()*1000+1)));
        System.out.println("Codigo del DVD: "+ID+".");
        dvd.setCodigo(ID);       
        File archivo = new File("DiscosVideo.dat");
        try {
            FileOutputStream fos = new FileOutputStream(archivo, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dvd);
            oos.close();
            fos.close();
            
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
