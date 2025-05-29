package SistemaDeBiblioteca;

public class Filme extends MaterialBiblioteca {

    public Filme(String titulo, String dataPublicacao) {
        super(titulo, dataPublicacao);
    }

    @Override
    public String calcularDataDevolucao(String dataEmprestimo) {
        return "A data de devolução do filme é em 5 dias após " + dataEmprestimo;
    }
}
