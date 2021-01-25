/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *Programacion Orientada a Objetos Gpo.1
 * Poyecro final
 * Arrollo Chavarria Jose Luis
 * Barrera Guardia Francisco Mosies
 * Peralta Rodríguez Juan Manuel
 * Reséndiz Cruz Rodrigo Daniel
 */
public class VenderProductoVendedor {
/**
 * Metodo venderP de la clase VenderProductoVendedor del paquee Productos
 * Tiene como finalidad llevar un registro de lo que el cliente quiere comprar, así msmo, imprime
 * un tiquet con los articulos que compro y el nomrbe del vendedor que le vendio
 * @param nombre es de tipo String y contiene el nombre del gerente que esta vendiendo el producto
 */    
   public void venderP(String nombre){
        int total = 0;
        ArrayList <String> carrito = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {            
            System.out.println("¿Qué producto quiere vender?");
            System.out.println("1.-Audifonos");
            System.out.println("2.-Disco de musica");
            System.out.println("3.-disco de video");
            System.out.println("4.-Ticket");
            int choice6 = Integer.parseInt(entrada.nextLine());
            switch (choice6) {
                case 1:
                    boolean salirA = false;
                   do{
                    File archivo = new File("Audifonos.dat");                     
                    System.out.println("Escriba el id o el nombre de los audifonos a agregar al carrito");
                    String audifono = entrada.nextLine();  
                    try {            
                    FileInputStream fis = new FileInputStream(archivo);
                    ObjectInputStream ois;
                    while (fis.available()>0) {
                        ois = new ObjectInputStream(fis);
                        Audifonos aud = (Audifonos) ois.readObject();
                        System.out.println(aud);
                        if ((audifono.equals(aud.getNombre()) ||audifono.equals(aud.getCodigo()))){
                            String s = aud.getNombre();
                            String l = String.valueOf(aud.getPrecio());
                            String N = "Articulo: "+s+ " Precio: "+l;
                            carrito.add(N);
                            total = total+aud.getPrecio();
                        }                
                    }
                        fis.close();
                    } catch (Exception e) {
                        System.out.println("Error:");     
                    }
                    System.out.println("Quiere eliminar algun otro producto?");
                    System.out.println("1.-Si");
                    System.out.println("0.-No");
                    int s = Integer.parseInt(entrada.nextLine());
                    if (s==0){
                        salirA = true;
                    }  
                   }while(!salirA);
                    break;
                case 2:
                    boolean salirB = false;
                   do{
                    File archivo = new File("DiscosMusica.dat");                     
                    System.out.println("Escriba el id o el nombre del disco de musica a agregar al carrito");
                    String discM = entrada.nextLine();  
                    try {            
                    FileInputStream fis = new FileInputStream(archivo);
                    ObjectInputStream ois;
                    while (fis.available()>0) {
                        ois = new ObjectInputStream(fis);
                        DiscosMusica cd = (DiscosMusica) ois.readObject();
                        System.out.println(cd);
                        if ((discM.equals(cd.getNombre()) ||discM.equals(cd.getCodigo()))){
                            String s = cd.getNombre();
                            String l = String.valueOf(cd.getPrecio());
                            String N = "Articulo: "+s+ " Precio: "+l;
                            carrito.add(N);
                            total = total+cd.getPrecio();
                        }                
                    }
                        fis.close();
                    } catch (Exception e) {
                        System.out.println("Error:");     
                    }
                    System.out.println("Quiere eliminar algun otro producto?");
                    System.out.println("1.-Si");
                    System.out.println("0.-No");
                    int s = Integer.parseInt(entrada.nextLine());
                    if (s==0){
                        salirB = true;
                    }  
                   }while(!salirB);      
                    break;
                case 3:
                    boolean salirC = false;
                   do{
                    File archivo = new File("DiscosVideo.dat");                     
                    System.out.println("Escriba el id o el nombre del Disco de video a agregar al carrito");
                    String discV = entrada.nextLine();  
                    try {            
                    FileInputStream fis = new FileInputStream(archivo);
                    ObjectInputStream ois;
                    while (fis.available()>0) {
                        ois = new ObjectInputStream(fis);
                        DiscosVideo dvd = (DiscosVideo) ois.readObject();
                        System.out.println(dvd);
                        if ((discV.equals(dvd.getNombre()) ||discV.equals(dvd.getCodigo()))){
                            String s = dvd.getNombre();
                            String l = String.valueOf(dvd.getPrecio());
                            String N = "Articulo: "+s+ " Precio: "+l;
                            carrito.add(N);
                            total = total+dvd.getPrecio();
                        }                
                    }
                        fis.close();
                    } catch (Exception e) {
                        System.out.println("Error:");     
                    }
                    System.out.println("Quiere eliminar algun otro producto?");
                    System.out.println("1.-Si");
                    System.out.println("0.-No");
                    int s = Integer.parseInt(entrada.nextLine());
                    if (s==0){
                        salirC = true;
                    }  
                   }while(!salirC);                             
                    break;
                case 4:
                    Date d = new Date();
                    String TOTAL = "Total: "+String.valueOf(total);
                    String HEADER = "¡Gracias por comprar con Shark DJ!";
                    String SUBHEADER = "       Ticket de Compra        ";
                    try{;                        
                        FileWriter fw = new FileWriter("Ticket.txt");
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter salida = new PrintWriter(bw);                        
                        salida.println(HEADER);
                        salida.println(SUBHEADER);
                        salida.println("Le atendio: "+nombre+" (VENDEDOR)");
                        salida.println("Fecha de la transaccion: "+d);
                        for (int i = 0; i < carrito.size(); i++) {
                            salida.println(carrito.get(i)+"\n");
                        }
                        salida.print(TOTAL);
                        salida.close();
                    }catch(IOException ioe){}
                    BufferedReader br;
                    try{
                        FileReader fr = new FileReader("Ticket.txt");
                        br = new BufferedReader(fr);
                        String Linea = br.readLine();
                        while(Linea != null){
                        System.out.println(Linea);
                            Linea = br.readLine();
                        }
                        br.close();
                    }catch(IOException ioe){} 
                    salir = true;
                    break;
                default:
                    throw new AssertionError();
            }  
        }      
    }    
}
