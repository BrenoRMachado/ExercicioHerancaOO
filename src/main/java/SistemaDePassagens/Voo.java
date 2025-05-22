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
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Float getDistancia() {
        return distancia;
    }
    public void setDistancia(Float distancia) {
        this.distancia = distancia;
    }

    public String getDataDoVoo() {
        return dataDoVoo;
    }
    public void setDataDoVoo(String dataDoVoo) {
        this.dataDoVoo = dataDoVoo;
    }
}
