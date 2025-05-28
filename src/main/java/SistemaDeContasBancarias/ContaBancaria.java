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
        this.numeroConta = numeroConta;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
