/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartesiano;

/**
 *
 * @author 0040961813030
 */
public class Ponto {
    private double x,y;
    
    public Ponto(){
        x = 0;
        y = 0;
    }    
    public Ponto(double ux, double uy){
        x = ux;
        y = uy;
    }
    public Ponto(Ponto pt){
        x = pt.x;
        y = pt.y;
    }    
    public void Assign(Ponto pt){
        x = pt.x;
        y = pt.y;
    }
    public void Scale(double factor){
        x = x * factor;
        y = y * factor;        
    }    
    public void Desloc(double dx, double dy){
        x = dx + x;
        y = dy + y;                
    }
    public double Distance(double px, double py){
        double delta_x = px - x;
        double delta_y = py - y;
        return Math.sqrt(delta_x + delta_y);                
    }
    
    public double Distance(){
        return Distance(0,0);
    }
    public double Distance(Ponto pt){
        return Distance(pt.x,pt.y);
    }
    
    @Override
     public String toString(){
        return "(" + x + ")" + y + ")";
    }
    public void print(){
        System.out.println("("+x+","+y+")");        
    }

    double distance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double distance(Ponto p2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
