package composite

import java.util.ArrayList
import java.lang.ref.ReferenceQueue.Null

abstract class Documento (URL: String){
    
	def url: String = URL
  
    def imprimirURL(edent: String)
    
    def adicionarfilho(documento: Documento)
    
    def removerfilho(documento: Documento)
    
    def retornarfilho(index: Int): Documento
    
    def numfilhos: Int
}

class DocumentoComposto(URL: String) extends Documento (URL: String){
    
    var docsFilhos: ArrayList[Documento] = new ArrayList
	
    override def url: String = URL
    
    override def imprimirURL(edent: String){
      print(edent)
      print(url)
      print("\n")
      var index: Int = 0
      while(index < docsFilhos.size()){
        docsFilhos.get(index)imprimirURL(edent.concat("-"))
        index = index + 1
      }
	}

	override def adicionarfilho(documento: Documento){
		docsFilhos.add(documento);
    }

	override def removerfilho(documento: Documento){
	  docsFilhos.remove(documento)
	}
	
    override def retornarfilho(index: Int): Documento = docsFilhos.get(index)
    
    override def numfilhos: Int = docsFilhos.size()
}
 
class DocumentoSimples(URL: String) extends Documento (URL: String){
	
    override def url: String = URL
    
    override def imprimirURL(edent: String){
      print(edent)
      print(url)
      print("\n")
	}

	override def adicionarfilho(documento: Documento){}
	
	override def removerfilho(documento: Documento){}

    override def retornarfilho(index: Int): Documento = null
    
    override def numfilhos: Int = 0
}


object TesteComposite {
  def main(args: Array[String]) = {
    var raiz: DocumentoComposto = new DocumentoComposto("c:/Raiz");
    
    var filhocomp1: DocumentoComposto  = new DocumentoComposto("/FilhoComposto1");
    var filhocomp2: DocumentoComposto  = new DocumentoComposto("/FilhoComposto2");
    raiz.adicionarfilho(filhocomp1);
    raiz.adicionarfilho(filhocomp2);
    
    var ds1: DocumentoSimples = new DocumentoSimples("/Simples1");
    var ds2: DocumentoSimples = new DocumentoSimples("/Simples2");
    filhocomp1.adicionarfilho(ds1);
    filhocomp1.adicionarfilho(ds2);
 
    var netocomp: DocumentoComposto  = new DocumentoComposto("/netocomp");
    filhocomp2.adicionarfilho(netocomp);
    
    var ds3: DocumentoSimples = new DocumentoSimples("/Simples3");
    var ds4: DocumentoSimples = new DocumentoSimples("/Simples4");
    netocomp.adicionarfilho(ds3);
    netocomp.adicionarfilho(ds4);
   
    raiz.imprimirURL("");
    
  }
}
