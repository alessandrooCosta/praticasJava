package VertoresMatrizes.ex4;
// Faça um programa com uma matriz com 9 elementos (3x3) reais positivos. Calcule e exiba a soma dos elementos de cada linha desta matriz.
public class Main {
    public static void main(String args[]) {
        double matriz[][] = {{10.5, 20.5, 30.5}, {10.6, 20.6, 30.6}, {10.7, 20.7, 30.7}};
        double somaTotal = 0;
        for (int i = 0; i < matriz.length; i++) {
            double somaLinha = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinha += matriz[i][j];
                somaTotal += matriz[i][j];
            }
            String formatado = String.format("%.2f", somaLinha);
            System.out.println("Soma da linha " + i + ": " + formatado);
        }
        String formatado = String.format("%.2f", somaTotal);
        System.out.println("A soma total de todos os valores da Matriz é:  "+ formatado);
    }
}
