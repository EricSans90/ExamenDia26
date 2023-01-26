import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del array de contraseñas: ");
        int tamaño = inputValue.nextInt();
        System.out.print("Ingrese la longitud de las contraseñas: ");
        int longitud = inputValue.nextInt();
        Password[] passwords = new Password[tamaño];
        boolean[] esFuerte = new boolean[tamaño];
        for (int i = 0; i < tamaño; i++) {
            passwords[i] = new Password(longitud);
            esFuerte[i] = passwords[i].esFuerte();
            System.out.println("Contraseña " + (i + 1) + ": " + passwords[i].getContraseña() + " " + esFuerte[i]);
        }
    }
}
