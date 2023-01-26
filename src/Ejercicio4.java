public class Ejercicio4 {
        public static int contarConsonantes(String stringEntrada) {
            int count = 0;
            for (int i = 0; i < stringEntrada.length(); i++) {
                char c = stringEntrada.charAt(i);
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E' && c != 'I'
                        && c != 'O' && c != 'U' && Character.isLetter(c)) {
                    count++;
                }
            }
            return count;
        }
}
