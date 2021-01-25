package Productos;
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
public class EliminarProducto {
/**
 * Metodo eliminar de la clase EliminarProducto del paquete Productos
 * Se encarga de permitir al gerente eliminar un producto eliminando su informacion correspondiente 
 * del archivo correspondiente
 */    
    public void eliminar(){
        Scanner entrada = new Scanner(System.in);                
        boolean salir = false;
        while(!salir) {                    
            System.out.println("¿Qué tipo de producto quiere eliminar?");
            System.out.println("1.-Audifonos");
            System.out.println("2.-Disco de musica");
            System.out.println("3.-Disco de video");
            int opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion) {
                case 1:
                    ArrayList <Audifonos> temp = new ArrayList();
                    File archivo = new File("Audifonos.dat");                     
                    System.out.println("Escriba el id o el nombre de los audifononos a eliminar");
                    String audifono = entrada.nextLine();  
                    try {            
                    FileInputStream fis = new FileInputStream(archivo);
                    ObjectInputStream ois;
                    while (fis.available()>0) {
                        ois = new ObjectInputStream(fis);
                        Audifonos aud = (Audifonos) ois.readObject();
                        if (!(audifono.equals(aud.getNombre()) ||audifono.equals(aud.getCodigo()))){
                            temp.add(aud);
                        }                
                    }
                        fis.close();
                    } catch (Exception e) {
                        System.out.println("Error:");     
                    }
                    NevA a = new NevA();
                    a.borrar(temp);
                    System.out.println("Quiere eliminar algun otro producto?");
                    System.out.println("1.-Si");
                    System.out.println("0.-No");
                    int s = Integer.parseInt(entrada.nextLine());
                    if (s==0){
                        salir = true;
                    }                    
                    break;
                case 2:
                    ArrayList <DiscosMusica> tempA = new ArrayList();
                    File archivoA = new File("DiscosMusica.dat");                                   
                    System.out.println("Escriba el id o nombre del disco a eliminar");
                    String musica = entrada.nextLine();  
                    try {            
                    FileInputStream fis = new FileInputStream(archivoA);
                    ObjectInputStream ois;
                    while (fis.available()>0) {
                        ois = new ObjectInputStream(fis);
                        DiscosMusica cd = (DiscosMusica) ois.readObject();
                        if (!(musica.equals(cd.getNombre())||musica.equals(cd.getCodigo()))){
                            tempA.add(cd);
                        }                
                    }
                        fis.close();
                    } catch (Exception e) {
                        System.out.println("Error:");     
                    }
                    NevDM a2 = new NevDM();
                    a2.borrar(tempA);
                    System.out.println("Quiere eliminar algun otro producto?");
                    System.out.println("1.-Si");
                    System.out.println("0.-No");
                    int s1 = Integer.parseInt(entrada.nextLine());
                    if (s1==0){
                        salir = true;
                    }
                    break;
                case 3:
                    ArrayList <DiscosVideo> tempB = new ArrayList();
                    File archivoB = new File("DiscosVideo.dat");                     
                    System.out.println("Escriba el id o el nombre del disco de video a eliminar");
                    String video = entrada.nextLine();  
                    try {            
                    FileInputStream fis = new FileInputStream(archivoB);
                    ObjectInputStream ois;
                    while (fis.available()>0) {
                        ois = new ObjectInputStream(fis);
                        DiscosVideo dvd = (DiscosVideo) ois.readObject();
                        if (!(video.equals(dvd.getNombre())||video.equals(dvd.getCodigo()))){
                            tempB.add(dvd);
                        }                
                    }
                        fis.close();
                    } catch (Exception e) {
                        System.out.println("Error:");     
                    }
                    NevDV a3 = new NevDV();
                    a3.borrar(tempB);
                    System.out.println("Quiere eliminar algun otro producto?");
                    System.out.println("1.-Si");
                    System.out.println("0.-No");
                    int s3 = Integer.parseInt(entrada.nextLine());
                    if (s3==0){
                        salir = true;
                    }
                    break;
                    
                default:
                    System.out.println("Opción invalida");                   
            }
        }
    }
}
