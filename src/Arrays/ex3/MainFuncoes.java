package Arrays.ex3;

import java.util.Arrays;
import java.util.List;

public class MainFuncoes {

    public static void mostraArray(List<Integer> array){
        System.out.println("Valores do Array: ");
        for (int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }
    }

    public static void mediaDoArray(List<Integer> array){
        int somaArray = 0;
        for (int i = 0; i < array.size(); i++){
            somaArray += array.get(i);
        }
       double mediaDoArray = (double) somaArray / array.size();
        System.out.println(mediaDoArray);
    }

    public static void main(String args[]){
        List<Integer> array = Arrays.asList(10,20,30,40,50);
        mostraArray(array);
        mediaDoArray(array);
    }
}
