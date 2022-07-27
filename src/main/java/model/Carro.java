package model;

public class Carro extends Automovel {
    private int qtdPortas;

    public Carro(String marca, String modelo, String ano, String renavam,
                 String placa, String cor, float tanqueCombustivel, int qtdPortas) {
        super(marca, modelo, ano, renavam, placa, cor, tanqueCombustivel);
        this.qtdPortas = qtdPortas;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirCarro(this);
    }
}
