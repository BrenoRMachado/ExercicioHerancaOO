package SistemaDeContasBancarias;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String numeroConta, double saldo, String titular)
    {
        super(numeroConta, saldo, titular);
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor do depósito não pode ser negativo ou nulo!");
        }
        setSaldo(getSaldo() + valor - 0.50);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor do saque não pode ser negativo ou nulo!");
        }
        if (getSaldo() < valor) {
            throw new IllegalArgumentException("Saldo insuficiente para o saque!");
        }
        setSaldo(getSaldo() - valor);
    }

    @Override
    public double calcularJuros() {
        return 0;
    }

    public void aplicarTaxaManutencaoMensal() {
        setSaldo(getSaldo() - 10.00);
    }
}

