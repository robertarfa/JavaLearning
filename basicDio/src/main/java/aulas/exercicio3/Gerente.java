package aulas.exercicio3;

public class Gerente extends Funcionario {

    @Override
    public double calculaImpostoAPagar() {
        return this.salario * this.imposto;
    }
}
