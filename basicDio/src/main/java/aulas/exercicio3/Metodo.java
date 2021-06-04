package aulas.exercicio3;

public class Metodo {

    public static void main(String[] args) {
        Funcionario gerente = new Funcionario();
        gerente.setSalario(10000);
        gerente.setImposto(0.1);
        System.out.println("Imposto gerente: " + gerente.calculaImpostoAPagar());

        Funcionario supervisor = new Funcionario();
        supervisor.setSalario(10000);
        supervisor.setImposto(0.05);
        System.out.println("Imposto supervisor: " + supervisor.calculaImpostoAPagar());

        Funcionario atendente = new Funcionario();
        atendente.setSalario(10000);
        atendente.setImposto(0.01);
        System.out.println("Imposto atendente: " + atendente.calculaImpostoAPagar());
    }
}
