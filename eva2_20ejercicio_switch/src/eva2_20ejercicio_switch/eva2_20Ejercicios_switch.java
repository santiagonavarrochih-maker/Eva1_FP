/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20ejercicio_switch;

import java.util.Scanner;

public class eva2_20Ejercicios_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer valor entero: ");
        int a = sc.nextInt();

        System.out.print("Ingresa el segundo valor entero: ");
        int b = sc.nextInt();

        System.out.println("Selecciona la operacion:");
        System.out.println("1 = Suma");
        System.out.println("2 = Resta");
        System.out.println("3 = Multiplicacion");
        System.out.println("4 = Division");
        System.out.print("Opcion: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (a + b));
                break;
            case 2:
                System.out.println("Resultado: " + (a - b));
                break;
            case 3:
                System.out.println("Resultado: " + (a * b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Error: no se puede dividir entre cero.");
                } else {
                    System.out.println("Resultado: " + ((double) a / b));
                }
                break;
            default:
                System.out.println("Operacion invalida");
                break;
        }

        sc.close();
    }
}