package login;

import java.io.Serializable;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Poyecro final
 * Arrollo Chavarria Jose Luis
 * Barrera Guardia Francisco Mosies
 * Peralta Rodríguez Juan Manuel
 * Reséndiz Cruz Rodrigo Daniel
 */
public class Vendedor extends Empleado implements Serializable{
    String idVendedor;
/**
 * Metodo getIdVendedor de la clase Vendedor heredada de la clase Empleado del paquete login
 * @return 
 */
    public String getIdVendedor() {
        return idVendedor;
    }
/**
 * Metodo setIdVendedor de la clase Vendedor heredada de la clase Empleado del paquete login
 * @param idVendedor 
 */
    public void setIdVendedor(String idVendedor) {
        this.idVendedor = idVendedor;
    }
/**
 * Metodo toString de la clase Vendedor heredada de la clase Empleado del paquete login
 * @return retorna el valor de los atributos idVendedor  y los heredados de Empleado del empleado Vendedor.
 */
    @Override
    public String toString() {
        return super.toString()+", IdVendedor: " + idVendedor+".";
    }    
}
