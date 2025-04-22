package Arrays.ex1;

import java.util.ArrayList;
import java.util.Collections;

public class MainFuncoes {

    public static void criaArray(ArrayList<Integer> array){
        System.out.println("Array Original: ");
        for (int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }
        Collections.reverse(array);
    }

    public static void mostraArray(ArrayList<Integer> array){
        System.out.println("Array invertido: ");
        for (int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }
    }

    public static void main(String args[]){
        ArrayList<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);
        criaArray(array);
        mostraArray(array);
    }
}
