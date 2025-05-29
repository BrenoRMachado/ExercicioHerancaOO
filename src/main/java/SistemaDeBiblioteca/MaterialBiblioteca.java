package SistemaDeBiblioteca;

public abstract class MaterialBiblioteca {

    private String titulo;
    private String dataPublicacao; // Agora como String

    public MaterialBiblioteca(String titulo, String dataPublicacao) {
        setTitulo(titulo);
        setDataPublicacao(dataPublicacao);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título não pode ser vazio");
        }
        this.titulo = titulo;
    }

    public String getDataPublicacao() {
        return this.dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        if (dataPublicacao.trim().isEmpty()) {
            throw new IllegalArgumentException("Data de publicação não pode ser vazia");
        }
        this.dataPublicacao = dataPublicacao;
    }

    public abstract String calcularDataDevolucao(String dataEmprestimo);
}
