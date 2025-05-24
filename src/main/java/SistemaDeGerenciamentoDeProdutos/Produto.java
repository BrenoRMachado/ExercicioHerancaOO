package SistemaDeGerenciamentoDeProdutos;

public abstract class Produto {
    private String nome;
    private float precoUnitario;
    private int quantidadeEmEstoque;

    public Produto(String nome, float precoUnitario, int quantidadeEmEstoque)
    {
        setNome(nome);
        setPrecoUnitario(precoUnitario);
        setQuantidadeEmEstoque(quantidadeEmEstoque);
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        if(nome.trim().isEmpty())
        {
            throw new IllegalArgumentException("O nome não pode estar vazio!");
        }
        this.nome = nome;
    }

    public float getPrecoUnitario() {
        return this.precoUnitario;
    }
    public void setPrecoUnitario(float precoUnitario) {
        if(precoUnitario <= 0)
        {
            throw new IllegalArgumentException("O preço não pode ser nulo ou negativo.");
        }
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEmEstoque() {
        return this.quantidadeEmEstoque;
    }
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if(quantidadeEmEstoque == 0)
        {
            throw new IllegalArgumentException("A quantidade em estoque não pode ser negativa.");
        }
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public abstract float calcularPreco();
}
