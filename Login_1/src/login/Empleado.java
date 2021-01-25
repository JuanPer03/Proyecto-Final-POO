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
public class Empleado implements Serializable{
    String nombre, usuario, contrasena;
/**
 * Metodo getNombre de la clase Empleado del paquete login
 * @return retorna el nombre en tienda del empleado. (Acomodador, Vendedor o Gerente)
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Metodo setNombre de la clase Empleado del paquete login
 * @param nombre es de tipo String y lo que recibe lo asigna al atributo nombre del empleado.(Acomodador, Vendedor o Gerente)
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Metodo getUsuario de la clase Empleado del paquete login
 * @return retorna el nombre de usuario en tienda del empleado. (Acomodador, Vendedor o Gerente)
 */
    public String getUsuario() {
        return usuario;
    }
/**
 * Metodo setUsuario de la clase Empleado del paquete login
 * @param usuario es de tipo String y lo que recibe lo asigna al atributo usuario del empleado.(Acomodador, Vendedor o Gerente)
 */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
/**
 * Metodo getContrasena de la clase Empleado del paquete login
 * @return retorna la contraseña en tienda del empleado. (Acomodador, Vendedor o Gerente)
 */
    public String getContrasena() {
        return contrasena;
    }
/**
 * Metodo setContrasena de la clase Empleado del paquete login
 * @param contraseña es de tipo String y lo que recibe lo asigna al atributo contrasena del empleado.(Acomodador, Vendedor o Gerente)
 */
    public void setContrasena(String contraseña) {
        this.contrasena = contraseña;
    }
/**
 * Metodo toString de la clase Empleado del paquete login
 * @return retorna el valor de los atributos nombre, usuario y contrasena del empleado. (Acomodador, Vendedor o Gerente)
 */
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Usuario: " + usuario + ", Contrasena: " + contrasena;
    }


}
