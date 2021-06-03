package aulas.exercicio2;

public class metodoCarro {



    public static void main(String[] args) {
        Carro carro = new Carro("Dodge", "Journey", 2020);

        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getAno());
    }
}
