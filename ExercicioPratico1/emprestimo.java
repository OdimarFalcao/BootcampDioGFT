package ExercicioPratico1.src;

public class emprestimo {
    public float valor_emprestimo,num_parcelas,taxa,total;

    public emprestimo(float valor_emprestimo, float num_parcelas, float taxa) {
        this.valor_emprestimo = valor_emprestimo;
        this.num_parcelas = num_parcelas;
        this.taxa = taxa;
    }

    public void calcularEmprestimo(){
        float valor_parcela = (valor_emprestimo/num_parcelas);
        for (int i = 1; i <= num_parcelas ; i++) {
            total+= valor_parcela + (taxa*valor_emprestimo/100);
            valor_emprestimo -= valor_parcela;
        }
        System.out.println(total);
    }


}
