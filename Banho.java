public class Banho extends Servico {
    public Banho(double precoBase) {
        super("Banho", precoBase);
    }

    public double calcularPreco(Animal animal) {
        if (animal instanceof Cachorro) {
            String porte = ((Cachorro) animal).getPorte();
            if (porte.equalsIgnoreCase("Grande"))
                return precoBase + 20;
            if (porte.equalsIgnoreCase("Médio"))
                return precoBase + 10;
        }
        return precoBase;
    }
}
