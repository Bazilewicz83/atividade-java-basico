import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuarioCorreto = "java8";
        String senhaCorreta = "java8";
        boolean acesso = false;

        for (int tentativas = 3; tentativas > 0; tentativas--) {
            System.out.print("Login: ");
            String login = sc.nextLine();

            System.out.print("Senha: ");
            String senha = sc.nextLine();

            if (login.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                acesso = true;
                break;
            } else {
                System.out.println("Usuário ou senha incorretos. Tentativas restantes: " + (tentativas - 1));
            }
        }

        if (acesso) {
            System.out.println("✅ Acesso permitido!");
        } else {
            System.out.println("⛔ Acesso bloqueado.");
        }

        sc.close();
    }
}
