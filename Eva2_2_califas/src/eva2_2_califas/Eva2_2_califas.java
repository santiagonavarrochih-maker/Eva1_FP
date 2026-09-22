/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_califas;
import java.util.Scanner;
/**
 *
 * @author bisonte
 */
public class Eva2_2_califas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cali;
          Scanner captu = new Scanner(System.in);
        System.out.println("cual es tu edad?");
        cali = captu.nextInt();
        if (cali >= 70){
        System.out.println("Has acreditado la materia");
        }
        else {
                System.out.println("no acreditaste, vas para recu pa");
                }
    }
    
}
