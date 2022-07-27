package model;

public class Moto extends Automovel {

    public Moto(String marca, String modelo, String ano, String renavam,
                String placa, String cor, float tanqueCombustivel) {
        super(marca, modelo, ano, renavam, placa, cor, tanqueCombustivel);
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirMoto(this);
    }
}
