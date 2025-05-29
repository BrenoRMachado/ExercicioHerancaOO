package SistemaDeBiblioteca;

public class Filme extends MaterialBiblioteca {

    public Filme(String titulo, String dataPublicacao) {
        super(titulo, dataPublicacao);
    }

    @Override
    public String calcularDataDevolucao(String dataEmprestimo) {
        return "Data de devolução do filme (5 dias)";
    }
}
