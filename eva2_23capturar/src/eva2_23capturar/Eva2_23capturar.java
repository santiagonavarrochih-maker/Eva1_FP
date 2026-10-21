/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23capturar;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_23capturar {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner captu = new Scanner(System.in);
      int cant, califa;
      double promedio; 
      double suma = 0;
      System.out.println("Cuabtas calificaciones vas a capturar?");
      cant = captu.nextInt();
      captu.nextLine();
      for(int i = 1; i <= cant; i++) {
         System.out.println("Captura la calificacion");
         double calificacion = captu.nextDouble();
            suma += calificacion;
         
      }
     promedio = suma / cant;

        System.out.println("La suma total es: " + suma);
        System.out.println("El promedio es: " + promedio);
     
      
   }
   
}
