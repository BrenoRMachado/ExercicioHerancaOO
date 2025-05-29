package SistemaDeContasBancarias;

public class ContaPolpanca extends ContaBancaria{

    public ContaPolpanca (String numeroConta, int saldo, String titular)
    {
        super(numeroConta, saldo, titular);
    }

    @Override
    public void depositar(double valor) {
        setSaldo(valor);
    }

    @Override
    public void sacar(double valor)
    {
        retirarValor(valor);
    }

    @Override
    public double calcularJuros()
    {
        return 100;
    }
}
