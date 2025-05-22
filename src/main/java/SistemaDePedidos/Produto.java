package SistemaDePedidos;

public abstract class Produto {

    private String nome;
    private float precoBase;

    public Produto(String nome, float precoBase)
    {
        setNome(nome);
        setPrecoBase(precoBase);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser nulo!");
        }
        this.nome = nome;
    }

    public float getPrecoBase() {
        return this.precoBase;
    }
    public void setPrecoBase(float precoBase) {
        if(precoBase <= 0 )
        {
            throw new IllegalArgumentException("O preço não pode ser nulo ou negativo!");
        }
        this.precoBase = precoBase;
    }

    public float calculaDesconto(){
        return this.precoBase * this.obterDesconto();
    }
    public abstract float obterDesconto();
    public abstract float calcularPreco();

}
