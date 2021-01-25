/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AparatosAmbiente;

import Productos.DiscosMusica;
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
public class NevMP {
/**
 * Método borar de NevMP el cual se encarga de 
 * sobrescribir un archivo antes borrado para 
 * registrar los cambios que se hicieron al MusicPLayer
 * @param dump 
 */        
        public void borrar(ArrayList <MusicPlayer> dump){        
        File archivo = new File("MusicPlayers.dat");      
        if (archivo.delete()){
            System.out.println("Borrado");
        }        
        File newArchivo = new File("MusicPlayers.dat");
        for (int i = 0; i < dump.size(); i++) {
            try{
            MusicPlayer cd = new MusicPlayer();
            cd = dump.get(i);
            FileOutputStream fos = new FileOutputStream(newArchivo, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(cd);
            oos.close();
            fos.close();            
            } catch (Exception e) {
                System.out.println("Error");
                e.printStackTrace();
            }
        }
    }
}
