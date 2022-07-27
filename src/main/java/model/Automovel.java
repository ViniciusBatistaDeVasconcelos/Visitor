package model;

public abstract class Automovel {

    private String marca;
    private String modelo;
    private String ano;
    private String renavam;
    private String placa;
    private String cor;
    private float tanqueCombustivel;

    public Automovel(String marca, String modelo, String ano, String renavam,
                     String placa, String cor, float tanqueCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.renavam = renavam;
        this.placa = placa;
        this.cor = cor;
        this.tanqueCombustivel = tanqueCombustivel;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAno() {
        return ano;
    }

    public String getRenavam() {
        return renavam;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public float getTanqueCombustivel() {
        return tanqueCombustivel;
    }

    public abstract String aceitar(Visitor visitor);
}
