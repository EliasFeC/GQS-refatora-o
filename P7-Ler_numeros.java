import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

            String menu = "Escolha uma operação:\n" +
                          "1 – Somar\n" +
                          "2 – Subtrair\n" +
                          "3 – Multiplicar\n" +
                          "4 – Dividir";
            int escolha = Integer.parseInt(JOptionPane.showInputDialog(menu));

            String resultado = realizarOperacao(num1, num2, escolha);
            JOptionPane.showMessageDialog(null, resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira apenas números inteiros.");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    private static String realizarOperacao(int num1, int num2, int escolha) {
        switch (escolha) {
            case 1:
                return "Resultado: " + (num1 + num2);
            case 2:
                return "Resultado: " + (num1 - num2);
            case 3:
                return "Resultado: " + (num1 * num2);
            case 4:
                if (num2 == 0) {
                    throw new ArithmeticException("Divisão por zero não é permitida.");
                }
                return "Resultado: " + ((double) num1 / num2);
            default:
                return "Opção inválida.";
        }
    }
}
