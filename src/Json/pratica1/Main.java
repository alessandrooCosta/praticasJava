package Json.pratica1;
/*
1.
Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.
No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
Adicione pelo menos três pessoas à lista utilizando o método add.
Imprima o tamanho da lista utilizando o método size.
Imprima a primeira pessoa da lista utilizando o método get.
Imprima a lista completa
Caso precise de ajuda, opções de solução das atividades estarão disponíveis na seção “Ver opinião do instrutor”.


2.
Crie uma classe Produto com atributos como nome, preco, e quantidade. Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList.
Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.

Implemente o método toString() na classe Produto para retornar uma representação em texto do objeto. Em seguida, imprima a lista de produtos utilizando o método System.out.println().

Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os atributos. Em seguida, crie objetos Produto utilizando esse novo construtor.

Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade e um construtor que utilize o construtor da classe mãe (super) para inicializar os atributos herdados.
Crie um objeto ProdutoPerecivel e imprima seus valores.

3.
Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.
Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.
Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do tipo correto antes de fazer o casting.
Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.
Crie uma interface Forma com um método calcularArea(). Implemente a interface em duas classes, por exemplo, Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface Forma) e utilize um loop para calcular e imprimir a área de cada forma.
Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista de contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.

 */
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //1
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Alessandro");
        pessoa1.setIdade(28);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Amanda");
        pessoa2.setIdade(36);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("João");
        pessoa3.setIdade(21);

        ArrayList<Pessoa> listaDePessoa = new ArrayList<>();
        listaDePessoa.add(pessoa1);
        listaDePessoa.add(pessoa2);
        listaDePessoa.add(pessoa3);
        System.out.println("Tamanho da Lista: " + listaDePessoa.size());
        System.out.println("");
        System.out.println("Informações da Primeira pessoa da Lista: " + listaDePessoa.get(0).toString());
        System.out.println("");
        System.out.println("Informações da Lista inteira: ");
        System.out.println(listaDePessoa);
        System.out.println("");

        // 2
        Produto produto1 = new Produto();
        produto1.setNome("Cerveja");
        produto1.setPreco(10.00);
        produto1.setQuantidade(10);

        Produto produto2 = new Produto();
        produto2.setNome("Desodorante");
        produto2.setPreco(15.00);
        produto2.setQuantidade(1);

        Produto produto3 = new Produto();
        produto3.setNome("Pão");
        produto3.setPreco(5.00);
        produto3.setQuantidade(8);

        Produto produto4 = new Produto("Arroz", 20, 2);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);
        System.out.println("Tamanho da lista de pordutos (sem for !): ");
        System.out.println(listaProdutos.size());
        System.out.println("");
        System.out.println("Todos os elementos da lista com o for():");
        for (Produto produtos : listaProdutos) {
            System.out.println(produtos);
        }
        System.out.println(" ");
        System.out.println("Produto com maior quantidade: ");
        System.out.println(listaProdutos.get(0).getNome());
        System.out.println(" ");
        System.out.println("Todos os produtos: " + listaProdutos);
        System.out.println(" ");
        ProdutoPerecivel pp = new ProdutoPerecivel(produto1.getNome(), produto1.getPreco(), produto1.getQuantidade(), "28/06/1995");
        System.out.println("Informações do produto: " + pp);
        System.out.println(" ");

        // 3.
        System.out.println("*-----------------*");
        System.out.println("TESTE DE FOR EACH");
        ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("Java");
        listaStrings.add("C++");
        listaStrings.add("Python");
        // abaixo eu escrevi um for basico/padrão para percorrer o Array;
        for (String elemento : listaStrings) {
            System.out.println(elemento);
        }
        System.out.println("*-----------------*");
        // abaixo eu escrevi eu usei o metodo forEach;
        listaStrings.forEach(elemento -> System.out.println(elemento));
        System.out.println("*-----------------*");
        /*
        System.out.println("Casting: ");
        Cachorro cachorro = new Cachorro();
        //Aqui eu fiz casting, dizendo que cachorro é um animal;
        Animal animal = (Animal) cachorro;
        System.out.println(cachorro.getNome());
        */
        Animal animal = new Cachorro();
        if(animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            System.out.println("Agora você pode usar o objeto 'cachorro' como um Cachorro.");
        }else {
        System.out.println("O objeto nõa é um cachorro. ");
        }
        System.out.println("*-----------------*");

        //4
        System.out.println("Media do preço dos Produtos");
        ArrayList<Produto> lista1 = new ArrayList<>();
        lista1.add(produto1);
        lista1.add(produto2);
        lista1.add(produto3);
        lista1.add(produto4);
        double somaValores = 0;
        for (Produto valor : lista1){
            somaValores += valor.getPreco();
        }
        double resultado = somaValores / lista1.size();
        System.out.println("Media do preço dos Produtos: " + resultado);
        System.out.println("------------------------------------------");

        //5 corrigir
        System.out.println("Aréa");
        Quadrado quadrado = new Quadrado(17);
        Circulo circulo = new Circulo(3);
        ArrayList<Forma> lista2 = new ArrayList<>();
        lista2.add(quadrado);
        lista2.add(circulo);
        for (Forma formas : lista2){
            System.out.println("Aréa: "+ formas.calcularArea());
        }
        System.out.println("------------------------------------------");
        System.out.println("");

        //6 corrigir
        ContaBancaria conta1 = new ContaBancaria(1, 200);
        ContaBancaria conta2 = new ContaBancaria(2, 780);
        ContaBancaria conta3 = new ContaBancaria(3, 550);
        ContaBancaria conta4 = new ContaBancaria(4, 100);
        ArrayList<ContaBancaria> listaConta =  new ArrayList<>();
        listaConta.add(conta1);
        listaConta.add(conta2);
        listaConta.add(conta3);
        listaConta.add(conta4);
        // aqui foi criada uma variavel para receber os valores da primeira posição do Array;
        ContaBancaria contaMaiorSaldo = listaConta.get(0);
        for (ContaBancaria conta : listaConta){
            if(conta.getSaldo() > contaMaiorSaldo.getSaldo()){
                contaMaiorSaldo = conta;
            }
        }
        System.out.println("Conta de maior saldo é: "+contaMaiorSaldo.getSaldo());
        System.out.println("------------------------------------------");
        System.out.println("");










    }
}
