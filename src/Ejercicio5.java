public class Ejercicio5 {
        public static int productArray(int[] input) {
            if (input == null || input.length == 0) {
                return 0;
            }
            int product = 1;
            for (int i = 0; i < input.length; i++) {
                if (i % 2 == 0) {
                    product = product*input[i];
                }
            }
            return product;
        }
    //lo quiero testear, parece que funciona bien
    /*
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5};
        System.out.println(Ejercicio5.productArray(test1));
        int[] test2 = {-1, 2, 3, 4, 5};
        System.out.println(Ejercicio5.productArray(test2));
        int[] test3 = {0, 0, 0, 0, 0};
        System.out.println(Ejercicio5.productArray(test3));
        int[] test4 = new int[5];
        System.out.println(Ejercicio5.productArray(test4));
        int[] test5 = new int[0];
        System.out.println(Ejercicio5.productArray(test5));
    }

     */
}
