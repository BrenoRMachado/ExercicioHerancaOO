package SistemaDeContasBancarias;

public class ContaCorrente extends ContaBancaria{


    public ContaCorrente(String numeroConta, int saldo, String titular)
    {
        super(numeroConta, saldo, titular);
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0){
            throw new IllegalArgumentException("Valor não pode ser negativo ou nulo!");
        }
        setSaldo(valor);
        cobrarTaxa();
    }

    @Override
    public void sacar()
    {

    }
}
