class Cachorro extends Animal {
    private String porte; // Ex: Pequeno, Médio, Grande

    public Cachorro(String nome, String racaTipo, int idade, String proprietario, String porte) {
        super(nome, racaTipo, idade, proprietario);
        this.porte = porte;
    }

    @Override
    public String toString() {
        return super.toString() + ", Porte: " + porte;
    }

    @Override
    public double calcularPreco() {
        double precoBase = 50.0;
        if (porte.equals("Grande")) {
            precoBase += 20.0;
        } else if (porte.equals("Pequeno")) {
            precoBase -= 10.0;
        }
        return precoBase;
    }
}
