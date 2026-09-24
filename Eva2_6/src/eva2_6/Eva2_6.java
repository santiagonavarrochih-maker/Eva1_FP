/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6;
import java.util.Scanner;
/**
 *
 * @author bisonte
 */
public class Eva2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        Scanner captu = new Scanner(System.in);
        System.out.println("Que introduce el numero del dia de la semana");
        dia = captu.nextInt();1
        if (dia ==1) {
            System.out.println("Domingo");
        }
         else if (dia ==2){
                    System.out.println("lunes");        
                    }
            else if (dia ==3){
                    System.out.println("martes");        
                    }
            else if (dia ==4){
                    System.out.println("miercoes");        
                    }
            else if (dia ==5){
                    System.out.println("jueves");        
                    }
            else if (dia ==6){
                    System.out.println("viernes");        
                    }
            else if (dia ==7){
                    System.out.println("sabado");        
                    }
        }
    }
    

