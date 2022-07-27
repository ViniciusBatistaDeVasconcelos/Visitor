package model;

public class Container {

    private float altura;
    private float comprimento;
    private float largura;

    public Container(float altura, float comprimento, float largura) {
        this.altura = altura;
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public String toString() {
        return "Container{" +
                "altura=" + altura +
                ", comprimento=" + comprimento +
                ", largura=" + largura +
                '}';
    }
}
