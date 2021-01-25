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
public class Acomodador extends Empleado implements Serializable{
    String idAcomodador;
/**
 * Metodo getIdAcomodador de la clase Acomodador heredada de la clase Empleado del paquete login
 * @return 
 */
    public String getIdAcomodador() {
        return idAcomodador;
    }
/**
 * Metodo setIdAcomodador de la clase Acomodador heredada de la clase Empleado del paquete login
 * @param idAcomodador 
 */
    public void setIdAcomodador(String idAcomodador) {
        this.idAcomodador = idAcomodador;
    }
/**
 * Metodo toString de la clase Acomodador heredada de la clase Empleado del paquete login
 * @return retorna el valor de los atributos idAcomodador  y los heredados de Empleado del empleado Acomodador.
 */
    @Override
    public String toString() {
        return super.toString()+", IdAcomodador:" + idAcomodador+".";
    }
    
}
