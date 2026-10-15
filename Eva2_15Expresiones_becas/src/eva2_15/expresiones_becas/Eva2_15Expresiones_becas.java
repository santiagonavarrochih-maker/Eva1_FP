/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package eva2_15.expresiones_becas;

import java.util.Scanner;

public class Eva2_15Expresiones_becas {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);

        int promedio;
        double ingresos;

        System.out.println("Indica tu promedio");
        promedio = captu.nextInt();

        System.out.println("Indica los ingresos familiares");
        ingresos = captu.nextDouble();

        if (promedio > 80 && ingresos < 10000)
            System.out.println("Eres valido para conseguir la beca");
        else
            System.out.println("No puedes tener beca");

        captu.close();
    }
}

