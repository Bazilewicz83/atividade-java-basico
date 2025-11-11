import javax.swing.JOptionPane;

public class SistemaAvaliacao {
    public static void main(String[] args) {
        double prova1 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite a nota da Prova 1:")
        );
        double prova2 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite a nota da Prova 2:")
        );
        double trabalho = Double.parseDouble(
            JOptionPane.showInputDialog("Digite a nota do Trabalho:")
        );

        double media = (prova1 + prova2 + trabalho) / 3;

        String resultado = (media >= 6) ? "Aprovado" : "Reprovado";

        JOptionPane.showMessageDialog(
            null,
            "Média: " + String.format("%.2f", media) + "\nSituação: " + resultado
        );
    }
}
