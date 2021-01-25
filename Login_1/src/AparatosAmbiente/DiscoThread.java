/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AparatosAmbiente;

import java.util.Scanner;

/**
 *Programacion Orientada a Objetos Gpo.1
 * Poyecro final
 * Arrollo Chavarria Jose Luis
 * Barrera Guardia Francisco Mosies
 * Peralta Rodríguez Juan Manuel
 * Reséndiz Cruz Rodrigo Daniel
 */
public class DiscoThread extends Thread{
/**
 * Contructor de la clase DiscoThread el cual recibe 
 * el nombre de la cancion a reproducir
 * @param nombre 
 */
   public DiscoThread(String nombre) {
        super(nombre);
    }
/**
 * Método run() que reproduce la cancion sugerida.
 */   
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Reproducciendo "+Thread.currentThread().getName()+"...");
        }
        System.out.println("Termina "+Thread.currentThread().getName());
    }
}
