package cadastro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaCadastro sistemaCadastro = new SistemaCadastro();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Cadastrar usuário");
            System.out.println("2. Listar usuários");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consome a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();

                    Usuario usuario = new Usuario(nome, email, senha);
                    sistemaCadastro.cadastrarUsuario(usuario);
                    break;
                case 2:
                    sistemaCadastro.listarUsuarios();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
