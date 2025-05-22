package SistemaDePagamento;

public class FuncionarioComum extends Funcionario{

    public FuncionarioComum()
    {
        super();
    }

    @Override
    public double calcularPagamento() {
        return getSalarioMensal();
    }
}
