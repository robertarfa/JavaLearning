// 1 - Pacote
package intro;

// 2 - Referencia as bibliotecas

import java.security.Principal;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracteristicas

    // 3.2 - Metodos e funcoes
    // funcao static void main eh a primeira funcao a ser carregada
    // void eh um metodo - vai receber valores
    public static void main(String[] args){
        System.out.println("***Sout atalho para system.out.println***");
        System.out.println("***Args funciona como uma caixinha para guardar valores***");
        //System.out.print("***Esse nao vai pular a linha!***");

//        Medidas m = new Medidas();
//        m.calcularAreaModoExtenso();
//        m.calcularAreaModoCompacto();

        //com static
        calcularAreaModoExtenso();
        calcularAreaModoCompacto();
    }


    public static void calcularAreaModoExtenso(){
        //Calculo de area - Exemplo: o tamanho do tapete ou piso
        int largura;
        int comprimento;
        int resultado;

        largura = 4;
        comprimento = 3;

        resultado = largura * comprimento;
        System.out.println("Extenso - Para a largura de "+ largura +
                "m e o comprimento de " + comprimento + "m" +
                " a area eh de " + resultado + " m²");
    }

    public static void calcularAreaModoCompacto(){
        //Calculo de area - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Compacto - Para a largura de "+ largura +
                "m e o comprimento de " + comprimento + "m" +
                " a area eh de " + largura * comprimento + " m²");

    }
}
