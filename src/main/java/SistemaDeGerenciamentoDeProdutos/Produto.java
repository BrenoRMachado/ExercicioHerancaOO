package SistemaDeGerenciamentoDeProdutos;

public abstract class Produto{
    private String nome;
    private double precoUnitario;
    private double quantidadeEstoque;

    public Produto(String nome, double precoUnitario, double quantidadeEstoque)
    {
        setNome(nome);
        setPrecoUnitario(precoUnitario);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return this.precoUnitario;
    }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getQuantidadeEstoque() {
        return this.quantidadeEstoque;
    }
    public void setQuantidadeEstoque(double quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }


}