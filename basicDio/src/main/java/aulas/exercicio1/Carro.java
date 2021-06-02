package aulas.exercicio1;

public class Carro {
    public int numeroPessoasNoCarro;

  public int getNumeroPessoasNoCarro(){
      return numeroPessoasNoCarro;
  }

  public int addPessoasNoCarro(){
      return numeroPessoasNoCarro = numeroPessoasNoCarro+ 1;
  }

    public int removePessoasNoCarro(){
        return numeroPessoasNoCarro = numeroPessoasNoCarro - 1;
    }

}
