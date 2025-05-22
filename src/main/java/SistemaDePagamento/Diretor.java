package SistemaDePagamento;

public class Diretor extends Funcionario{

    private double participacao;

    public Diretor()
    {
        super();
        this.participacao = 0.00;
    }

    public double getParticipacao()
    {
        return this.participacao;
    }
    public void setParticipacao(double participacao)
    {
        if(participacao <= 0)
        {
            throw new IllegalArgumentException("A participação não pode ser negativa ou nula!");
        }
        this.participacao = participacao;
    }

    @Override
    public double calcularPagamento() {
        return getSalarioMensal() + this.participacao;
    }
}
