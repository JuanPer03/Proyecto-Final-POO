package Productos;

import java.io.Serializable;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Poyecro final
 * Arrollo Chavarria Jose Luis
 * Barrera Guardia Francisco Mosies
 * Peralta Rodríguez Juan Manuel
 * Reséndiz Cruz Rodrigo Daniel
 */
public class DiscosVideo extends Producto implements Serializable{
    String artista;
    int numCanciones;
    float duracion;
/**
 * Metodo getArtista de la clase DiscosVideo heredada de la clase Producto del paquete Productos
 * @return retorna el artista del producto Disco de video.
 */
    public String getArtista() {
        return artista;
    }
/**
 * Metodo setArtista de la clase DiscosVideo heredada de la clase Producto del paquete Productos
 * @param artista es de tipo String y lo que recibe lo asigna al atributo artista del producto Disco de video.
 */
    public void setArtista(String artista) {
        this.artista = artista;
    }
/**
 * Metodo getNumCanciones de la clase DiscosVideo heredada de la clase Producto del paquete Productos
 * @return retorna el numero de canciones del producto Disco de video.
 */
    public int getNumCanciones() {
        return numCanciones;
    }
/**
 * Metodo setNumCanciones de la clase DiscosVideo heredada de la clase Producto del paquete Productos
 * @param numCanciones es de tipo int y lo que recibe lo asigna al atributo numCanciones del producto Disco de video.
 */
    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }
/**
 * Metodo getDuracion de la clase DiscosVideo heredada de la clase Producto del paquete Productos
 * @return retorna la duracion "en horas" del producto Disco de video.
 */
    public float getDuracion() {
        return duracion;
    }
/**
 * Metodo setDuracion de la clase DiscosVideo heredada de la clase Producto del paquete Productos
 * @param duracion es de tipo float y lo que recibe lo asigna al atributo duracion del producto Disco de video.
 */
    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }
/**
 * Metodo toString de la clase DiscosVideo heredada de la clase Producto del paquete Productos
 * @return retorna el valor de los atributos artista, numanciones, duracion  y los heredados de Producto del producto Disco de video.
 */
    @Override
    public String toString() {
        return super.toString()+ ", Artista: " + artista + ", NumCanciones: " + numCanciones + ", Duracion: " + duracion + " hrs.}";
    }
    
    
}
