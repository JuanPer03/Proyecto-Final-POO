package Productos;

import java.io.Serializable;
import java.util.Arrays;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Poyecro final
 * Arrollo Chavarria Jose Luis
 * Barrera Guardia Francisco Mosies
 * Peralta Rodríguez Juan Manuel
 * Reséndiz Cruz Rodrigo Daniel
 */
public class DiscosMusica extends Producto implements Serializable{
    String artista;
    int numCanciones;
    String[] nombresCanciones;
    float[] duracionCanciones;
/**
 * Metodo getArtista de la clase DiscosMusica heredada de la clase Producto del paquete Productos
 * @return retorna el artista del producto Disco de musica.
 */
    public String getArtista() {
        return artista;
    }
/**
 * Metodo setArtista de la clase DiscosMusica heredada de la clase Producto del paquete Productos
 * @param artista es de tipo String y lo que recibe lo asigna al atributo artista del producto Disco de musica.
 */
    public void setArtista(String artista) {
        this.artista = artista;
    }
/**
 * Metodo getNumCanciones de la clase DiscosMusica heredada de la clase Producto del paquete Productos
 * @return retorna el numero de canciones del producto Disco de musica.
 */
    public int getNumCanciones() {
        return numCanciones;
    }
/**
 * Metodo setNumCanciones de la clase DiscosMusica heredada de la clase Producto del paquete Productos
 * @param numCanciones es de tipo int y lo que recibe lo asigna al atributo numCanciones del producto Disco de musica.
 */
    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }
/**
 * Metodo getNombresCanciones de la clase DiscosMusica heredada de la clase Producto del paquete Productos
 * @return retorna el nombre de las canciones del producto Disco de musica.
 */
    public String[] getNombresCanciones() {
        return nombresCanciones;
    }
/**
 * Metodo setNombresCanciones de la clase DiscosMusica heredada de la clase Producto del paquete Productos
 * @param nombresCanciones es un arrego de tipo String y lo que recibe lo asigna al atributo nembresCanciones del producto Disco de musica.
 */
    public void setNombresCanciones(String[] nombresCanciones) {
        this.nombresCanciones = nombresCanciones;
    }
/**
 * Metodo getDuracionCanciones de la clase DiscosMusica heredada de la clase Producto del paquete Productos
 * @return retorna la duracione de cada cancion "en minutos" del producto Disco de musica.
 */
    public float[] getDuracionCanciones() {
        return duracionCanciones;
    }
/**
 * Metodo setDuracionCanciones de la clase DiscosMusica heredada de la clase Producto del paquete Productos
 * @param duracionCanciones es un arreglo de tipo float y lo que recibe lo asigna al atributo duracionCanciones del producto Disco de musica.
 */
    public void setDuracionCanciones(float[] duracionCanciones) {
        this.duracionCanciones = duracionCanciones;
    }
/**
 * Metodo toString de la clase DiscosMusica heredada de la clase Producto del paquete Productos
 * @return retorna el valor de los atributos artista, numanciones, nombresCanciones, duracionCanciones  y los heredados de Producto del producto Disco de musica.
 */
    @Override
    public String toString() {
        return super.toString()+ ", Artista: " + artista + ", NumCanciones: " + numCanciones + "\nCanciones: "+ Arrays.toString(nombresCanciones)+"\nDuraciones: "+Arrays.toString(duracionCanciones);
        
    }
    
    
}
