package SistemaDePassagens;

public abstract class Voo {
    private String origem;
    private String destino;
    private Float distancia;
    private String dataDoVoo;

    public Voo(String origem, String destino, Float distancia, String dataDoVoo)
    {
        setOrigem(origem);
        setDestino(destino);
        setDistancia(distancia);
        setDataDoVoo(dataDoVoo);
    }

    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        if (origem.trim().isEmpty()) {
            throw new IllegalArgumentException("Origem inválida! Está vazia.");
        }
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        if (destino.trim().isEmpty()) {
            throw new IllegalArgumentException("Destino inválido! Está vazio.");
        }
        this.destino = destino;
    }

    public Float getDistancia() {
        return distancia;
    }
    public void setDistancia(Float distancia) {
        if(distancia <= 0)
        {
            throw new IllegalArgumentException("Distância inválida! A distância não pode ser nula ou negativa!");
        }
        this.distancia = distancia;
    }

    public String getDataDoVoo() {
        return dataDoVoo;
    }
    public void setDataDoVoo(String dataDoVoo) {
        if (dataDoVoo.trim().isEmpty()) {
            throw new IllegalArgumentException("Data inválida! Está vazia.");
        }
        this.dataDoVoo = dataDoVoo;
    }

    public abstract float calcularPreco();
}
