public class mensagem {
    public void saudacao(int valor){
        if(valor>0 && valor>24){
            System.out.println("Hora inválida");
        }
         else if(valor>=6 && valor<=12){
            System.out.println("Bom dia!!");
        }
         else if(valor>12 && valor<18){
            System.out.println("Bom Tarde!!");
        } else System.out.println("Boa noite!!");
    }

}
