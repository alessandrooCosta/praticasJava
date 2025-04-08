package VertoresMatrizes.ex5;
// Faça um programa com uma matriz 5x5 de inteiros positivos ou negativos e encontre e exiba o maior elemento desta matriz.
public class Main {
    public static void main(String args[]) {
        int matriz[][] = {{-1, 5, 20, -31, 664}, {5, -8, 100, 9, 21}, {22, 64, 90, -30, 509}, {-18, -90, -87, -3, 72}, {10, 500, 8, 0, 30}};
        int guardaPosicao = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (guardaPosicao < matriz[i][j]) {
                    guardaPosicao = matriz[i][j];
                }
            }
        }
        System.out.println("O maior valor desta matriz é: " +  guardaPosicao);
    }
}
