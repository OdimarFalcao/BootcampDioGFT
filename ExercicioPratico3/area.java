/* Cálculo da área de quadriulateros usando sobrecarga de métodos */
public class area {

    public static float calculararea(float lado){
     return (float) Math.pow(lado,2);
    }
    public static float calculaarea(float lado1, float lado2) {
       return lado1 * lado2;
    }

    public static double calculaarea(double baseMaior, double baseMenor, double h) {

        return ((baseMaior+baseMenor)*h) / 2;
    }

    public static double calculaarea(double diagonal1, double diagonal2) {

        return ((diagonal1 * diagonal2)/2);
    }

}