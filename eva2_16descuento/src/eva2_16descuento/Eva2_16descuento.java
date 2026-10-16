/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16descuento;

import java.util.Scanner;

public class Eva2_16descuento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int edad;
        char tieneCredencialEstudiante;
        char tieneCredencialInsen;
        boolean tieneDescuento = false;
        
        System.out.println("VERIFICACION DE DESCUENTO EN AUTOBUS");
        
        // Solicitar la edad
        System.out.print("Ingrese la edad de la persona: ");
        edad = entrada.nextInt();
        
        // Ser menor de edad
        if (edad < 18) {
            tieneDescuento = true;
            System.out.println(" Es menor de edad.");
        }
        
        // Ser mayor de 60 años con credencial del INSEN
        if (edad > 60) {
            System.out.print("¿Cuenta con credencial del INSEN vigente? (s/n): ");
            tieneCredencialInsen = entrada.next().toLowerCase().charAt(0);
            
            if (tieneCredencialInsen == 's') {
                tieneDescuento = true;
                System.out.println(" Es mayor de 60 años con credencial INSEN.");
            }
        }
        
        // Ser estudiante con credencial vigente
        System.out.print("¿Es estudiante y cuenta con credencial vigente? (s/n): ");
        tieneCredencialEstudiante = entrada.next().toLowerCase().charAt(0);
        
        if (tieneCredencialEstudiante == 's') {
            tieneDescuento = true;
            System.out.println("Es estudiante con credencial vigente.");
        }
        
        // Mostrar resultado final
        System.out.println("\n--- RESULTADO ---");
        if (tieneDescuento) {
            System.out.println("✅ La persona SÍ tiene derecho al descuento en el autobus.");
        } else {
            System.out.println("❌ La persona NO tiene derecho al descuento en el autobus.");
        }
        
        entrada.close();
    }
}