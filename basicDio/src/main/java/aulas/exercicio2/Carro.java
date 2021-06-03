package aulas.exercicio2;

public class Carro {

    private String Marca;
    private String Modelo;
    private String Variante;
    private Integer Ano;

    public Carro(String marca, String modelo, Integer ano) {
        Marca = marca;
        Modelo = modelo;
        Ano = ano;
    }

    public Integer getAno() {
        return Ano;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }
}
