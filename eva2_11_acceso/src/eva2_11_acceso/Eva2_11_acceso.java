/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_acceso;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Eva2_11_acceso {

    public static void main(String[] args) {
        // Constantes con el usuario y contraseña correctos
        final String USUARIO_CORRECTO = "admin";
        final String CONTRASENA_CORRECTA = "1234";

        Scanner captu = new Scanner(System.in);

        System.out.print("Ingrese el usuario: ");
        String usuario = captu.nextLine();

        System.out.print("Ingrese la contrasena: ");
        String contrasena = captu.nextLine();

        // Validar credenciales
        if (usuario.equals(USUARIO_CORRECTO) && contrasena.equals(CONTRASENA_CORRECTA)) {
            System.out.println("Acceso concedido. Bienvenido, " + usuario + ".");
        } else {
            System.out.println("Acceso denegado. Usuario o contrasena incorrectos.");
        }

        captu.close();
    }
}