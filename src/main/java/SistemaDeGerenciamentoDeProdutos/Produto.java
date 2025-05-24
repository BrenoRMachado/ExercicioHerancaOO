package SistemaDeGerenciamentoDeProdutos;

public abstract class Produto {
    private String nome;
    private float precoUnitario;
    private float quantidadeEstoque;

    public Produto(String nome, float precoUnitario, float quantidadeEstoque)
    {
        setNome(nome);
        setPrecoUnitario(precoUnitario);
        setQuantidadeEstoque(quantidadeEstoque);
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

    public float getQuantidadeEstoque() {
        return this.quantidadeEstoque;
    }
    public void setQuantidadeEstoque(float quantidadeEmEstoque) {
        if(quantidadeEmEstoque == 0)
        {
            throw new IllegalArgumentException("A quantidade em estoque não pode ser negativa.");
        }
        this.quantidadeEstoque = quantidadeEmEstoque;
    }

    public void verificarQuantidadeEstoque()
    {
        if(this.quantidadeEstoque % 1 != 0)
        {
            throw new IllegalArgumentException("A Quantidade em estoque deve ser inteira!");
        }
    }

    public void diminuirEstoque(float quantidade)
    {
        if(quantidade > this.quantidadeEstoque)
        {
            throw new IllegalArgumentException("Estoque insuficiente");
        }else
        {
            this.quantidadeEstoque -= quantidade;
        }

    }

    public abstract float calcularPreco();
}
