package AparatosAmbiente;

import Productos.DiscosMusica;
import Productos.DiscosVideo;
import java.io.Serializable;
import java.util.Scanner;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Poyecro final
 * Arrollo Chavarria Jose Luis
 * Barrera Guardia Francisco Mosies
 * Peralta Rodríguez Juan Manuel
 * Reséndiz Cruz Rodrigo Daniel
 */
public class VideoPlayer extends AparatosDeAmbiente implements Serializable {
    String idVideoPlayer;
    DiscosMusica a = new DiscosMusica();
    DiscosVideo b = new DiscosVideo();
/**
 * Método GetIdVideoPLayer el cual devuelve
 * el id del aparato de ambiente solicitado
 * @return idVideoPLayer
 */
    public String getIdVideoPlayer() {
        return idVideoPlayer;
    }
/**
 * Método setIdVideoPlayer  el cual se encarga 
 * de asignar un nuevo id
 * @param idVideoPlayer 
 */
    public void setIdVideoPlayer(String idVideoPlayer) {
        this.idVideoPlayer = idVideoPlayer;
    }
/**
 * Constructor DiscosMusica que alberga el disco 
 * de musica asociado al aparato
 * @return a
 */
    public DiscosMusica getA() {
        return a;
    }
/**
 * Método setA el cual asigna un objeto de tipo
 * MusicPlayer a dicho atributo
 * @param a referente al disco de musica
 */
    public void setA(DiscosMusica a) {
        this.a = a;
    }
/**
 * Método DiscosVideo el cual devuelve el VideoPlayer
 * asociado a dicho aparato de ambiente
 * @return b
 */
    public DiscosVideo getB() {
        return b;
    }
/**
 * Método setB que nos permite asignar un objeto de 
 * tipo VideoPlayer como un atributo del aparato de ambiente
 * @param b  referente al VideoPlayer
 */
    public void setB(DiscosVideo b) {
        this.b = b;
    }
/**
 * Método toString() que se encarga de imprimir la informacion
 * del VideoPlayer en consola.
 * @return 
 */
    @Override
    public String toString() {
        return super.toString()+" idVideoPlayer=" + idVideoPlayer + ", a=" + a + ", b=" + b;
    }
/**
 * Método tocarM para reproducir el disco de 
 * musica asociado a el aparato de ambiente
 */    
    void tocarM(){
       boolean salir = false; 
        String usar = null;
        Scanner entrada = new Scanner(System.in);
        String[] nombres = a.getNombresCanciones();
        System.out.println("Las canciones que tiene el disco son las siguientes:");
        for (int i = 0; i < a.getNumCanciones(); i++) {
            System.out.println(nombres[i]);
        }
        System.out.println("¿ingrese el nombre de la cancion de la canción?");
        String f = entrada.nextLine();
        for (int j = 0; j < a.getNumCanciones(); j++) {
            if (f.equals(nombres[j])) {
                usar = f;
            }
        }        
        DiscoThread exe = new DiscoThread(usar);        
        exe.start();
        System.out.println("Termina el disco principal");
        System.out.println("");
    }
/**
 * Método tocarV para reproducir el disco de 
 * video asociado a el aparato de ambiente
 */      
    void tocarV(){               
        DiscoThread exe = new DiscoThread(b.getNombre());
        exe.start();       
        System.out.println("Termina el disco de video principal");
    }
}
