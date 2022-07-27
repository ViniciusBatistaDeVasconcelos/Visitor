package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AutomovelVisitorTest {

    AutomovelVisitor visitor;

    @BeforeEach
    void setUp() {
        visitor = new AutomovelVisitor();
    }

    @Test
    void deveExibirCarro() {
        Automovel automovel = new Carro(
                "Porsche", "968 Cabriolet 3.0", "1994", "56581208477", "GNZ-6258",
                "Amarelo", 74.0f, 2);
        assertEquals(
                "Carro{" +
                        "qtdPortas=2, " +
                        "marca='Porsche', " +
                        "modelo='968 Cabriolet 3.0', " +
                        "ano='1994', " +
                        "renavam='56581208477', " +
                        "placa='GNZ-6258', " +
                        "cor='Amarelo', " +
                        "tanqueCombustivel=74.0}",
                visitor.exibir(automovel));
    }

    @Test
    void deveExibirCaminhao() {
        Container container = new Container(2.63f, 7.32f, 2.48f);
        Automovel automovel = new Caminhao(
                "Volvo", "FH 13 460 6X4T", "2016", "31118488260", "JFK-8691",
                "Prata", 495.0f, container);

        assertEquals(
                "Caminhao{" +
                        "container=" +
                        "Container{altura=2.63, comprimento=7.32, largura=2.48}, " +
                        "marca='Volvo', " +
                        "modelo='FH 13 460 6X4T', " +
                        "ano='2016', " +
                        "renavam='31118488260', " +
                        "placa='JFK-8691', " +
                        "cor='Prata', " +
                        "tanqueCombustivel=495.0}",
                visitor.exibir(automovel));
    }

    @Test
    void deveExibirMoto() {
        Automovel automovel = new Moto(
                "Yamaha", "Fazer 250", "2023", "55742176778", "MZT-1184",
                "Preta", 13.6f);
        assertEquals(
                "Moto{" +
                        "marca='Yamaha', " +
                        "modelo='Fazer 250', " +
                        "ano='2023', " +
                        "renavam='55742176778', " +
                        "placa='MZT-1184', " +
                        "cor='Preta', " +
                        "tanqueCombustivel=13.6}",
                visitor.exibir(automovel));
    }
}