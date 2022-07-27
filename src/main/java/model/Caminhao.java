package model;

public class Caminhao extends Automovel {
    private Container container;

    public Caminhao(String marca, String modelo, String ano, String renavam,
                    String placa, String cor, float tanqueCombustivel, Container container) {
        super(marca, modelo, ano, renavam, placa, cor, tanqueCombustivel);
        this.container = container;
    }

    public Container getContainer() {
        return container;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirCaminhao(this);
    }
}
