import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo:");
        float radio = inputValue.nextFloat();

        // Test método static
        //System.out.println("área de círculo de radio 1 "+ Circulo.calcularArea(1));

        float area = Circulo.calcularArea(radio);
        float longitud = Circulo.calcularLongitud(radio);
        System.out.println("Área: " + area + " Longitud: " + longitud);

        Circulo circulo = new Circulo(10);
        float areaCirculo = circulo.calcularArea();
        float longitudCirculo = circulo.calcularLongitud();
        System.out.println("Área del círculo con radio 10: " + areaCirculo + " Longitud: " + longitudCirculo);

    }
}
