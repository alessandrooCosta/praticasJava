package DoubleSummaryStatistics;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
public static void main(String args[]){
// 1 - Dada a lista de números inteiros a seguir, encontre o maior número dela.
    List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);
    IntSummaryStatistics estatistica = numeros.stream().collect(Collectors.summarizingInt(Integer::intValue));
    System.out.println(estatistica.getMax());
    System.out.println("------------------");
    System.out.println("");
// 2 -Dada a lista de palavras (strings) abaixo, agrupe-as pelo seu tamanho.
    List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");
    Map<Integer, String> palavrasSepardas = new HashMap<>();



    }
}

