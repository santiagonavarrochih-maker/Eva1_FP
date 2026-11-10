/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_12;

public class Eva3_12 {

    public static void main(String[] args) {
        String dias[] = {"domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        int califas[][] = { {50, 100, 75, 30}, {80, 66, 22, 10} };

        for (int i = 0; i < califas.length; i++) {
            for (int j = 0; j < califas[i].length; j++) {
                System.out.print("[" + califas[i][j] + "]");
            }
            System.out.println("");
        }
    }
}