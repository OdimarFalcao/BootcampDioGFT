/* Cálculo da área de quadriulateros usando sobrecarga de métodos */
public class area {
    public static void calculararea(float lado){
        System.out.println("A área do quadrado é : "+ (Math.pow(lado,2)));
    }
    public static void calculaarea(double lado1, double lado2) {

        System.out.println("Área do retângulo é :" + lado1 * lado2);
    }

    public static void calculaarea(double baseMaior, double baseMenor, double h) {

        System.out.println("Área do trapézio é:" + ((baseMaior+baseMenor)*h) / 2);
    }

    public static void calculaarea(float diagonal1, float diagonal2) {

        System.out.println("Área do losango é : " + (diagonal1 * diagonal2)/2);
    }

}
