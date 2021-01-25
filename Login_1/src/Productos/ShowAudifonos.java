package Productos;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Poyecro final
 * Arrollo Chavarria Jose Luis
 * Barrera Guardia Francisco Mosies
 * Peralta Rodríguez Juan Manuel
 * Reséndiz Cruz Rodrigo Daniel
 */
public class ShowAudifonos {
/**
 * Metodo Show de la calse ShowAudifonos del paquete Productos
 * Se encarga de mostrar los audifonos existentes en la tineda
 */    
    public void Show() {
       File archivo = new File("Audifonos.dat");
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois;
            while (fis.available()>0) {
                ois = new ObjectInputStream(fis);
                Audifonos aud = (Audifonos) ois.readObject();                
                System.out.println(aud);
            }
            fis.close();
        } catch (Exception e) {
            System.out.println("Error");           
        }
    }
}
