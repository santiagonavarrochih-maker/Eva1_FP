/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17covid;

import java.util.Scanner;

public class Eva2_17covid {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int edad;
        char enfermedadCronica;
        double peso, estatura, imc;
        boolean riesgo = false;
        
        System.out.print("Ingrese la edad: ");
        edad = entrada.nextInt();
        
        System.out.print("Tiene enfermedad cronica? (s/n): ");
        enfermedadCronica = entrada.next().toLowerCase().charAt(0);
        
        System.out.print("Ingrese el peso en kilogramos: ");
        peso = entrada.nextDouble();
        
        System.out.print("Ingrese la estatura en metros: ");
        estatura = entrada.nextDouble();
        
        imc = peso / (estatura * estatura);
        
        if (edad > 65) {
            riesgo = true;
        }
        
        if (enfermedadCronica == 's') {
            riesgo = true;
        }
        
        if (imc >= 25) {
            riesgo = true;
        }
        
        System.out.println("IMC: " + imc);
        
        if (riesgo) {
            System.out.println("La persona SI presenta riesgo ante COVID-19");
        } else {
            System.out.println("La persona NO presenta riesgo ante COVID-19");
        }
        
        entrada.close();
    }
}