/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_califas;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Eva2_10_califas {
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);

        System.out.print("Ingrese la calificacion (0 - 100): ");
        double nota = captu.nextDouble();

        if (nota < 0 || nota > 100) {
            System.out.println("Calificacion invalida. Debe estar entre 0 y 100.");
        } 
        else if (nota >= 90) {
            System.out.println("Sobresaliente");
        } 
        else if (nota >= 80) {
            System.out.println("Bueno");
        } 
        else if (nota >= 70) {
            System.out.println("Aceptable");
        } 
        else {
            System.out.println("Insuficiente");
        }

        captu.close();
    }
}