/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author paulo
 */
public class Produto {
    //Atributos
    int codigo;
    String descricao;
    char setor; // P = Perecíveis, M = Mercearia 
    double preco;
    boolean disponivel;
    
    public void imprimirProduto(){
        System.out.println("Código:" + codigo);
        System.out.println("Descrição:" + descricao);
        System.out.println("Setor:" + setor);
        System.out.println("Preço:" + preco);
        System.out.println("Disponível:" + disponivel);
        
    }
}
