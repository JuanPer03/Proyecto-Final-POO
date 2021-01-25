/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AparatosAmbiente;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *Programacion Orientada a Objetos Gpo.1
 * Poyecro final
 * Arrollo Chavarria Jose Luis
 * Barrera Guardia Francisco Mosies
 * Peralta Rodríguez Juan Manuel
 * Reséndiz Cruz Rodrigo Daniel
 */
public class EliminarADA {
/**
 * Método eliminar de la clase EliminarADA
 * Pregunta que tipo de aparato se quiere eliminar y luego pide
 * el nombre o id del mismo, en caso de encontrar el aparato
 * lo borra
 */    
    public void eliminar(){
        Scanner entrada = new Scanner(System.in);                
        boolean salir = false;
        while(!salir) {                    
            System.out.println("¿Qué tipo de aparato quiere eliminar?");
            System.out.println("1.-MusicPlayer");
            System.out.println("2.-VideoPlayer");
            int opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion) {
                case 1:
                    ArrayList <MusicPlayer> temp = new ArrayList();
                    File archivo = new File("MusicPlayers.dat");                     
                    System.out.println("Escriba el id o el nombre del aparato a eliminar");
                    String aparato = entrada.nextLine();  
                    try {            
                    FileInputStream fis = new FileInputStream(archivo);
                    ObjectInputStream ois;
                    while (fis.available()>0) {
                        ois = new ObjectInputStream(fis);
                        MusicPlayer mus = (MusicPlayer) ois.readObject();
                        System.out.println(mus);
                        if (!(aparato.equals(mus.getNombre()) ||aparato.equals(mus.getIdMusicPlayer()))){
                            temp.add(mus);
                        }                
                    }
                        fis.close();
                    } catch (Exception e) {
                        System.out.println("Error:");     
                    }
                    NevMP a = new NevMP();
                    a.borrar(temp);
                    System.out.println("Quiere eliminar algun otro aparato?");
                    System.out.println("1.-Si");
                    System.out.println("0.-No");
                    int s = Integer.parseInt(entrada.nextLine());
                    if (s==0){
                        salir = true;
                    }                    
                    break;
                case 2:
                    ArrayList <VideoPlayer> tempA = new ArrayList();
                    File archivoA = new File("DiscosMusica.dat");                                   
                    System.out.println("Escriba el id o nombre del aparato a eliminar");
                    String musica = entrada.nextLine();  
                    try {            
                    FileInputStream fis = new FileInputStream(archivoA);
                    ObjectInputStream ois;
                    while (fis.available()>0) {
                        ois = new ObjectInputStream(fis);
                        VideoPlayer VP = (VideoPlayer) ois.readObject();
                        System.out.println(VP);
                        if (!(musica.equals(VP.getNombre())||musica.equals(VP.getIdVideoPlayer()))){
                            tempA.add(VP);
                        }                
                    }
                        fis.close();
                    } catch (Exception e) {
                        System.out.println("Error:");     
                    }
                    NevVP a2 = new NevVP();
                    a2.borrar(tempA);
                    System.out.println("Quiere eliminar algun otro aparato?");
                    System.out.println("1.-Si");
                    System.out.println("0.-No");
                    int s1 = Integer.parseInt(entrada.nextLine());
                    if (s1==0){
                        salir = true;
                    }
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        }
    }    
}
