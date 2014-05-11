package br.edu.ifes.poo2.composite.pattern;

/* Classe Componente, base de Composite e Folha */
public abstract class Documento {
    
    protected String URL;
    
    public abstract void imprimirURL(String edent);
    
    public abstract void adicionarfilho(Documento documento) throws Exception;
    
    public abstract void removerfilho(Documento documento) throws Exception;
    
    public abstract Documento retornarfilho(int index) throws Exception;
    
    public abstract int numfilhos();
}
    