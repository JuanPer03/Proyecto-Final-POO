package login;

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
public class Nevp {
/**
 * Metodo borrar de la clase Nevp del paquete login
 * Se encarga de sobrescribir la informacion del archivo que contiene a los gerentes
 * @param dump es de tipo Arrayist y contiene la informacion correspondiente al archivo el cual se desea sobreecribir
 */    
    void borrar(ArrayList <Gerente> dump){
        
        File archivo = new File("Gerente.dat");      
        if (archivo.delete()){
            System.out.println("Borrado");
        }        
        File newArchivo = new File("Gerente.dat");
        for (int i = 0; i < dump.size(); i++) {
            try{
            Gerente persona = new Gerente();
            persona = dump.get(i);
            FileOutputStream fos = new FileOutputStream(newArchivo, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(persona);
            oos.close();
            fos.close();
            
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
}
