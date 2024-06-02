package pratica1;
public class Animal {
    private String nome;
    private int populacao;

    public Animal(){

    }

    public Animal(String nome, int populacao) {
        this.nome = nome;
        this.populacao = populacao;
    }

    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", populacao=" + populacao +
                '}';
    }
}
