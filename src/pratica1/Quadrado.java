package pratica1;
public class Quadrado implements Forma{

    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    
    public void setLado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return getLado() * getLado();
    }

    @Override
    public String toString() {
        return "Lado: "+ lado;
    }
}
