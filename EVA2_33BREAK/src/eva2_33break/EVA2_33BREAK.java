/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_33break;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_33BREAK {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner captu = new Scanner(System.in);
      int nume;
      int valor = 10;
      while(true){
         System.out.println("introduce un valor:");
         nume = captu.nextInt();
         captu.nextLine();
         if(nume == valor){
            System.out.println("adivinaste, el valor es 10, ganaste!");
         }
            
      }
      
   }
   
}
