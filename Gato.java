class Gato extends Animal {
    private String corOlhos;

    public Gato(String nome, String racaTipo, int idade, String proprietario, String corOlhos) {
        super(nome, racaTipo, idade, proprietario);
        this.corOlhos = corOlhos;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cor dos Olhos: " + corOlhos;
    }

    @Override
    public double calcularPreco() {
        return 40.0; // Preço fixo para gatos
    }
}
