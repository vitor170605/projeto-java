abstract class Animal {
    private String nome;
    private String racaTipo;
    private int idade;
    private String proprietario;

    public Animal(String nome, String racaTipo, int idade, String proprietario) {
        this.nome = nome;
        this.racaTipo = racaTipo;
        this.idade = idade;
        this.proprietario = proprietario;
    }

    public String getNome() {
        return nome;
    }

    public String getRacaTipo() {
        return racaTipo;
    }

    public int getIdade() {
        return idade;
    }

    public String getProprietario() {
        return proprietario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Raça: " + racaTipo + ", Idade: " + idade + " anos, Proprietário: " + proprietario;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Animal animal = (Animal) obj;
        return nome.equals(animal.nome) && racaTipo.equals(animal.racaTipo);
    }

    @Override
    public int hashCode() {
        return 31 * nome.hashCode() + racaTipo.hashCode();
    }

    // Método abstrato para calcular preço, implementado nas subclasses
    public abstract double calcularPreco();
}
