/*
**1. Lambdas**
Exercício:
Crie uma lista de nomes e use expressões lambda para:
- Filtrar os nomes que começam com a letra "A".
- Transformar todos os nomes em letras maiúsculas.
- Ordenar os nomes em ordem alfabética.
 */
package Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){

   /*   ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Zildo");
        nomes.add("Carlos");
        nomes.add("Tais");
        nomes.add("Alessandro");
        nomes.add("Beatriz");
        nomes.add("Aline");                     */
        List<String> nomes = Arrays.asList("Zildo","Carlos","Tais","Alessandro","Beatriz","Aline"); // utlizado uma forma mais simples
        System.out.println("Nomes cadastrados na lista:");
        nomes.forEach(System.out::println); // utlizado method reference para iterar a lista.
        System.out.println("");
        nomes.forEach(n -> System.out.println(n)); // utlizado lambda para iterar a lista.
        System.out.println("----------------");
        System.out.println("1. Filtrar os nomes que começam com a letra A: ");
        nomes.stream().filter(n -> n.startsWith("A")).forEach(System.out::println); // utlizado Stream para filtrar.
        System.out.println("2. Transformar todos os nomes em letras maiúsculas: ");
        nomes.forEach(n -> System.out.println(n.toUpperCase())); // utlizado lambda. Metodo toUpperCase() , foi utlizado deixar a letras maisculas.
        System.out.println("3. Ordenar os nomes em ordem alfabética.");
        nomes.sort((s1, s2) -> s1.compareTo(s2)); // Utilizado esta forma, pois o contexto é Lambda Expression. Mas poderiamos utlizar desta forma: nomes.sort(String::compareTo);
        nomes.forEach(System.out::println);
    }
}
