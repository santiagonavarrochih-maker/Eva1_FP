/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_parquimetro;

import java.util.Scanner;

public class Parquimetro {
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de horas: ");
        int horas = captu.nextInt();

        // Validar que sea mayor a 0
        if (horas <= 0) {
            System.out.println("Cantidad de horas inválida.");
        } else {
            int total;

            // Si son 10 o más horas, se cobra tarifa plana de 150
            if (horas >= 10) {
                total = 150;
            } else {
                total = horas * 25;
            }

            System.out.println("Horas: " + horas);
            System.out.println("Total a pagar: $" + total);
        }
    }
}