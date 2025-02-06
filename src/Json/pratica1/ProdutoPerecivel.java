package Json.pratica1;
public class ProdutoPerecivel extends Produto{

    private String dataValidade;

    public ProdutoPerecivel (String nome, double preco, int quantidade, String dataValidade){
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade(){
        return dataValidade;
    }

    public void setDataValidade(String dataValidade){
        this.dataValidade = dataValidade;
    }

    public String toString() {
        return "Produto: " +getNome() + " Preco: "+getPreco() + " Quantidade: "+getQuantidade() + " Data Validade: "+getDataValidade();
    }

}
