package aulas.exercicio3;

public class Funcionario {

    public double salario;
    public double imposto;

    public double getSalario(){
        return  salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public  double getImposto(){
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calculaImpostoAPagar(){
       return this.salario * this.imposto;
    }


}
