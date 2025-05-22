import java.util.Scanner;

public class GerenciadorPetshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal = null;

        System.out.println("=== Bem-vindo ao Petshop ===");
        System.out.println("Escolha o tipo de animal:");
        System.out.println("1. Cachorro\n2. Gato\n3. Outro");

        int tipoAnimal = scanner.nextInt();
        scanner.nextLine(); // limpar o buffer

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Raça ou Tipo: ");
        String racaTipo = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome do proprietário: ");
        String proprietario = scanner.nextLine();

        switch (tipoAnimal) {
            case 1:
                System.out.print("Porte (Pequeno/Médio/Grande): ");
                String porte = scanner.nextLine();
                animal = new Cachorro(nome, racaTipo, idade, proprietario, porte);
                break;
            case 2:
                System.out.print("Cor dos olhos: ");
                String corOlhos = scanner.nextLine();
                animal = new Gato(nome, racaTipo, idade, proprietario, corOlhos);
                break;
            case 3:
                System.out.print("Tipo específico (ex: Coelho, Pássaro): ");
                String tipoEspecifico = scanner.nextLine();
                animal = new OutroAnimal(nome, racaTipo, idade, proprietario, tipoEspecifico);
                break;
            default:
                System.out.println("Opção inválida.");
                System.exit(0);
        }

        // Escolher serviço
        System.out.println("\nEscolha o serviço:");
        System.out.println("1. Banho\n2. Tosa\n3. Consulta Veterinária");
        int tipoServico = scanner.nextInt();

        Servico servico = null;
        switch (tipoServico) {
            case 1:
                servico = new Banho(40);
                break;
            case 2:
                servico = new Tosa(30);
                break;
            case 3:
                servico = new ConsultaVeterinaria(100);
                break;
            default:
                System.out.println("Serviço inválido.");
                System.exit(0);
        }

        System.out.println("\nResumo do atendimento:");
        System.out.println(animal);
        System.out.println(servico);
        System.out.println("Preço final: R$ " + servico.calcularPreco(animal));

        scanner.close();
    }
}
