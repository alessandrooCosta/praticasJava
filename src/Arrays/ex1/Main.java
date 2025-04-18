package Arrays.ex1;
import java.util.ArrayList;
import java.util.Collections;
//Inverter um Array
//Crie um programa que inverta a ordem dos elementos em um array.
public class Main {
    public static void main(String args[]){
        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(10);
        array2.add(20);
        array2.add(30);
        array2.add(40);
        array2.add(50);
        ArrayList<Integer> novoArray = new ArrayList<>();
        int tamanhoArray = array2.size();
        for (int count = 0; count < array2.size(); count++){
            tamanhoArray = tamanhoArray - 1;
            novoArray.add(array2.get(tamanhoArray));
        }
        for (int i : novoArray) {
            System.out.println(i);
        }
        System.out.println("-----------");
        // Outra forma de implementar sem criar um novo array. Utilizando Collections.
        ArrayList<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);
        Collections.reverse(array); //
        for (int i : array) {
            System.out.println(i);
        }
    }
}
