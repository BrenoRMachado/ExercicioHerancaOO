package SistemaDePagamento;

public abstract class Funcionario {

    private double salarioMensal;

    public Funcionario(){
        this.salarioMensal = 0.00;
    }

    public double getSalarioMensal()
    {
        return this.salarioMensal;
    }
    public void setSalarioMensal(double salarioMensal)
    {
        if ( salarioMensal <= 0 )
        {
            throw new IllegalArgumentException("O salario não pode ser negativo ou nulo!");
        }
        this.salarioMensal = salarioMensal;
    }

    public abstract double calcularPagamento();

}
