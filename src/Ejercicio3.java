import java.util.Scanner;

    public class Ejercicio3 {
        public static void main(String[] args) {
            int n, sum;
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingresa el número de números pares consecutivos que quieres sumar: ");
            n = sc.nextInt();

            sum = 0;
            for (int i = 2; i <= (2 * n); i += 2) {
                sum += i;
            }

            System.out.println("La suma de los primeros " + n + " números pares es: " + sum + ".");
        }
    }

