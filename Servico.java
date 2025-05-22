
public abstract class Servico {
    protected String nome;
    protected double precoBase;

    public Servico(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    // Método abstrato para calcular o preço do serviço
    public abstract double calcularPreco(Animal animal);

    @Override
    public String toString() {
        return "Serviço: " + nome + ", Preço Base: " + precoBase;
    }
}
