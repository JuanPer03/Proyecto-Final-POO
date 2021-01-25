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
public class ShowDiscosMusica {
/**
 * Metodo Show de la calse ShowDiscosMusica del paquete Productos
 * Se encarga de mostrar los discos de musica existentes en la tineda
 */    
    public void Show() {
       File archivo = new File("DiscosMusica.dat");
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois;
            while (fis.available()>0) {
                ois = new ObjectInputStream(fis);
                DiscosMusica cd = (DiscosMusica) ois.readObject();                
                System.out.println(cd);
            }
            fis.close();
        } catch (Exception e) {
            System.out.println("Error");          
        }
    }
}
