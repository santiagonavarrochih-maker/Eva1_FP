/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24factorial;

import java.util.Scanner;

public class eva2_24Factorial {
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n = captu.nextInt();
     int factorial = 1;
        System.out.print("Multiplicaciones: ");
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            if (i < n) {
                System.out.print(i + " x ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println();
        System.out.println("El factorial de " + n + " es: " + factorial);
        captu.close();
    }
}

