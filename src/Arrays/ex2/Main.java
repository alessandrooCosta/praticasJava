package Arrays.ex2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Remoção de Elementos
//Crie um programa que remova um elemento específico de um array (por exemplo, o número 5), deslocando os elementos restantes para preencher o espaço.
public class Main {
    public static void main(String args[]){

    // criado um lista de numero fixa
    List<Integer> array = Arrays.asList(10,20,30,40,50); // Para exemplo

    ArrayList<Integer> arrays = new ArrayList<>();
    arrays.add(10);
    arrays.add(20);
    arrays.add(20);
    arrays.add(40);
    arrays.add(50);
    System.out.println("Valor do Array Original (Utlizando ArrayList)");
    for (int i = 0; i < array.size(); i++) {
        System.out.println("Posição "+i+": "+arrays.get(i));
    }
        arrays.remove(3);
        System.out.println("");
    System.out.println("Novo após exclusão do valor da posição 3 utlizando arrays.size()");
    for(int i = 0; i < arrays.size(); i++){
        System.out.println("Posição: "+i+" "+arrays.get(i));
    }
}
}
