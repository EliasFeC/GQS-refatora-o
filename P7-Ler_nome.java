import javax.swing.JOptionPane;

public class NomeCompleto {
    public static void main(String[] args) {
        String primeiroNome = JOptionPane.showInputDialog("Digite o primeiro nome:");
        String nomeDoMeio = JOptionPane.showInputDialog("Digite o nome do meio:");
        String ultimoNome = JOptionPane.showInputDialog("Digite o último nome:");

        String nomeCompleto = primeiroNome + " " + nomeDoMeio + " " + ultimoNome;

        JOptionPane.showMessageDialog(null, "Nome completo: " + nomeCompleto);
    }
}
