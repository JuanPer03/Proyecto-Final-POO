/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AparatosAmbiente;

/**
 *Programacion Orientada a Objetos Gpo.1
 * Poyecro final
 * Arrollo Chavarria Jose Luis
 * Barrera Guardia Francisco Mosies
 * Peralta Rodríguez Juan Manuel
 * Reséndiz Cruz Rodrigo Daniel
 */
public class GrupoDiscoThread extends Thread{
/**
 * 
 * @param g es referente al grupo de discos a reproducir
 * @param n referente al nombre de cada disco.
 */    
    public GrupoDiscoThread(ThreadGroup g, String n ) {
        super(g, n);
    }
/**
 * Método run() que reproduce los discos a la vez.
 */
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Reproduciendo "+getName()+"...");
        }
        System.out.println("Fin del disco "+getName());
    }
}
