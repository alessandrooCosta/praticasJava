package VertoresMatrizes.ex3;
import java.util.Scanner;

public class Main {
    public static void Main(String args[]){

        // 3. Faça um programa com um vetor com 10 elementos inteiros positivos. Permita que seja solicitado um determina
        // valor inteiro e posivito para ser procurado nesse vetor. Caso exista o programa deve exibir o indice no qual o valor esta posicionado.
        // Se não o programa deve informar que o valor não existe.
        int vetor2[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para verificar se está no vetor: ");
        int numeroSolicitado = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < vetor2.length; i++) {
            if (numeroSolicitado == vetor2[i]) {
                System.out.println("Valor encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }
        if (encontrado == false) {
            System.out.println("Valor Não encontrado.");
        }
    }
}
