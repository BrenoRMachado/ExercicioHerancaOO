package SistemaDeContasBancarias;

public abstract class ContaBancaria {

    private String  numeroConta;
    private double saldo;
    private String titular;

    public ContaBancaria(String numeroConta, int saldo, String titular)
    {
        setNumeroConta(numeroConta);
        setSaldo(saldo);
        setTitular(titular);
    }
    public String getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        if(numeroConta.trim().isEmpty())
        {
            throw new IllegalArgumentException("O numero  da conta não pode ser nulo!");
        }
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo > 0)
        {
            throw new IllegalArgumentException("O saldo não pode ser negativo!");
        }
        this.saldo = saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        if(titular.trim().isEmpty())
        {
            throw new IllegalArgumentException("O titular não pode ser nulo!");
        }
        this.titular = titular;
    }

    public abstract void depositar(double valor);
    public void cobrarTaxa()
    {
        if(saldo < 10)
        {
            throw new IllegalArgumentException("Saldo insuficiente!");
        }
        this.saldo -= 10;
    }
}
