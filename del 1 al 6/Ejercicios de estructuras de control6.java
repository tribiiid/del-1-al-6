import java.util.Scanner;

class EjerciciosDeEstructurasDeControl6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double primero = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double segundo = scanner.nextDouble();

        System.out.print("Introduce el tercer número: ");
        double tercero = scanner.nextDouble();

        double mayor;

        if (primero >= segundo && primero >= tercero) {
            mayor = primero;
        } else if (segundo >= primero && segundo >= tercero) {
            mayor = segundo;
        } else {
            mayor = tercero;
        }

        System.out.println("El número mayor es: " + mayor);
        scanner.close();
    }
}