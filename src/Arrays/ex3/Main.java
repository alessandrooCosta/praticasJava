package Arrays.ex3;

import java.util.Arrays;
import java.util.List;

//Média dos Elementos
//Dado um array de números, calcule e exiba a média dos elementos.
public class Main {
    public static void main(String args[]){
        List<Integer> array = Arrays.asList(10,20,30,40,50);
        int somaArray = 0;
        System.out.println("Valores do Array: ");
        for (int i = 0; i < array.size(); i++){
            somaArray += array.get(i);
            System.out.println(array.get(i));
        }
        double media = somaArray / array.size();
        System.out.println("");
        System.out.println("A media dos elementos é: "+ media);
    }
}
