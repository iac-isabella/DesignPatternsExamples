package br.edu.ifes.poo2.decorator.pattern;

// Classe decoradora
public abstract class DecoradorCafe extends Cafe {
    
    protected String separador = ", ";
    
    public DecoradorCafe(Cafe cafeDecorado){
        this.preco = cafeDecorado.preco;
        this.ingredientes = cafeDecorado.ingredientes;
    } 
    
}
 
