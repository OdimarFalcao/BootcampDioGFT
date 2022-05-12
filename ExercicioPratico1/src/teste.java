package ExercicioPratico1.src;

public class teste {
    public static void main(String[] args) {
        calculadora calculadora = new calculadora( 20,5);
        calculadora.soma();
        calculadora.subtracao();
        calculadora.multplicacao();
        calculadora.divisao();

        System.out.println();
        mensagem mensagem = new mensagem();
        mensagem.saudacao(2);

        System.out.println();
        emprestimo emprestimo = new emprestimo(10000,24,2);
        emprestimo.calcularEmprestimo();

    }
}
