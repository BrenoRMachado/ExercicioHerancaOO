package SistemaDePagamento;

public class Gerente extends Funcionario{

    private int bonus;

    public Gerente()
    {
        super();
        this.bonus = 0;
    }

    public int getBonus()
    {
        return this.bonus;
    }
    public void setBonus(int bonus)
    {
        if( bonus <= 0)
        {
            throw new IllegalArgumentException("O bonus não pode ser negativo ou nulo!");
        }
        this.bonus = bonus;
    }

    @Override
    public double calcularPagamento() {
        return getSalarioMensal() + (getSalarioMensal() * bonus/100);
    }

}
