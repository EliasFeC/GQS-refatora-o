import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        String menu = "Escolha a operação:\n" +
                      "1 - Somar\n" +
                      "2 - Subtrair\n" +
                      "3 - Multiplicar\n" +
                      "4 - Dividir";

        int escolha = Integer.parseInt(JOptionPane.showInputDialog(menu));

        double resultado = 0;

        switch (escolha) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = (double) numero1 / numero2;
                } else {
                    JOptionPane.showMessageDialog(null, "Não é possível dividir por zero!");
                    return;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                return;
        }

        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}
