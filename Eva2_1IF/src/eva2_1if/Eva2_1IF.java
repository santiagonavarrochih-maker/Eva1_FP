/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class Eva2_1IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        Scanner captu = new Scanner(System.in);
        System.out.println("cual es tu edad?");
        edad = captu.nextInt();
        if (edad >= 18){
        System.out.println("Bienvenido, puedes entrar");
        }
        else {
                System.out.println("no puedes entrar");
                }
        
    }
    
}
