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
public class FilaAplicacao {

   // Vetor e matriz para armazenar os pacientes na fila
    private String[][] info = new String [20][2];
    private int[] idades = new int [20];
    
    // Atributo que guarda a posição no nomes onde está o fim da fila
    private int fim = -1;
    
    
    public void adicionar(String nome, String descricao, int idade){
        if( fim == info.length - 1){
            JOptionPane.showMessageDialog(null, "A fila está cheia !");
        }else{
            fim ++;
            info[fim][0] = nome;
            info[fim][1] = descricao;
            idades[fim] = idade;
            imprimir();
        }
    }
    
    public void retirar(){
        if( fim == -1 ){
            JOptionPane.showMessageDialog(null, "A fila já está vazia");
        }else{
            
            // laço para organizar a fila
            for(int i = 0; i<fim; i++){
                info[i] = info[i+1];
                idades[i] = idades[i+1];
            }
            
            fim --;
            
            imprimir();
        }
    }
    
    public void imprimir(){
        if( fim == -1 ){
            JOptionPane.showMessageDialog(null, "A fila está vazia");
        }else{
            String texto = "";
            for(int i = 0 ; i <= fim; i++){
                texto += "Posição na fila " + (i+1)+ " Nome : " + info[i][0] + " Descrição: "+ info[i][0]+ " Idade: "+ idades[i]+"   \n";
            }
            JOptionPane.showMessageDialog(null, texto);
        }
    }
    
    public boolean estaCheia(){
        if( fim == info.length - 1){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean estaVazia(){
        if( info.length == 0){
            return true;
        }else{
            return false;
        }
    }
    

}
