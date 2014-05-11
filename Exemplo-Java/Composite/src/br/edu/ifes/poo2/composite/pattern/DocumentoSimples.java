package br.edu.ifes.poo2.composite.pattern;

/* Implementação da Folha DocumentoSimples */
public class DocumentoSimples extends Documento {
    
    public DocumentoSimples(String URL) {
        this.URL = URL;
    }
    
    
    @Override
    public void imprimirURL(String edent){
        /* Como é filho, imprime somente a URL */
        System.out.println(edent+URL);
    }
    
    @Override
    public void adicionarfilho(Documento documento) throws Exception{
        throw new Exception("Documento simples não possui filho!");
    }
    
    @Override
    public void removerfilho(Documento documento) throws Exception{
        throw new Exception("Documento simples não possui filho!");
    }
    
    @Override
    public Documento retornarfilho(int index) throws Exception{
        throw new Exception("Documento simples não possui filho!");
    }
    
    @Override
    public int numfilhos(){
        return 0;
    }
}
