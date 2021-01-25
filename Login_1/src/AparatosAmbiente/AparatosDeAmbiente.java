
package AparatosAmbiente;

import java.io.Serializable;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Poyecro final
 * Arrollo Chavarria Jose Luis
 * Barrera Guardia Francisco Mosies
 * Peralta Rodríguez Juan Manuel
 * Reséndiz Cruz Rodrigo Daniel
 */
public class AparatosDeAmbiente implements Serializable{
    String nombre;
/**
 * Metodo getNombre que obtiene la referencia al nombre del objeto al ser solicitado
 * @return nombre
 */        
    public String getNombre() {
        return nombre;
    }
/**
 * Método setNombre el cual obtiene un String
 * y le añade ese String al nombre del objeto
 * @param nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Metodo toString que se encarga de imprimir la informacion del objeto
 * @return nombre del objeto
 */
    @Override
    public String toString() {
        return "nombre= " + nombre ;
    }
    
}
