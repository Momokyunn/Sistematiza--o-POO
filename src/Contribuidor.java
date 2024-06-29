
import java.util.ArrayList;
import java.util.Scanner;

public class Contribuidor {
    String nome;
    String cargo;
    double Salario;
    private static Scanner scanner;

    Contribuidor(String nome, String cargo, double Salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.Salario = Salario;
    }

    public String toString() {
        return "Nome: " + nome + ", Cargo: " + cargo + ", Salário: " + Salario;
    }
    
    public static void main(String[] args) {
        ArrayList<Contribuidor> Contribuidores = new ArrayList<>();
        scanner = new Scanner(System.in);

        Sistema:
        while (true) {
            System.out.println("\n1. Adicionar");
            System.out.println("2. Listar");
            System.out.println("3. Sair");
            System.out.println("");
            System.out.println("Escolha uma opção:");
            int selecione = scanner.nextInt();
            scanner.nextLine();
            switch (selecione) {
                case 1:
                    System.out.print("Insira o Nome:");
                    String nome = scanner.nextLine();
                    System.out.print("Insira o cargo:");
                    String cargo = scanner.nextLine();
                    System.out.print("Insira o salário:");
                    double Salario = scanner.nextDouble();
                    scanner.nextLine();
                    Contribuidores.add(new Contribuidor(nome, cargo, Salario));
                    break;
                case 2:
                    for (Contribuidor Contribuido : Contribuidores) {
                        System.out.println(Contribuido);
                    }   break;
                case 3:
                    break Sistema;
                default:
                    break;
            }
        }
        scanner.close();
    }
}

