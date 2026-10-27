/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_31do_while_averiguar;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_31do_while_averiguar {
public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        
        // Número secreto (puedes cambiarlo o generarlo con Math.random())
        final int NUMERO_SECRETO = 7;
        int intento;
        int contador = 0;
        
        System.out.println("=== ADIVINA EL NÚMERO ===");
        System.out.println("He pensado un número entre 1 y 10.");
        System.out.println("¡No podrás salir hasta adivinarlo!");
        
        do {
            System.out.println("\nIngresa tu intento:");
            intento = captu.nextInt();
            contador++;
            
            if (intento < NUMERO_SECRETO) {
                System.out.println("Muy bajo. Intenta de nuevo.");
            } else if (intento > NUMERO_SECRETO) {
                System.out.println("Muy alto. Intenta de nuevo.");
            } else {
                System.out.println("¡Correcto! El número era " + NUMERO_SECRETO);
                System.out.println("Lo lograste en " + contador + " intento(s).");
            }
            
        } while (intento != NUMERO_SECRETO);
        
        System.out.println("\n¡Fin del juego! 🎉");
    }
}
