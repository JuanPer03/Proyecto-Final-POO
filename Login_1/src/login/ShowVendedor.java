
package login;

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
public class ShowVendedor { 
/**
 * Metodo Show de la calse ShowVendedor del paquete login
 * Se encarga de mostrar los vendedores existentes en la tineda
 */    
   void Show() {
                File archivo = new File("Vendedor.dat");
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois;
            while (fis.available()>0) {
                ois = new ObjectInputStream(fis);
                Vendedor vendedor = (Vendedor) ois.readObject();                
                System.out.println(vendedor);
            }
            fis.close();
        } catch (Exception e) {
            System.out.println("Error");           
        }
    }
}
