package SistemaDeContasBancarias;

public abstract class ContaBancaria {

    private String  numeroConta;
    private int saldo;
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

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
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
}
