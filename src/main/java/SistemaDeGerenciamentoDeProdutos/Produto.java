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
        if(nome.trim().isEmpty())
        {
            throw new IllegalArgumentException("O nome não pode estar vazio!");
        }
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return this.precoUnitario;
    }
    public void setPrecoUnitario(double precoUnitario) {
        if(precoUnitario <= 0)
        {
            throw new IllegalArgumentException("O preço da unidade não pode ser nulo ou negativo");
        }
        this.precoUnitario = precoUnitario;
    }

    public double getQuantidadeEstoque() {
        return this.quantidadeEstoque;
    }
    public void setQuantidadeEstoque(double quantidadeEstoque) {
        if(quantidadeEstoque < 0)
        {
            throw new IllegalArgumentException("A quantidade em estoque não pode ser negativa");
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void verificarTipoEstoque()
    {
        if(this.quantidadeEstoque % 1 != 0)
        {
            throw new IllegalArgumentException("A quantidade em estoque deve ser um numero inteiro!");
        }

    }
    public void verificarTipoCompra(double quantidadeComprada)
    {
        if(quantidadeComprada % 1 != 0)
        {
            throw new IllegalArgumentException("É necessário comprar uma quantidade inteira de itens.");
        }
    }

    public void verificarQuantidades(double quantidadeComprada)
    {
        verificarTipoEstoque();
        verificarTipoCompra(quantidadeComprada);
    }
    public abstract double calcularPreco(double quantidadeComprada);
}