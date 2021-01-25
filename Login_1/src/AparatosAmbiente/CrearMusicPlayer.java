/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AparatosAmbiente;

import Productos.DiscosMusica;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
public class CrearMusicPlayer {
        ArrayList <DiscosMusica> listaMusica = new ArrayList();
/**
 * Metodo que pide al usuario los datos que componen el
 * MusicPLayer y lo añade a un archivo binario.
 */        
        public void crear(){
            boolean salir = false;
        MusicPlayer MUP = new MusicPlayer();
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Ingrese el nombre del aparato de ambiente.");
        String name = entrada.nextLine();
        MUP.setNombre(name);
        String ID = ("MP"+String.valueOf((int)(Math.random()*1000+1)));
        System.out.println("Codigo del aparato de ambiente: "+ID+".");
        MUP.setIdMusicPlayer(ID);
            do {
                System.out.println("ingrese el nombre o id del disco de musica a agregar");
                String disco = entrada.nextLine();
                File archivo = new File("DiscosMusica.dat");
                try {            
                    FileInputStream fis = new FileInputStream(archivo);
                    ObjectInputStream ois;
                    while (fis.available()>0) {
                    ois = new ObjectInputStream(fis);
                    DiscosMusica disc = (DiscosMusica) ois.readObject();
                    System.out.println(disc);
                    if ((disco.equals(disc.getNombre()) ||disco.equals(disc.getCodigo()))){
                        listaMusica.add(disc);
                    }                
                    }                       
                        fis.close();
                } catch (Exception e) {
                   System.out.println("Error:");     
                }
                System.out.println("¿Desea agregar otro disco?");
                System.out.println("1.-si");
                System.out.println("0.-no");
                int opcion = Integer.parseInt(entrada.nextLine());
                if (opcion == 0){
                   MUP.setGroup(listaMusica); 
                   salir = true;
                }                
            } while (!salir);

        File archivo = new File("MusicaPlayers.dat");
        try {
            FileOutputStream fos = new FileOutputStream(archivo, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(MUP);
            oos.close();
            fos.close();
            
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
