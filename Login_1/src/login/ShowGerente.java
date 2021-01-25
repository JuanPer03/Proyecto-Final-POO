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
public class ShowGerente {
 /**
 * Metodo Show de la calse ShowGerente del paquete login
 * Se encarga de mostrar los gerentes existentes en la tineda
 */ 
    void Show() {
        File archivo = new File("Gerente.dat");
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois;
            while (fis.available()>0) {
                ois = new ObjectInputStream(fis);
                Gerente gerente = (Gerente) ois.readObject();                
                System.out.println(gerente);
            }
           fis.close();
        } catch (Exception e) {
            System.out.println("Error");          
        }
    }
}
