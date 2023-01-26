import java.util.Scanner;
public class Ejercicio6 {

        public static void main(String[] args) {
            //inicializamos char
            char[] arrayTest = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't'};
            Scanner sc = new Scanner(System.in);
            int index;
            //pedimos hasta que index sea del tamaño adecuado
            do {
                //pido la posición al usuario, no el índice por si no sabe que empieza por 0
                System.out.print("Ingresa la posición del elemento a eliminar (desde el 1 hasta el " + (arrayTest.length) + "): ");
                index = sc.nextInt();
            } while (index < 0 || index >= arrayTest.length);

            // movemos el elemento específico al final del array
            char temp = arrayTest[index];
            for (int i = index; i < arrayTest.length - 1; i++) {
                arrayTest[i] = arrayTest[i + 1];
            }
            arrayTest[arrayTest.length - 1] = temp;

            System.out.print("Array después de eliminar el elemento en el índice " + index + ": ");
            for (int i = 0; i < arrayTest.length; i++) {
                System.out.print(arrayTest[i] + " ");
            }
        }
}
