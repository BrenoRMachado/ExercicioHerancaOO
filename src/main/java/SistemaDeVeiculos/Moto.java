package SistemaDeVeiculos;

public class Moto extends Veiculo {

    public Moto(String marca, String modelo, double precoBase) {
        super(marca, modelo, precoBase);
    }

    @Override
    public double calcularCusto() {
        return getPrecoBase() * 1.1;
    }
}