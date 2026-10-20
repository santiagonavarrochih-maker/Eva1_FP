/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19switch2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class Eva2_19switch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        String carrera;
        System.out.println("Introduzca la carrera (Sistemas, Informatica, Administracion)");
        carrera = captu.nextLine();
        switch (carrera) {
            case "Sistemas":
                System.out.println("ISC");
                break;
            case "Informatica":
                System.out.println("INF");
                break;
            case "Administración":
                System.out.println("LA");
                break;
            default: 
                System.out.println("Carrera no valida");
        }
    }
    
}
