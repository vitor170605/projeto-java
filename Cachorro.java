public class Cachorro extends Animal {
    private String porte;

    public Cachorro(String nome, String racaTipo, int idade, String proprietario, String porte) {
        super(nome, racaTipo, idade, proprietario);
        this.porte = porte;
    }

    public String getPorte() {
        return porte;
    }

    public String toString() {
        return "Cachorro - Nome: " + nome + ", Raça: " + racaTipo + ", Idade: " + idade + ", Porte: " + porte
                + ", Dono: " + proprietario;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Cachorro))
            return false;
        Cachorro c = (Cachorro) o;
        return nome.equals(c.nome) && racaTipo.equals(c.racaTipo);
    }

    public int hashCode() {
        return nome.hashCode() + racaTipo.hashCode();
    }
}
