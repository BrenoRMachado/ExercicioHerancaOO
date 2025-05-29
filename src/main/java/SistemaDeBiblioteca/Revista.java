package SistemaDeBiblioteca;

public class Revista extends MaterialBiblioteca {

    public Revista(String titulo, String dataPublicacao) {
        super(titulo, dataPublicacao);
    }

    @Override
    public String calcularDataDevolucao(String dataEmprestimo) {
        return "Data de devolução da revista (7 dias)";
    }
}
