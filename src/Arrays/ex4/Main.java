package Arrays.ex4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Mesclagem de Arrays
//Dado dois arrays, crie um terceiro array que contenha os elementos de ambos, sem duplicatas.
public class Main {
    public static void main(String args[]) {
        List<Integer> primeiroArray = Arrays.asList(10, 70, 30, 40, 80);
        List<Integer> segundoArray = Arrays.asList(10, 90, 80, 70, 60);
        ArrayList<Integer> arrayAmbos = new ArrayList<>();
        arrayAmbos.addAll(primeiroArray);
        arrayAmbos.addAll(segundoArray);
        ArrayList<Integer> arraySemDuplas = new ArrayList<>();
        for (int count = 0; count < arrayAmbos.size(); count++){
            if (!arraySemDuplas.contains(arrayAmbos.get(count))){
                arraySemDuplas.add(arrayAmbos.get(count));
            }
        }
        System.out.println(arraySemDuplas);
    }
}
