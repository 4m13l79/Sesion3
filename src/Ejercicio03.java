import java.util.Scanner;
public class Ejercicio03 {
	public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese un n�mero (1-7): ");
        int numero = lectura.nextInt();
        if (numero == 1) {
            System.out.println("Lunes");
        } else if (numero == 2) {
            System.out.println("Martes");
        } else if (numero == 3) {
            System.out.println("Mi�rcoles");
        } else if (numero == 4) {
            System.out.println("Jueves");
        } else if (numero == 5) {
            System.out.println("Viernes");
        } else if (numero == 6) {
            System.out.println("S�bado");
        } else if (numero == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("N�mero fuera de rango.");
        }
        lectura.close();
    }
}
