public class OutroAnimal extends Animal {
    private String tipoEspecifico;

    public OutroAnimal(String nome, String racaTipo, int idade, String proprietario, String tipoEspecifico) {
        super(nome, racaTipo, idade, proprietario);
        this.tipoEspecifico = tipoEspecifico;
    }

    public String toString() {
        return "Outro Animal - Nome: " + nome + ", Tipo: " + racaTipo + ", Específico: " + tipoEspecifico + ", Idade: "
                + idade + ", Dono: " + proprietario;
    }

    public boolean equals(Object o) {
        if (!(o instanceof OutroAnimal))
            return false;
        OutroAnimal a = (OutroAnimal) o;
        return nome.equals(a.nome) && racaTipo.equals(a.racaTipo);
    }

    public int hashCode() {
        return nome.hashCode() + racaTipo.hashCode();
    }
}
