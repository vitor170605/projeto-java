public class Tosa extends Servico {
    public Tosa(double precoBase) {
        super("Tosa", precoBase);
    }

    public double calcularPreco(Animal animal) {
        return precoBase + 5; // Exemplo simples
    }
}
