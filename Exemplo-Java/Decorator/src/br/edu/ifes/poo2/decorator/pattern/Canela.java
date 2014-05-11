package br.edu.ifes.poo2.decorator.pattern;

// Classe que modela um complemento. Especialização do Decorador.
public class Canela extends DecoradorCafe {
    
    public Canela(Cafe cafeDecorado){
        super(cafeDecorado);
        this.preco += 0.3;
        this.ingredientes += this.separador + "Canela";
    }
    
}