/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28do_while;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_28do_while {
static final String USUARIO = "admin";
static final String CONTRA = "1234";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        String usu, pwd;
        do{
            System.out.println("Usuario;");
            usu = captu.nextLine();
            System.out.println("contraseña:");
            pwd = captu.nextLine();
        }while(!usu.equals(USUARIO) || !pwd.equals(CONTRA));
        System.out.println("Acceso concedido!");
        
                
    }
    
}
