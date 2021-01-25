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
public class Audifonos extends Producto implements Serializable{
    String marca, color, conexion;
/**
 * Metodo getMarca de la clase Audifonos heredada de la clase Producto del paquete Productos
 * @return retorna la marca del producto Audifonos.
 */
    public String getMarca() {
        return marca;
    }
/**
 * Metodo setMarca de la clase Audifonos heredada de la clase Producto del paquete Productos
 * @param marca es de tipo String y lo que recibe lo asigna al atributo marca del producto Audifonos.
 */
    public void setMarca(String marca) {
        this.marca = marca;
    }
/**
 * Metodo getColor de la clase Audifonos heredada de la clase Producto del paquete Productos
 * @return retorna el color del producto Audifonos.
 */
    public String getColor() {
        return color;
    }
/**
 * Metodo setColor de la clase Audifonos heredada de la clase Producto del paquete Productos
 * @param color es de tipo String y lo que recibe lo asigna al atributo color del producto Audifonos.
 */
    public void setColor(String color) {
        this.color = color;
    }
/**
 * Metodo getConexion de la clase Audifonos heredada de la clase Producto del paquete Productos
 * @return retorna el tipo de conexion (bluetooth-auxiliar) del producto Audifonos.
 */
    public String getConexion() {
        return conexion;
    }
/**
 * Metodo setConexion de la clase Audifonos heredada de la clase Producto del paquete Productos
 * @param conexion es de tipo String y lo que recibe lo asigna al atributo conexion del producto Audifonos.
 */
    public void setConexion(String conexion) {
        this.conexion = conexion;
    }
/**
 * Metodo toString de la clase Audifonos heredada de la clase Producto del paquete Productos
 * @return retorna el valor de los atributos marca, color, conexion  y los heredados de Producto del producto Audifonos.
 */
    @Override
    public String toString() {
        return super.toString()+ ", Marca: " + marca + ", Color: " + color + ", Conexion: " + conexion;
    }
    
    
}
