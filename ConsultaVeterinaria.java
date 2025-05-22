// Subclasse ConsultaVeterinaria
public class ConsultaVeterinaria extends Servico {
    public ConsultaVeterinaria(double precoBase) {
        super("Consulta Veterinária", precoBase);
    }

    @Override
    public double calcularPreco(Animal animal) {
        return precoBase + 50; // Preço fixo para consulta veterinária
    }
}
