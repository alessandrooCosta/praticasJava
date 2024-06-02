package pratica1;


public class ContaBancaria{
    private int numero;
    private double saldo;

    public ContaBancaria(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
  
    @Override
    public String toString() {
        return "Numero da conta: " +getNumero() + "  Saldo: "+getSaldo();
    }
}
