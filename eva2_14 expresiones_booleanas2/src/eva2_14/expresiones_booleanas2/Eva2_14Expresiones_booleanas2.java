/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14.expresiones_booleanas2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_14Expresiones_booleanas2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner captu = new Scanner(System.in);
      int promedio;
      String equipo;
      System.out.println("indica tu promedio");
      promedio = captu.nextInt();
      captu.nextLine();
      System.out.println("Eres de algun representativo?");
      equipo = captu.nextLine();
      captu.nextLine();
      if (promedio >= 95 || equipo.equals("S"))
         System.out.println("Eres valido para conseguir la beca");
      else
         System.out.println("no puedes tener beca");
         
      
      
      
   }
   
}
