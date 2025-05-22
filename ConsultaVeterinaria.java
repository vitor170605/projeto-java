public class ConsultaVeterinaria extends Servico {
    public ConsultaVeterinaria(double precoBase) {
        super("Consulta Veterinária", precoBase);
    }

    public double calcularPreco(Animal animal) {
        return precoBase; // Preço fixo
    }
}
