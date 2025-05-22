public abstract class Servico {
    protected String nome;
    protected double precoBase;

    public Servico(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public abstract double calcularPreco(Animal animal);

    public String toString() {
        return "Serviço: " + nome + ", Preço base: R$ " + precoBase;
    }
}
