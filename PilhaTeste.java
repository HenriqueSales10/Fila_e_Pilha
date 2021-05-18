/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filasepilhas;

import javax.swing.JOptionPane;

/**
 *
 * @author henri
 */
public class PilhaTeste {

    public static void main(String[] args) {

        int opcao = -1;

        Pilha pilha = new Pilha();

        while (opcao != 0) {
            String menu = "1 - Adicionar na pilha \n"
                    + "2 - Retirar da pilha \n"
                    + "3 - Imprimir pilha \n"
                    + "0 - Sair";
            opcao = Integer.valueOf(JOptionPane.showInputDialog(menu));
            switch (opcao) {
                case 1:

                    String identificacao = String.valueOf(JOptionPane.showInputDialog("Digite a identificação:"));
                    Double altura = Double.valueOf(JOptionPane.showInputDialog("Digite a altura:"));
                    Double largura = Double.valueOf(JOptionPane.showInputDialog("Digite a largura:"));
                    Double profundidade = Double.valueOf(JOptionPane.showInputDialog("Digite a profundidade:"));
                    String fragil = String.valueOf(JOptionPane.showInputDialog("A caixa é frágil?"));

                    pilha.adicionar(identificacao, altura, largura, profundidade, fragil);
                    break;
                case 2:
                    pilha.retirar();
                    break;
                case 3:
                    pilha.imprimir();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }

    }
}
