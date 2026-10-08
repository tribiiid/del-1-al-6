import java.util.Scanner;

class EjerciciosDeEstructurasDeControl5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero no negativo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            long factorial = 1;
            int contador = numero;

            while (contador > 1) {
                factorial *= contador;
                contador--;
            }

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        scanner.close();
    }
}