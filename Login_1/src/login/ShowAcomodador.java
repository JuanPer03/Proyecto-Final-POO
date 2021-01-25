/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class ShowAcomodador {   
/**
 * Metodo Show de la calse ShowAcomodador del paquete login
 * Se encarga de mostrar los aocmodadores existentes en la tineda
 */    
    void Show() {
       File archivo = new File("Acomodador.dat");
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois;
            while (fis.available()>0) {
                ois = new ObjectInputStream(fis);
                Acomodador acomodador = (Acomodador) ois.readObject();                
                System.out.println(acomodador);
            }
           fis.close();
        } catch (Exception e) {
            System.out.println("Error");           
        }
    }
}
