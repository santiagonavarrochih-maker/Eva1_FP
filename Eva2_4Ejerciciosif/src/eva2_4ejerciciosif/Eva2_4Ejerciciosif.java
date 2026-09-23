package eva2_4ejerciciosif;

import java.util.Scanner;

public class Eva2_4Ejerciciosif {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            
            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            
            double bono;
            
            if (salario < 12000) {
                bono = salario * 0.10;
            } else {
                bono = salario * 0.05;
            }
            
            double salarioFinal = salario + bono;
            
            System.out.println("Nombre: " + nombre);
            System.out.println("Salario: " + salario);
            System.out.println("Bono: " + bono);
            System.out.println("Salario final: " + salarioFinal);
        }
    }
}