public class Gato extends Animal {
    private String corOlhos;

    public Gato(String nome, String racaTipo, int idade, String proprietario, String corOlhos) {
        super(nome, racaTipo, idade, proprietario);
        this.corOlhos = corOlhos;
    }

    public String toString() {
        return "Gato - Nome: " + nome + ", Raça: " + racaTipo + ", Idade: " + idade + ", Cor dos Olhos: " + corOlhos
                + ", Dono: " + proprietario;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Gato))
            return false;
        Gato g = (Gato) o;
        return nome.equals(g.nome) && racaTipo.equals(g.racaTipo);
    }

    public int hashCode() {
        return nome.hashCode() + racaTipo.hashCode();
    }
}
