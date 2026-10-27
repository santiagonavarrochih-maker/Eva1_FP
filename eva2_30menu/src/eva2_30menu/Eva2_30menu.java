/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_30menu;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_30menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("--------Menu del sistema-------");
            System.out.println("1. ventas");
            System.out.println("2. compras");
            System.out.println("3. proveedores");
            System.out.println("4. clientes");
            System.out.println("5. salir");
            opcion = captu.nextInt();
            captu.nextLine();
        }while(opcion != 5);
        System.out.println("Saliendo del sistema");
        
        
    }
    
}
