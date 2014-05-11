package br.edu.ifes.poo2.decorator.pattern;

// Classe que modela um complemento. Especialização do Decorador.
public class Leite extends DecoradorCafe {
    
    public Leite(Cafe cafeDecorado){
        super(cafeDecorado);
        this.preco += 0.5;
        this.ingredientes += this.separador + "Leite";
    }
    
}