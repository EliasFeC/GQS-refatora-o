package loja;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class Relatorio implements InterfaceRelatorio {
    public void gerarRelatorio(ArrayList<Produto> produtos, boolean clienteVIP) {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco() * produto.getQuantidade();
        }
        
        if (clienteVIP) {
            total *= 0.90;
        } else {
            total *= 0.95;
        }
        
        DayOfWeek diaSemana = LocalDate.now().getDayOfWeek();
        if (diaSemana == DayOfWeek.SUNDAY) {
            total += 10.00;
        } else {
            total += 5.00;
        }
        
        System.out.println(total);
    }
}
