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
public class CrearDiscoMusica {
/**
 * Metodo crear de la clase CrearDiscoMusica del paquete Productos
 * Se encarga de crear un nuevo producto de tipo Disco de musica solicitando
 * su nombre, artista, numero de canciones, nombre de las canciones, duracion de las canciones "en minutos",
 * precio y asignando un ID aleatorio para guardar los datos en un archivo
 */    
    public void crear(){
        DiscosMusica cd = new DiscosMusica();
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Ingrese el nombre del CD.");
        String name = entrada.nextLine();
        cd.setNombre(name);
        System.out.println("Ingrese el noombre del artista del CD.");
        String art = entrada.nextLine();
        cd.setArtista(art);
        System.out.println("Ingrese el numero de canciones del Cd.");
        int num = entrada.nextInt();
        cd.setNumCanciones(num);
        String nombres[] = new String[num];
        float[] duracion = new float[num];
        entrada.nextLine();
        for (int i=0;i<num;i++){
            System.out.println("Ingresa el nombre de la cancion #"+(i+1)+".");
            String nc=entrada.nextLine();
            nombres[i]=nc;
        }         
        for (int j=0;j<num;j++){            
            System.out.println("Ingresa la duracion en minutos de la cancion #"+(j+1)+".");
            float dc = entrada.nextFloat();
            duracion[j]= dc;
        }
        cd.setNombresCanciones(nombres);
        cd.setDuracionCanciones(duracion);
        System.out.println("Ingrese el precio del CD en pesos mexicanos (NUMEROS ENTEROS).");
        int moni = entrada.nextInt();
        cd.setPrecio(moni);
        String ID = ("CD"+String.valueOf((int)(Math.random()*1000+1)));
        System.out.println("Codigo del CD: "+ID+".");
        cd.setCodigo(ID);       
        File archivo = new File("DiscosMusica.dat");
        try {
            FileOutputStream fos = new FileOutputStream(archivo, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(cd);
            oos.close();
            fos.close();
            
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
