package AparatosAmbiente;

import Productos.DiscosMusica;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Poyecro final
 * Arrollo Chavarria Jose Luis
 * Barrera Guardia Francisco Mosies
 * Peralta Rodríguez Juan Manuel
 * Reséndiz Cruz Rodrigo Daniel
 */
public class MusicPlayer extends AparatosDeAmbiente implements Serializable{
    String idMusicPlayer;
    ArrayList <DiscosMusica> group = new ArrayList();
/**
 * método getIdMusicPLayer permite obtener la referencia al id del 
 * musicPLayer solicitado
 * @return 
 */
    public String getIdMusicPlayer() {
        return idMusicPlayer;
    }
/**
 * Introduce un nuevo id al atributo de idMusicPlayer del objeto
 * @param idMusicPlayer referente al id del music player dado
 */
    public void setIdMusicPlayer(String idMusicPlayer) {
        this.idMusicPlayer = idMusicPlayer;
    }
/**
 * Regresa al usuario la arraylist correspondiente a los discos que maneja el musicPlayer
 * @return group
 */
    public ArrayList<DiscosMusica> getGroup() {
        return group;
    }
/**
 * Método que obtiene la lista de discos que maneja el MusicPLayer
 * solicitado
 * @param group 
 */
    public void setGroup(ArrayList<DiscosMusica> group) {
        this.group = group;
    }
/**
 * Método toString() que imprime la informacion 
 * del aparato de ambiente 
 * @return 
 */
    @Override
    public String toString() {
        return  super.toString()+" idMusicPlayer= " + idMusicPlayer + " group= " + group;
    }
/**
 * Método tocar del objeto MusicPlayer el cual 
 * sirve para reproducir los discos que tiene precargado
 */    
    public void tocar(){
        ThreadGroup grupoHilos = new ThreadGroup("Discos:");
        ArrayList <String> name = new ArrayList();
        for (int i = 0; i < group.size(); i++) {
            DiscosMusica disco = group.get(i);
            name.add(disco.getNombre());
        }
        for (int i = 0; i < name.size(); i++) {
           Thread hilo1 = new GrupoDiscoThread(grupoHilos, name.get(i)); 
           hilo1.start();
        }
            
    }
}
