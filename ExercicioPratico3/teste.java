public class teste {
    public static void main(String[] args) {
        double areaQuadrado = area.calculararea(4);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = area.calculaarea(5,5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = area.calculaarea(7,8,9);
        System.out.println("Área do trapézio:" + areaTrapezio);

        double areaLosango = area.calculaarea(5d,5d);
        System.out.println("Área do trapézio:" + areaLosango);
    }
}
