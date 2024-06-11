/*
1. Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.

2. Crie uma classe Titulo com um atributo nome do tipo String. Implemente a interface Comparable na classe para que seja possível ordenar uma lista de objetos Titulo.

3. No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista. Utilize o método Collections.sort para ordenar a lista e, 
em seguida, imprima os títulos ordenados.

4. Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList. 
Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.

5. Modifique o Exercício 4 para declarar a variável de lista como a interface List, demonstrando o uso de polimorfismo.
 */
package pratica2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // 1.
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10000);
        numeros.add(2);
        numeros.add(322222);
        numeros.add(500);
        numeros.add(20);
        numeros.add(35);
        Collections.sort(numeros);
        System.out.println(" ");
        System.out.println("Lista ordenanda de Numero inteiros por Collections.sort: "+numeros);
        System.out.println("----------------------");

        //2. Metodo criado na classe Titulo!

          // 3.
          Titulo titulo = new Titulo("A volta");
          Titulo titulo1 = new Titulo("Zarastruza");
          Titulo titulo2 = new Titulo("BK e os 40 ladroes");
          ArrayList<Titulo> listaTitulo = new ArrayList<>();
          listaTitulo.add(titulo);
          listaTitulo.add(titulo1);
          listaTitulo.add(titulo2);
          Collections.sort(listaTitulo);
          /*No codigo acima para poder utilizar o 'Collections.sort', foi necessario implementar
          na classe Titulo a interface 'Compareble' e o metodo 'compareTo';
          A collections.sort não ordena Objetos, somente Strings, integer etc...
           */
          System.out.println("Lista ordenada de Objetos por Collections.sort:" +listaTitulo);
        
        // Outra forma de escrever o codigo acima: 
        ArrayList<Titulo> listaTitulo1 = new ArrayList<>();
        listaTitulo1.add(new Titulo("D"));
        listaTitulo1.add(new Titulo("A"));
        listaTitulo1.add(new Titulo("B"));
        Collections.sort(listaTitulo1);
        System.out.println("Lista ordenada de Objetos por Collections.sort: ");
        for(Titulo titulo3 : listaTitulo1){ 
            System.out.println(titulo3.getTitulo());
        }
        System.out.println("------------------");

        //4.
        List<Integer> numeros1 = new ArrayList<>();
        numeros1.add(10000);
        numeros1.add(2);
        numeros1.add(322222);
        numeros1.add(500);
        numeros1.add(20);
        numeros1.add(35);
        Collections.sort(numeros1);
        System.out.println(" ");
        System.out.println("Lista ordenanda de Numero inteiros por Collections.sort utlizando interface List e instanciando ArrayList "+numeros1);
        System.out.println("----------------------");


        List<Integer> numeros2 = new LinkedList<>();
        numeros2.add(10000);
        numeros2.add(2);
        numeros2.add(322222);
        numeros2.add(500);
        numeros2.add(20);
        numeros2.add(35);
        Collections.sort(numeros2);
        System.out.println(" ");
        System.out.println("Lista ordenanda de Numero inteiros por Collections.sort utlizando interface List e instanciando LinkedList "+numeros2);
        System.out.println("----------------------");

        //5.
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    





    }
}