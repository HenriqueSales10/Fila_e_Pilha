package filasepilhas;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Pilha {

    // Matrizes para armazenar as caixas empilhadas
    private String[][] info = new String[10][2];
    private Double[][] medidas = new Double[10][3];

    // Atributo que guarda a posição onde estó o topo da pilha
    private int topo = -1;

    public void adicionar(String identificacao, Double altura, Double largura, Double profundidade, String fragil) {
        if (topo == info.length - 1) {
            JOptionPane.showMessageDialog(null, "A pilha está cheia");
        } else {
            topo++;
            info[topo][0] = identificacao;
            info[topo][1] = fragil;

            medidas[topo][0] = altura;
            medidas[topo][1] = largura;
            medidas[topo][2] = profundidade;
            imprimir();
        }
    }

    public void retirar() {
        if (topo == -1) {
            JOptionPane.showMessageDialog(null, "A pilha já está vazia");
        } else {
            topo--;
            imprimir();
        }
    }

    public void imprimir() {
        if (topo == -1) {
            JOptionPane.showMessageDialog(null, "A pilha está vazia");
        } else {
            String texto = "";
            for (int i = topo; i >= 0; i--) {
                texto += " Identificação: " + info[i][0] + " Altura: " + medidas[i][0] + " Largura: " + medidas[i][1] + "  Profundidade: " + medidas[i][2] + " Frágil? " + info[i][1] + "\n";
            }
            JOptionPane.showMessageDialog(null, texto);
        }
    }

}
