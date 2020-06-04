package desafio02ex07;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Desafio02Ex07 {
    public static void main(String[] args) {
        /* Construa um algoritmo que, tendo como dados de entrada dois pontos quaisquer no
        plano, P(x1,y1) e P(x2,y2), escrever a distância entre eles. A fórmula que efetua tal cálculo
        é: */
        
        double x1, x2, y1, y2, d;
        DecimalFormat f = new DecimalFormat ("0.00");
        
        x1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para X1:"));
        x2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para X2:"));
        y1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para Y1:"));
        y2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para Y2:"));
        d = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
            JOptionPane.showMessageDialog(null, "O resultado da distância entre os dois pontos é: "+f.format(d));
        
        
    }
    
}
