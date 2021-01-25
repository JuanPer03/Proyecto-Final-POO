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
public class NevDM {
/**
 * Metodo borrar de la clase NevDM del paquete Producos
 * Se encarga de sobrescribir la informacion del archivo que contiene a los discos de musica
 * @param dump es de tipo Arrayist y contiene la informacion correspondiente al archivo el cual se desea sobreecribir
 */    
    public void borrar(ArrayList <DiscosMusica> dump){
        
        File archivo = new File("DiscosMusica.dat");      
        if (archivo.delete()){
            System.out.println("Borrado");
        }        
        File newArchivo = new File("DiscosMusica.dat");
        for (int i = 0; i < dump.size(); i++) {
            try{
            DiscosMusica cd = new DiscosMusica();
            cd = dump.get(i);
            FileOutputStream fos = new FileOutputStream(newArchivo, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(cd);
            oos.close();
            fos.close();
            
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
}
