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
public class Producto implements Serializable{
    String nombre,codigo;
    int precio;
/**
 * Metodo getNombre de la clase Producto del paquete Productos
 * @return retorna el nombre en tienda del producto. (Audifonos, Disco de musica o Disco de video)
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Metodo setNombre de la clase Producto del paquete Productos
 * @param nombre es de tipo String y lo que recibe lo asigna al atributo nombre del producto.(Audifonos, Disco de musica o Disco de video)
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Metodo getCodigo de la clase Producto del paquete Productos
 * @return retorna el codigo en tienda del producto. (Audifonos, Disco de musica o Disco de video)
 */
    public String getCodigo() {
        return codigo;
    }
/**
 * Metodo setCodigo de la clase Producto del paquete Productos
 * @param codigo es de tipo String y lo que recibe lo asigna al atributo codigo del producto.(Audifonos, Disco de musica o Disco de video)
 */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
/**
 * Metodo getPrecio de la clase Producto del paquete Productos
 * @return retorna el precio en tienda del producto. (Audifonos, Disco de musica o Disco de video)
 */
    public int getPrecio() {
        return precio;
    }
/**
 * Metodo setPrecio de la clase Producto del paquete Productos
 * @param precio es de tipo int y lo que recibe lo asigna al atributo precio del producto.(Audifonos, Disco de musica o Disco de video)
 */
    public void setPrecio(int precio) {
        this.precio = precio;
    }
/**
 * Metodo toString de la clase Producto del paquete Productos
 * @return retorna el valor de los atributos nombre, codigo y precio del producto. (Audifonos, Disco de musica o Disco de video) 
 */
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Codigo: " + codigo + ", Precio: $" + precio;
    }
    
    
}
