/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author ROBERTA
 */
public class TesteProduto {
    
    //criacao do metodo main
    public static void main(String[] args) {
         
        //criacao e instancia o objeto da classe prouto
        Produto p = new Produto();
        
        //construindo nosso objeto
        p.codigo=10;
        p.descricao="Whisky Johnnie Walker, um Blend Scotch rico e incorporado \n. Tem uma seleção inigualável de mais de 35 maltes na sua composição que garantem a sua superioridade.";
        p.setor='M';
        p.preco=120.00;
        p.disponivel=true;
        
        //teste do metodo para imprimir o produto
        System.out.println("\n\t\t\t PRODUTO \n");
        p.imprimirProduto();
        
        // testando o metodo calcular desconto
        p.calcularDesconto();
        
        // Imprimindo o produto com desconto
        System.out.println("\n\t\t\t -- PRODUTO COM DESCONTO --\n");
        p.imprimirDesconto();
        
        
        
    }
}
