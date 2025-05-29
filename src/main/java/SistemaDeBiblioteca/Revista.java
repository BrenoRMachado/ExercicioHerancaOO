package SistemaDeBiblioteca;

public class Revista extends MaterialBiblioteca {

    public Revista(String titulo, String dataPublicacao) {
        super(titulo, dataPublicacao);
    }

    @Override
    public String calcularDataDevolucao(String dataEmprestimo) {
        return "A data de devolução da revista é em 7 dias após " + dataEmprestimo;
    }
}
