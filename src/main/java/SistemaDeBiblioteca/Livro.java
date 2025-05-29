package SistemaDeBiblioteca;

public class Livro extends MaterialBiblioteca {

    public Livro(String titulo, String dataPublicacao) {
        super(titulo, dataPublicacao);
    }

    @Override
    public String calcularDataDevolucao(String dataEmprestimo) {
        return "Data de devolução do livro (15 dias)";
    }
}
