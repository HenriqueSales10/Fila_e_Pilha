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
public class FilaAplicacaoTeste {

    public static void main(String[] args) {

       int opcao = -1;
        
        FilaAplicacao fila = new FilaAplicacao(20);
        
        while ( opcao != 0 ) {       
            String menu =   "1 - Adicionar na fila \n" + 
                            "2 - Retirar da fila \n" +
                            "3 - Imprimir fila \n"+
                            "0 - Sair";
            opcao = Integer.valueOf( JOptionPane.showInputDialog( menu ) );
            switch( opcao ){
                case 1:
                    if( fila.estaCheia() ){
                        JOptionPane.showMessageDialog(null, "A fila está cheia!");
                    }else{
                        String nome = String.valueOf( JOptionPane.showInputDialog( "Digite o nome:") );
                        String desc = String.valueOf( JOptionPane.showInputDialog( "Digite a descrição:") );
                        int idade = Integer.valueOf( JOptionPane.showInputDialog( "Digite a idade:") );
                        fila.adicionar(nome, desc, idade);
                    }
                    break;
                case 2:
                    fila.retirar();
                    break;
                case 3: 
                    fila.imprimir();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}
