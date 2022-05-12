import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float nota;
        System.out.println("Nota :");
        nota = scanner.nextFloat();

        while(nota < 0 | nota > 10){
            System.out.println("Nota inválida");
            System.out.println("Nota :");
            nota = scanner.nextFloat();
        }

        System.out.println("A nota inserida foi : "+ nota);
    }
}
