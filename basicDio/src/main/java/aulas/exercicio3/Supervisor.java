package aulas.exercicio3;

public class Supervisor extends Funcionario {

    @Override
    public double calculaImpostoAPagar() {
        return this.salario * this.imposto;
    }
}
