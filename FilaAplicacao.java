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

   // Vetor para armazenar os nomees enfileirados
    private String[] nomes;
    private String[] descricoes;
    private int[] idades;
    
    // Atributo que guarda a posição no nomes onde está o fim da fila
    private int fim;
    
    // Atributo para guardar o tamanho do nomes
    private int tamanho;
    
    public FilaAplicacao(int tamanho){
        
        // Inicialização dos vetores com o tamanho recebido por parâmetro
        nomes = new String[tamanho];
        descricoes = new String[tamanho];
        idades = new int[tamanho];
        
        // Como o Zero é uma posição válida no nomes, então colocamos um nome
        // não válido para sinalizar que a fila está vazia
        fim = -1;
        
        this.tamanho = tamanho;
    }
    
    public void adicionar(String nome, String descricao, int idade){
        if( fim == tamanho - 1){
            JOptionPane.showMessageDialog(null, "A fila está cheia !");
        }else{
            fim ++;
            nomes[fim] = nome;
            descricoes[fim] = descricao;
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
                nomes[i] = nomes[i+1];
                descricoes[i] = descricoes[i+1];
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
                texto += "Posição na fila " + (i+1)+ " Nome : " + nomes[i] + " Descrição: "+ descricoes[i]+ " Idade: "+ idades[i]+"   \n";
            }
            JOptionPane.showMessageDialog(null, texto);
        }
    }
    
    public boolean estaCheia(){
        if( fim == tamanho - 1){
            return true;
        }else{
            return false;
        }
    }

}
