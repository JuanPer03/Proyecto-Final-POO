
package AparatosAmbiente;

import Productos.DiscosMusica;
import Productos.DiscosVideo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
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
public class CrearVideoPlayer {
/**
 * Método crear de la clase CrearVideoPlayer
 * la cual crea un nuevo aparato de ambiente VideoPLayer
 */
    public void crear(){
        VideoPlayer VIDP = new VideoPlayer();
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Ingrese el nombre del aparato de ambiente.");
        String name = entrada.nextLine();
        VIDP.setNombre(name);
        String ID = ("VP"+String.valueOf((int)(Math.random()*1000+1)));
        System.out.println("Codigo del aparato de ambiente: "+ID+".");
        VIDP.setIdVideoPlayer(ID);
        System.out.println("¿Qué va a reproducir el aparato?");
        System.out.println("1.-Disco de musica");
        System.out.println("2.-Disco de video");
        int opcion = Integer.parseInt(entrada.nextLine());
        switch (opcion) {
            case 1:
                System.out.println("ingrese el nombre o id del disco de musica a agregar");
                String disco = entrada.nextLine();
                File archivo = new File("DiscosMusica.dat");
                    try {            
                    FileInputStream fis = new FileInputStream(archivo);
                    ObjectInputStream ois;
                    while (fis.available()>0) {
                        ois = new ObjectInputStream(fis);
                        DiscosMusica disc = (DiscosMusica) ois.readObject();
                        System.out.println(disc);
                        if ((disco.equals(disc.getNombre()) ||disco.equals(disc.getCodigo()))){
                            VIDP.setA(disc);
                            VIDP.setB(null);
                        }                
                    }
                        fis.close();
                    } catch (Exception e) {
                        System.out.println("Error:");     
                    }
                break;
            case 2:
                System.out.println("ingrese el nombre o id del disco de video a agregar");
                String discoV = entrada.nextLine();
                File archivoV = new File("DiscosVideo.dat");
                    try {            
                    FileInputStream fis = new FileInputStream(archivoV);
                    ObjectInputStream ois;
                    while (fis.available()>0) {
                        ois = new ObjectInputStream(fis);
                        DiscosVideo disc = (DiscosVideo) ois.readObject();
                        System.out.println(disc);
                        if ((discoV.equals(disc.getNombre()) ||discoV.equals(disc.getCodigo()))){
                            VIDP.setA(null);
                            VIDP.setB(disc);
                        }                
                    }
                        fis.close();
                    } catch (Exception e) {
                        System.out.println("Error:");     
                    }           
                break;
            default:
                throw new AssertionError();
        }
        File archivo = new File("VideosPlayer.dat");
        try {
            FileOutputStream fos = new FileOutputStream(archivo, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(VIDP);
            oos.close();
            fos.close();
            
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

