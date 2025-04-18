package Arrays.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainFuncoes {

    public static void adiconaValores(ArrayList<Integer> arrays){
        System.out.println("Arrays Originais: ");
        for(int i = 0; i < arrays.size(); ++i){
            System.out.println("Posição: "+i+" "+arrays.get(i));
        }
    }

    public static void main(String args[]){
        ArrayList<Integer> arrays = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 5 valores: ");
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();
        int v3 = scanner.nextInt();
        int v4 = scanner.nextInt();
        int v5 = scanner.nextInt();
        arrays.add(v1);
        arrays.add(v2);
        arrays.add(v3);
        arrays.add(v4);
        arrays.add(v5);
        adiconaValores(arrays);
        System.out.println("Digite de 1 a 5 para retirar.");
        int v6 = scanner.nextInt();
        arrays.remove(v6);
        adiconaValores(arrays);
    }
}
