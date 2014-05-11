package br.edu.ifes.poo2.decorator.app;

import br.edu.ifes.poo2.decorator.pattern.*;

public class TesteDecorator {
    
    public static void main(String[] args){
        // Cria cafe sem complemento
        Cafe c = new CafeSimples();
        System.out.println("Preco: " + c.retornarPreco() + " Ingredientes: " + c.retornarIngredientes());
        // Adiciona o complemento leite ao cafe
        c = new Leite(c);
        System.out.println("Preco: " + c.retornarPreco() + " Ingredientes: " + c.retornarIngredientes());
        // Adiciona o complemento creme ao cafe
        c = new Creme(c);
        System.out.println("Preco: " + c.retornarPreco() + " Ingredientes: " + c.retornarIngredientes());
        // Adiciona o complemento canela ao cafe
        c = new Canela(c);
        System.out.println("Preco: " + c.retornarPreco() + " Ingredientes: " + c.retornarIngredientes());
    }
    
}