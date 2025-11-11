import java.util.Scanner;

public class CalculadoraAposentadoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite seu sexo (M/F): ");
        char sexo = sc.next().toUpperCase().charAt(0);

        System.out.print("Digite seus anos de contribuição: ");
        int contribuicao = sc.nextInt();

        boolean podeAposentar = false;

        if (sexo == 'M') {
            if (idade >= 65 || contribuicao >= 35) {
                podeAposentar = true;
            }
        } else if (sexo == 'F') {
            if (idade >= 62 || contribuicao >= 30) {
                podeAposentar = true;
            }
        }

        if (podeAposentar) {
            System.out.println("✅ Você já pode se aposentar!");
        } else {
            System.out.println("⏳ Ainda não pode se aposentar.");
        }

        sc.close();
    }
}
