package SistemaDeBiblioteca;

public class Livro extends MaterialBiblioteca {

    public Livro(String titulo, String dataPublicacao) {
        super(titulo, dataPublicacao);
    }

    @Override
    public String calcularDataDevolucao(String dataEmprestimo) {
        return "A data de devolução do livro é em 15 dias após " + dataEmprestimo;
    }
}
