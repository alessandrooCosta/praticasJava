package VertoresMatrizes.ex1;

public class Main {
    public static void Main(String args[]){
        //1. Criar vetor de 10 posições. Use for para mostrar os valores.
        int vetor1[] = {10,20,30,40,50,60,70,80,90,100};
        for (int i = 0; i < vetor1.length; i++){
            System.out.println(vetor1[i]);
        }
        System.out.println("--------------------");
        // outra forma de fazer
        for (int i : vetor1){
            System.out.println(i);
        }
        System.out.println("--------------------");
    }
}
