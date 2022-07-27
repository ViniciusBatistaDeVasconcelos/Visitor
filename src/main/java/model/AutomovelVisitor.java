package model;

public class AutomovelVisitor implements Visitor {

    public String exibir(Automovel automovel) {
        return automovel.aceitar(this);
    }

    @Override
    public String exibirCarro(Carro carro) {
        return "Carro{" +
                "qtdPortas=" + carro.getQtdPortas() +
                ", marca='" + carro.getMarca() + '\'' +
                ", modelo='" + carro.getModelo() + '\'' +
                ", ano='" + carro.getAno() + '\'' +
                ", renavam='" + carro.getRenavam() + '\'' +
                ", placa='" + carro.getPlaca() + '\'' +
                ", cor='" + carro.getCor() + '\'' +
                ", tanqueCombustivel=" + carro.getTanqueCombustivel() +
                '}';
    }

    @Override
    public String exibirCaminhao(Caminhao caminhao) {
        return "Caminhao{" +
                "container=" + caminhao.getContainer() +
                ", marca='" + caminhao.getMarca() + '\'' +
                ", modelo='" + caminhao.getModelo() + '\'' +
                ", ano='" + caminhao.getAno() + '\'' +
                ", renavam='" + caminhao.getRenavam() + '\'' +
                ", placa='" + caminhao.getPlaca() + '\'' +
                ", cor='" + caminhao.getCor() + '\'' +
                ", tanqueCombustivel=" + caminhao.getTanqueCombustivel() +
                '}';
    }

    @Override
    public String exibirMoto(Moto moto) {
        return "Moto{" +
                "marca='" + moto.getMarca() + '\'' +
                ", modelo='" + moto.getModelo() + '\'' +
                ", ano='" + moto.getAno() + '\'' +
                ", renavam='" + moto.getRenavam() + '\'' +
                ", placa='" + moto.getPlaca() + '\'' +
                ", cor='" + moto.getCor() + '\'' +
                ", tanqueCombustivel=" + moto.getTanqueCombustivel() +
                '}';
    }
}
