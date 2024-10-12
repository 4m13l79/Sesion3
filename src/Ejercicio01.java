import java.util.Scanner;
public class Ejercicio01 {
public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = lectura.nextInt();
        if (edad >= 18) {
            System.out.println("Usted es mayor de edad.");
        }
        lectura.close();
    }	
}

