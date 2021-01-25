/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AparatosAmbiente;

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
public class ShowMP {
/**
 * Métod Show que muestra la lista de los 
 * MusicPlayer que existen.
 */    
        public void Show() {
       File archivo = new File("MusicaPlayers.dat");
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois;
            while (fis.available()>0) {
                ois = new ObjectInputStream(fis);
                MusicPlayer aud = (MusicPlayer) ois.readObject();                
                System.out.println(aud);
            }
            fis.close();
        } catch (Exception e) {
            System.out.println("Error");           
        }
    }    
}
