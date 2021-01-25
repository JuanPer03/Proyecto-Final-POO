package Productos;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Poyecro final
 * Arrollo Chavarria Jose Luis
 * Barrera Guardia Francisco Mosies
 * Peralta Rodríguez Juan Manuel
 * Reséndiz Cruz Rodrigo Daniel
 */
public class CrearAudifonos {
/**
 * Metodo crear de la clase CrearAudifonos del paquete Productos
 * Se encarga de crear un nuevo producto de tipo Audifonos solicitando
 * su nombre, marca, color, tipo de conexion (bluetooth-auxiliar), precio y asignando un ID aleatorio
 * para guardar los datos en un archivo
 */    
    public void crear(){        
        Audifonos aud = new Audifonos();
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Ingrese el nombre de los audifonos.");
        String name = entrada.nextLine();
        aud.setNombre(name);
        System.out.println("Ingrese la marca de los udifonos.");
        String marca = entrada.nextLine();
        aud.setMarca(marca);
        System.out.println("Ingrese el color de los audifonos.");
        String col = entrada.nextLine();
        aud.setColor(col);
        System.out.println("Ingrese el tipo de conexion que tienen los audifonos.");
        String con = entrada.nextLine();
        aud.setConexion(con);
        System.out.println("Ingrese el precio de los audifonos en pesos mexicanos (NUMEROS ENTEROS).");
        int moni = entrada.nextInt();
        aud.setPrecio(moni);
        String ID = ("AUD"+String.valueOf((int)(Math.random()*1000+1)));
        System.out.println("Codigo de los audifonos: "+ID+".");
        aud.setCodigo(ID);
        File archivo = new File("Audifonos.dat");
        try {
            FileOutputStream fos = new FileOutputStream(archivo, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(aud);
            oos.close();
            fos.close();
            
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
