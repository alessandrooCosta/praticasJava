package VertoresMatrizes.ex2;

public class Main {
    public static void main(String args[]){

        //2. Crie uma matriz de caracteres de 16 posiçoes. Use dois for para exibir
     char matriz1[][] = { {'a','b','c','d'},{'e','f','g','h'},{'i','j','k','l'},{'m','n','o','p'} };
     for(int i = 0; i < matriz1.length; i++){
         for (int j = 0; j < matriz1.length; j++){
             System.out.println(matriz1[i][j]);
         }
     }
    }
}
