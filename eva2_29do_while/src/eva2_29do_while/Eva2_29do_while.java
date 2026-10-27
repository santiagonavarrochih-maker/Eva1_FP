/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29do_while;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_29do_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int monto, cuenta = 5000;
        do{
            System.out.println("Cuanto dienro quieres sacar?");
            monto = captu.nextInt();
            cuenta = cuenta - monto;   
            System.out.println("tu saldo es =" + cuenta);
            
            System.out.println("Saldo restante: $" + cuenta); 
            
        }while(cuenta > 0);
        System.out.println("ufa papito ya no traes lana");
    }
    
}
