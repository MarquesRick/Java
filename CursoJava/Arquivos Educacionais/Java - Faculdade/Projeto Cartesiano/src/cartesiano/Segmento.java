/*
 mMetodo toString()
Declaração:

public String toString()

existe em todas as classes´pré definidas do java e serve para criar uma representação 
do obejto na forma de String.

É um bom hábito escrever este método em todas as classes criadas. Sempre que um objeto precisa ser
convertido para String, este método é chamado automaticamente pelo java
 */
package cartesiano;

/**
 *
 * @author 0040961713001
 */
public class Segmento {
    
    private Ponto p1, p2; //variaveis da classe Ponto
    
    //Construtor Padrão
    
    public Segmento(){
        p1 = new Ponto();
        p2 = new Ponto(0,1);
    }
    
    public Segmento(double x1, double y1, double x2, double y2){
      p1 = new Ponto(x1, y1);
      p2 = new Ponto (x2, y2);
    }
    
    //construtor recebendo os atributos
    public Segmento(Ponto p1, Ponto p2){
        this.p1 = new Ponto (p1);
        this.p2 = new Ponto (p2);
        
    }
    
    //Construtor copy constructor, que copia um outro existente
    public Segmento(Segmento s){
        
        this(s.p1, s.p2); //Reaproveitando o código do construtor acima 
        
    }
    
    @Override
    public String toString(){
    
    return "[" + p1 + "," + p2 + "]";
}
    public void print(){
        System.out.println(this);
    }
    
    public void scale(double factor){
       p1.Scale(factor);
       p2.Scale(factor);
    }
    
    public void desloc(double dx, double dy){
       p1.Desloc(dx, dy);
       p2.Desloc(dx, dy);
    }
    
    public double length(){
        return p1.distance(p2);
        
    }
    
    public Ponto midPoint(){
        return new Ponto ((p1.x + p2.x)/2, (p1.y + p2.y)/2);
    }
            
}
