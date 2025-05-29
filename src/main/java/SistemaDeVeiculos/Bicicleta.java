package SistemaDeVeiculos;

public class Bicicleta extends Veiculo {

    public Bicicleta(String marca, String modelo, double precoBase) {
        super(marca, modelo, precoBase);
    }

    @Override
    public double calcularCusto() {
        return getPrecoBase() * 1.05;
    }
}
