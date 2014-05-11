package br.edu.ifes.poo2.decorator.pattern;

// Classe base para o decorador e o decorado
public abstract class Cafe {
    
    protected double preco;
    
    protected String ingredientes;
    
    public double retornarPreco(){
        return this.preco;
    }
    
    public String retornarIngredientes(){
        return this.ingredientes;
    }
    
}
