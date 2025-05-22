// Subclasse Banho
public class Banho extends Servico {
    public Banho(double precoBase) {
        super("Banho", precoBase);
    }

    @Override
    public double calcularPreco(Animal animal) {
        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            // Aumento de preço dependendo do porte do cachorro
            if (cachorro.getNome().equalsIgnoreCase("Grande")) {
                return precoBase + 30; // Preço maior para cachorros grandes
            }
            return precoBase;
        }
        return precoBase;
    }
}
