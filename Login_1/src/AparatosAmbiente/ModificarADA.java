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
public class ModificarADA {
/**
 * Método ModificarMP de la clase ModificarADA
 * permite modificar el nombre o el id del aparato de ambiente.
 */    
    public void ModificarMP(){
        Scanner entrada = new Scanner(System.in);                
        boolean salir = false;
        while(!salir) {                    
                    boolean correcto = false;
                    ArrayList <MusicPlayer> temp = new ArrayList();
                    File archivo = new File("MusicaPlayers.dat");                     
                    System.out.println("Escriba el id o el nombre del aparato a modificar");
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
                        if ((aparato.equals(mus.getNombre()) ||aparato.equals(mus.getIdMusicPlayer()))){
                                System.out.println("¿Que quiere modificar?");
                                System.out.println("1.-Nombre");
                                System.out.println("2.-id");                                
                                int option = Integer.parseInt(entrada.nextLine());
                                switch (option) {
                                    case 1:
                                        System.out.println("ingrese el nuevo nombre");
                                        String newName = entrada.nextLine();
                                        mus.setNombre(newName);                        
                                        System.out.println("Nombre modificado exitosamente");
                                        System.out.println(mus);
                                        System.out.println("¿Quiere modificar otro campo?");
                                        System.out.println("1.- si");
                                        System.out.println("0.- no");
                                        int op = Integer.parseInt(entrada.nextLine());
                                        if (op == 0) {
                                            correcto = true;
                                        }
                                    break;
                                    case 2:
                                        String ID = ("MP"+String.valueOf((int)(Math.random()*1000+1)));
                                        System.out.println("Este es el nuevo id: "+ID+".");
                                         mus.setIdMusicPlayer(ID);
                                        System.out.println("id modificado exitosamente");
                                        System.out.println("¿Quiere modificar otro campo?");
                                        System.out.println("1.- si");
                                        System.out.println("0.- no");
                                        int opu = Integer.parseInt(entrada.nextLine());
                                        if (opu == 0) {
                                            correcto = true;
                                        }
                                        break;                               
                                default:
                                    System.out.println("opción invalida");
                                }
                                    }while(!correcto); 
                                    temp.add(mus);
                    }
                    fis.close();
                    } catch (Exception e) {
                        System.out.println("error");
                    }
  
                    NevMP a = new NevMP();
                    a.borrar(temp);
                    System.out.println("Quiere Modificar algun otro aparato?");
                    System.out.println("1.-Si");
                    System.out.println("0.-No");
                    int s = Integer.parseInt(entrada.nextLine());
                    if (s==0){
                        salir = true;
                    }                    
                    break;
        }
    }
/**
 * Método ModificarVP de la clase ModificarADA, 
 * permite modificar los mismos atributos que en un music player
 * pero en un video player
 */    
   public void ModificarVP(){
        Scanner entrada = new Scanner(System.in);                
        boolean salir = false;
        while(!salir) {                    
                    boolean correcto = false;
                    ArrayList <VideoPlayer> temp = new ArrayList();
                    File archivo = new File("VideosPlayer.dat");                     
                    System.out.println("Escriba el id o el nombre del aparato a modificar");
                    String aparato = entrada.nextLine();  
                    try {
                    FileInputStream fis = new FileInputStream(archivo);
                    ObjectInputStream ois;
                    while (fis.available()>0) {
                        ois = new ObjectInputStream(fis);
                        VideoPlayer vid = (VideoPlayer) ois.readObject();
                        System.out.println(vid);
                        if (!(aparato.equals(vid.getNombre()) ||aparato.equals(vid.getIdVideoPlayer()))){
                         temp.add(vid);
                        }
                        if ((aparato.equals(vid.getNombre()) ||aparato.equals(vid.getIdVideoPlayer()))){
                                System.out.println("¿Que quiere modificar?");
                                System.out.println("1.-Nombre");
                                System.out.println("2.-id");                                
                                int option = Integer.parseInt(entrada.nextLine());
                                switch (option) {
                                    case 1:
                                        System.out.println("ingrese el nuevo nombre");
                                        String newName = entrada.nextLine();
                                        vid.setNombre(newName);                        
                                        System.out.println("Nombre modificado exitosamente");
                                        System.out.println(vid);
                                        System.out.println("¿Quiere modificar otro campo?");
                                        System.out.println("1.- si");
                                        System.out.println("0.- no");
                                        int op = Integer.parseInt(entrada.nextLine());
                                        if (op == 0) {
                                            correcto = true;
                                        }
                                    break;
                                    case 2:
                                        String ID = ("MP"+String.valueOf((int)(Math.random()*1000+1)));
                                        System.out.println("Este es el nuevo id: "+ID+".");
                                         vid.setIdVideoPlayer(ID);
                                        System.out.println("id modificado exitosamente");
                                        System.out.println("¿Quiere modificar otro campo?");
                                        System.out.println("1.- si");
                                        System.out.println("0.- no");
                                        int opu = Integer.parseInt(entrada.nextLine());
                                        if (opu == 0) {
                                            correcto = true;
                                        }
                                        break;                               
                                default:
                                    System.out.println("opción invalida");
                                }
                                    }while(!correcto); 
                                    temp.add(vid);
                    }
                    fis.close();
                    } catch (Exception e) {
                        System.out.println("error");
                    }
  
                    NevVP a = new NevVP();
                    a.borrar(temp);
                    System.out.println("Quiere Modificar algun otro aparato?");
                    System.out.println("1.-Si");
                    System.out.println("0.-No");
                    int s = Integer.parseInt(entrada.nextLine());
                    if (s==0){
                        salir = true;
                    }                    
                    break;
        }        
    }
}
