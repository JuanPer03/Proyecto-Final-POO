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
public class Gerente extends Empleado implements Serializable{
    String idGerente;
/**
 * Metodo getIdGerente de la clase Gerente heredada de la clase Empleado del paquete login
 * @return 
 */    
    public String getIdGerente() {
        return idGerente;
    }
/**
 * Metodo setIdGerente de la clase Gerente heredada de la clase Empleado del paquete login
 * @param idGerente 
 */
    public void setIdGerente(String idGerente) {
        this.idGerente = idGerente;
    }
/**
 * Metodo toString de la clase Gerente heredada de la clase Empleado del paquete login
 * @return retorna el valor de los atributos idGerente  y los heredados de Empleado del empleado Gerente.
 */
    @Override
    public String toString() {
        return super.toString()+", IdGerente: " + idGerente+".";
    }
}
    
