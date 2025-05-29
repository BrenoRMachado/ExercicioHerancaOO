package SistemaDeContasBancarias;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca (String numeroConta, double saldo, String titular)
    {
        super(numeroConta, saldo, titular);
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor do depósito não pode ser negativo ou nulo!");
        }
        setSaldo(getSaldo() + valor);
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
        double juros = getSaldo() * 0.005;
        setSaldo(getSaldo() + juros);
        return juros;
    }
}
