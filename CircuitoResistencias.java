import java.util.Scanner;

public class CircuitoResistencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] resistencias = new double[4];
        double soma = 0, maior = 0, menor = Double.MAX_VALUE;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o valor da resistência " + (i + 1) + ": ");
            resistencias[i] = sc.nextDouble();
            soma += resistencias[i];
            if (resistencias[i] > maior) maior = resistencias[i];
            if (resistencias[i] < menor) menor = resistencias[i];
        }

        System.out.println("\nResistência equivalente (série): " + soma);
        System.out.println("Maior resistência: " + maior);
        System.out.println("Menor resistência: " + menor);

        sc.close();
    }
}
