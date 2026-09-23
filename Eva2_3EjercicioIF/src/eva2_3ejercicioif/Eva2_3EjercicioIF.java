package eva2_3ejercicioif;

import java.util.Scanner;

public class Eva2_3EjercicioIF {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Precio: ");
            double precio = sc.nextDouble();
            
            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();
            
            double subtotal = precio * cantidad;
            double descuento = 0;
            
            if (subtotal > 1000) {
                descuento = subtotal * 0.10;
            }
            
            double total = subtotal - descuento;
            
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Total: $" + total);
        }
    }
}