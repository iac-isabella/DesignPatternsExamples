package br.edu.ifes.poo2.decorator.pattern;

// Classe que modela um complemento. Especialização do Decorador.
public class Creme extends DecoradorCafe {
    
    public Creme(Cafe cafeDecorado){
        super(cafeDecorado);
        this.preco += 0.7;
        this.ingredientes += this.separador + "Creme";
    }
    
}