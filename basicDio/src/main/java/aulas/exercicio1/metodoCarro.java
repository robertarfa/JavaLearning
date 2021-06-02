package aulas.exercicio1;

public class metodoCarro {

    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(carro.getNumeroPessoasNoCarro());
        System.out.println(carro.addPessoasNoCarro());
        System.out.println("Quantas pessoas tem no carro? " + carro.numeroPessoasNoCarro);
        System.out.println(carro.addPessoasNoCarro());
        System.out.println("Quantas pessoas tem no carro? " + carro.numeroPessoasNoCarro);
        System.out.println(carro.removePessoasNoCarro());
        System.out.println("Quantas pessoas tem no carro? " + carro.numeroPessoasNoCarro);
    }
}
