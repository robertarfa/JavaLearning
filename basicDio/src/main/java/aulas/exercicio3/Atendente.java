package aulas.exercicio3;

public class Atendente extends Funcionario {

    @Override
    public double calculaImpostoAPagar() {
        return this.salario * this.imposto;
    }
}
