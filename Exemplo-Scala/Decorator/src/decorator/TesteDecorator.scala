package decorator

abstract class Cafe {
  def preco:Double
  def ingredientes: String
}
 
class CafeSimples extends Cafe {
  override def preco = 1
  override def ingredientes = "Cafe"
}
 
 
abstract class DecoradorCafe(cafeDecorado: Cafe) extends Cafe {
  
  val sep = ", "
 
  override def preco = cafeDecorado.preco
  override def ingredientes = cafeDecorado.ingredientes
}
 
class Leite(cafeDecorado: Cafe) extends DecoradorCafe(cafeDecorado) {
  override def preco = super.preco + 0.5
  override def ingredientes = super.ingredientes + sep + "Leite"
}
 
class Creme(cafeDecorado: Cafe) extends DecoradorCafe(cafeDecorado) {
  override def preco = super.preco + 0.7
  override def ingredientes = super.ingredientes + sep + "Creme"
}

class Canela(cafeDecorado: Cafe) extends DecoradorCafe(cafeDecorado) {
  override def preco = super.preco + 0.2
  override def ingredientes = super.ingredientes + sep + "Canela"
}

object TesteDecorator {
  def main(args: Array[String]) = {
    var c:Cafe = new CafeSimples
    printf("Preco: %f Ingredientes %s\n", c.preco, c.ingredientes)
    c = new Leite(c)
    printf("Preco: %f Ingredientes %s\n", c.preco, c.ingredientes)
    c = new Canela(c)
    printf("Preco: %f Ingredientes %s\n", c.preco, c.ingredientes)
    c = new Creme(c)
    printf("Preco: %f Ingredientes %s\n", c.preco, c.ingredientes)
    c = new Canela(c)
    printf("Preco: %f Ingredientes %s\n", c.preco, c.ingredientes)
  }
}
