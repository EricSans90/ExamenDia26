public class Circulo {
        private float radio;
        private final float PI = (float) Math.PI;

        // Constructor por defecto
        public Circulo() {
            this.radio = 1;
        }
        // Constructor con radio que le ponemos nosotros
        public Circulo(float radio) {
            this.radio = radio;
        }
        // Constructor con objeto de la clase Segment
        public Circulo(Segment SegmentoTest) {
            this.radio= (float) SegmentoTest.module();
        }
        // Método para calcular el área
        public float calcularArea() {
            return PI * (float) Math.pow(this.radio, 2);
        }
        // Método para calcular la longitud de la circunferencia
        public float calcularLongitud() {
            return 2 * PI * this.radio;
        }
        // Método set para cambiar el radio
        public void setRadio(float radio) {
            this.radio = radio;
        }
        // Método get para obtener el radio
        public float getRadio() {
            return this.radio;
        }
        // Método de clase para calcular el área
        public static float calcularArea(float radio) {
            return (float) Math.PI * (float) Math.pow(radio, 2);
        }
        // Método de clase para calcular la longitud de la circunferencia
        public static float calcularLongitud(float radio) {
            return 2 * (float) Math.PI * radio;
        }
}
