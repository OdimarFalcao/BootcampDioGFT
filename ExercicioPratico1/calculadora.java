package ExercicioPratico1.src;
/*Calculadora de operações básicas*/
public class calculadora {
    float a,b;
    public calculadora(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public void soma(){
        System.out.println("A soma é igual a : "+(a+b));
    }
    public void subtracao(){
        System.out.println("A subtração é igual a : " + (a-b));
    }
    public void multplicacao(){
        System.out.println("A multiplicação é igual a : "+(a*b));
    }
    public void divisao(){
        if(b == 0) System.out.println("Erro!!");
        System.out.println("A divisão é igual a : "+(a/b));
    }

}
