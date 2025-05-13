class OutroAnimal extends Animal {
    private String tipoEspecifico;

    public OutroAnimal(String nome, String racaTipo, int idade, String proprietario, String tipoEspecifico) {
        super(nome, racaTipo, idade, proprietario);
        this.tipoEspecifico = tipoEspecifico;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo Específico: " + tipoEspecifico;
    }

    @Override
    public double calcularPreco() {
        return 30.0; // Preço fixo para outros animais
    }
}
