/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5;
import java.util.Scanner;
/**
 *
 * @author bisonte
 */
public class Eva2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad, credencial;
        Scanner captu = new Scanner(System.in);
        System.out.println("cual es tu edad?");
        edad = captu.nextInt();
        if (edad >= 18){
            System.out.println("Tienes credencial de elector= (1 si 2 no):");
            credencial = captu.nextInt();
            if (credencial == 1) { 
                System.out.println(" Puedes pasar");
               
            }else{ System.out.println("no puedes pasar");
            
            }
            
        }else{ System.out.println(" vete de aqui");
        }
        }
        
        
        
    }
    

