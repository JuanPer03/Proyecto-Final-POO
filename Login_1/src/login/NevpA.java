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
public class NevpA {
/**
 * Metodo borrar de la clase NevpA del paquete login
 * Se encarga de sobrescribir la informacion del archivo que contiene a los acomodadores
 * @param dump es de tipo Arrayist y contiene la informacion correspondiente al archivo el cual se desea sobreecribir
 */    
    void borrar(ArrayList <Acomodador> dump){
        File archivo = new File("Acomodador.dat");      
        if (archivo.delete()){
            System.out.println("Borrado");
        }        
        File newArchivo = new File("Acomodador.dat");
        for (int i = 0; i < dump.size(); i++) {
            try{
            Acomodador persona = new Acomodador();
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
