/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AparatosAmbiente;

import Productos.Audifonos;
import Productos.NevA;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

/**
 *Programacion Orientada a Objetos Gpo.1
 * Poyecro final
 * Arrollo Chavarria Jose Luis
 * Barrera Guardia Francisco Mosies
 * Peralta Rodríguez Juan Manuel
 * Reséndiz Cruz Rodrigo Daniel
 */
public class ReproduccionADA {
/**
 * Método PlayVP el cual pregunta el id del VideoPLayer 
 * a usar y nos ayuda a acceder a su método tocar()
 */    
   public void playVp(){ 
       boolean salir = false;
     do{  
       Scanner entrada = new Scanner(System.in);                               
       File archivo = new File("VideosPlayer.dat");                     
       System.out.println("ingrese el nombre o el id del aparato a usar");
       String MP = entrada.nextLine();  
       try {            
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois;
            while (fis.available()>0) {
                ois = new ObjectInputStream(fis);
                VideoPlayer vid = (VideoPlayer) ois.readObject();
                System.out.println(vid);
                if ((MP.equals(vid.getNombre()) ||MP.equals(vid.getIdVideoPlayer()))){
                        if (vid.b == null){
                            boolean salirb = false;
                            do {
                                 vid.tocarM();
                                Thread.sleep(1000);
                                System.out.println("¿Quiere reproducir otra cancion?");
                                System.out.println("1.-Si");
                                System.out.println("2.-No");
                                int opcion = Integer.parseInt(entrada.nextLine());
                                if (opcion==0) {
                                    System.out.println("aparato "+vid.getNombre()+" apagado");
                                    salirb = true;
                                 } 
                            } while (!salirb);                                                                                  
                        }else{
                            boolean salirc = false;
                            do {
                                 vid.tocarV();
                                System.out.println("¿Quiere reproducir otra cancion?");
                                System.out.println("1.-Si");
                                System.out.println("2.-No");
                                int opcion = Integer.parseInt(entrada.nextLine());
                                if (opcion==0) {
                                    System.out.println("aparato "+vid.getNombre()+" apagado");
                                    salirc = true;
                                 } 
                            } while (!salirc);                             
                            
                        }
                        break;
                    }                
                }
            fis.close();
        } catch (Exception e) {
           System.out.println("Error:");     
        }
        System.out.println("Quiere utilizar otro aparato?");
       System.out.println("1.-Si");
       System.out.println("0.-No");
        int s = Integer.parseInt(entrada.nextLine());
        if (s==0){
           salir = true;
        } 
     }while(!salir);  
    }
/**
 * Método PlayMS el cual pregunta el id del MusicPLayer 
 * a usar y nos ayuda a acceder a su método tocar()
 */   
   public void playMS(){
        boolean salir = false;
     do{  
       Scanner entrada = new Scanner(System.in);                               
       File archivo = new File("MusicaPlayers.dat");                     
       System.out.println("ingrese el nombre o el id del aparato a usar");
       String MP = entrada.nextLine();  
       try {            
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois;
            while (fis.available()>0) {
                ois = new ObjectInputStream(fis);
                MusicPlayer mus = (MusicPlayer) ois.readObject();
                System.out.println(mus);
                if ((MP.equals(mus.getNombre()) ||MP.equals(mus.getIdMusicPlayer()))){
                        mus.tocar();
                        Thread.sleep(1000);
                        break;
                    }                
                }
            fis.close();
        } catch (Exception e) {
           System.out.println("Error:");     
        }
        System.out.println("Quiere utilizar otro aparato?");
       System.out.println("1.-Si");
       System.out.println("0.-No");
        int s = Integer.parseInt(entrada.nextLine());
        if (s==0){
           salir = true;
        } 
     }while(!salir);    
    }
}
