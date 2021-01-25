/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AparatosAmbiente;

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
public class NevVP {
/**
 * Método borrar de NevVP el cual
 * gusrda los cambios que se le hacen a un VideoPLayer
 * @param dump 
 */    
        public void borrar(ArrayList <VideoPlayer> dump){        
        File archivo = new File("VideosPlayer.dat");      
        if (archivo.delete()){
            System.out.println("Borrado");
        }        
        File newArchivo = new File("VideosPlayer.dat");
        for (int i = 0; i < dump.size(); i++) {
            try{
            VideoPlayer vp = new VideoPlayer();
            vp = dump.get(i);
            FileOutputStream fos = new FileOutputStream(newArchivo, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(vp);
            oos.close();
            fos.close();            
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }    
}
