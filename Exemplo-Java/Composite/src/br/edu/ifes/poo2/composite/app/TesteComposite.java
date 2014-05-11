package br.edu.ifes.poo2.composite.app;

import br.edu.ifes.poo2.composite.pattern.DocumentoComposto;
import br.edu.ifes.poo2.composite.pattern.DocumentoSimples;


public class TesteComposite {
    
    public static void main(String[] args) {
        
    /* Montagem de uma árvore de composites */
        
    // Documento Raiz:
    DocumentoComposto raiz = new DocumentoComposto("c:/Raiz");
    
    //Dois filhos compostos do documento raiz:
    DocumentoComposto filhocomp1 = new DocumentoComposto("/FilhoComposto1");
    DocumentoComposto filhocomp2 = new DocumentoComposto("/FilhoComposto2");
    raiz.adicionarfilho(filhocomp1);
    raiz.adicionarfilho(filhocomp2);
    
    //Dois documentos simples, que serão filhos do documento composto
    //filhocomp1:
    DocumentoSimples ds1 = new DocumentoSimples("/Simples1");
    DocumentoSimples ds2 = new DocumentoSimples("/Simples2");
    filhocomp1.adicionarfilho(ds1);
    filhocomp1.adicionarfilho(ds2);
    
    //Documento composto que será "neto" do documento raiz, filho de
    //filhocomp2:
    DocumentoComposto netocomp = new DocumentoComposto("/netocomp");
    filhocomp2.adicionarfilho(netocomp);
    
    //Documentos simples, que serão filhos de netocomp
    DocumentoSimples ds3 = new DocumentoSimples("/Simples3");
    DocumentoSimples ds4 = new DocumentoSimples("/Simples4");
    netocomp.adicionarfilho(ds3);
    netocomp.adicionarfilho(ds4);
    
    //Imprimir a árvore de documentos a partir do documento raiz:
    raiz.imprimirURL("");
    
    }
}
