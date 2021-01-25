package Productos;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Poyecro final
 * Arrollo Chavarria Jose Luis
 * Barrera Guardia Francisco Mosies
 * Peralta Rodríguez Juan Manuel
 * Reséndiz Cruz Rodrigo Daniel
 */
public class NevA {
/**
 * Metodo borrar de la clase NevA del paquete Producos
 * Se encarga de sobrescribir la informacion del archivo que contiene a los audifonos
 * @param dump es de tipo Arrayist y contiene la informacion correspondiente al archivo el cual se desea sobreecribir
 */    
    public void borrar(ArrayList <Audifonos> dump){
        File archivo = new File("Audifonos.dat");      
        if (archivo.delete()){
            System.out.println("Borrado");
        }        
        File newArchivo = new File("Audifonos.dat");
        for (int i = 0; i < dump.size(); i++) {
            try{
            Audifonos aud = new Audifonos();
            aud = dump.get(i);
            FileOutputStream fos = new FileOutputStream(newArchivo, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(aud);
            oos.close();
            fos.close();
            
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
}
