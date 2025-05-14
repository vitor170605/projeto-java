public class Tosa extends Servico {
    public Tosa(double precoBase) {
        super("Tosa", precoBase);
    }

    @Override
    public double calcularPreco(Animal animal) {
        if (animal instanceof Cachorro) {
            return precoBase + 10; // Preço extra para tosar cachorro
        }
        return precoBase;
    }
}
