package SistemaDeVeiculos;

public class Carro extends Veiculo {

    public Carro(String marca, String modelo, double precoBase) {
        super(marca, modelo, precoBase);
    }

    @Override
    public double calcularCusto() {
        return getPrecoBase() * 1.2;
    }
}
