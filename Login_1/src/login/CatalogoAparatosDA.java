/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import AparatosAmbiente.ShowMP;
import AparatosAmbiente.ShowVP;
import java.util.Scanner;

/**
 *
 * @author pipzo
 */
public class CatalogoAparatosDA {
    void CatalogoADA(){
        Scanner entrada = new Scanner(System.in);                
        boolean salir = false;
        while (!salir) {   
            // Le indicamos al usuario cuales son sus opciones:
            System.out.println("");            
            System.out.println("¿Que tipo de aparato de ambiente quiere consultar?");
            System.out.println("1.-VideoPlayers");
            System.out.println("2.-MusicPlayers");
            System.out.println("3.-Todos los aparatos de ambiente");                
            int opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("VideoPlayers disponibles: ");
                    ShowVP a= new ShowVP();
                    a.Show();
                    System.out.println("¿Quiere consultar otro catalogo?");
                    System.out.println("1.-Si");
                    System.out.println("0.-No");
                    int choice = Integer.parseInt(entrada.nextLine());
                    if (choice == 0){
                        salir = true;
                    }
                    break;
                case 2:                    
                    System.out.println("MusicPlayers disponibles: ");
                    ShowMP a2= new ShowMP();
                    a2.Show();
                    System.out.println("¿Quiere consultar otro catalogo?");
                    System.out.println("1.-Si");
                    System.out.println("0.-No");
                    int choice2 = Integer.parseInt(entrada.nextLine());
                    if (choice2 == 0){
                        salir = true;
                    }
                    break;
                case 3:
                    System.out.println("Aparatos de Ambiente:");
                    ShowVP a3= new ShowVP();
                    a3.Show();
                    ShowMP a4= new ShowMP();
                    a4.Show();
                    System.out.println("¿Quiere consultar otro catalogo?");
                    System.out.println("1.-Si");
                    System.out.println("0.-No");
                    int choice3 = Integer.parseInt(entrada.nextLine());
                    if (choice3 == 0){
                        salir = true;
                    }                    
                    break;                    
                default:
                    System.out.println("Opción invalida");
            }
        }
    }
}
