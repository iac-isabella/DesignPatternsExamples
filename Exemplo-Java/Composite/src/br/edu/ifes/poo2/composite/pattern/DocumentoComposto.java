package br.edu.ifes.poo2.composite.pattern;

import java.util.ArrayList;

/* Implementação do Composite DocumentoComposto */
public class DocumentoComposto extends Documento{
    
    /* Lista de documentos filhos */
    protected ArrayList<Documento> docsfilhos = new ArrayList<>();
    
    public DocumentoComposto(String URL) {
        this.URL = URL;
    }
    
    /* Operação para imprimir a URL do documento e de seus filhos */
    @Override
    public void imprimirURL(String edent){
        
        System.out.println(edent+URL);

            for (Documento filho: this.docsfilhos){
                filho.imprimirURL(edent+"-");
            }
    }
    
    @Override
    public void adicionarfilho(Documento documento){
        this.docsfilhos.add(documento);
    }
    
    @Override
    public void removerfilho(Documento documento){
        this.docsfilhos.remove(documento);
    }
    
    @Override
    public Documento retornarfilho(int index) throws Exception{
        if(index < 0 || index >= this.numfilhos()){
            throw new Exception("Indice fora do limite!");
        }
        return docsfilhos.get(index);
    }
    
    @Override
    public int numfilhos(){
        return docsfilhos.size();
    }
}

