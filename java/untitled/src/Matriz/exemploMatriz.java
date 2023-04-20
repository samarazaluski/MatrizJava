package Matriz;

import java.util.Arrays;
import java.util.Scanner;

public class exemploMatriz {
    public int[] tamanhoMatriz() {
        System.out.println("Tamanho da matriz");
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[2];


        System.out.println("Linhas:");
        vetor[0] = input.nextInt();
        System.out.println("Colunas:");
        vetor[1] = input.nextInt();

        return vetor;
    }

    public int[][] criarMatriz(int[] v) {
        System.out.println("Criar a matriz");
        Scanner input = new Scanner(System.in);

        //instaciando uma matriz

        int[][] matriz = new int[v[0]][v[1]];

        //percorrer a matriz

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf("Matriz[%d][%d]:",i,j);
                matriz[i][j] = input.nextInt();
            }
        }
        return matriz;
    }

    public void inprimirMatriz(int[][] m){
        System.out.println("Imprimir matriz " );
        for(int i=0; i<m.length;i++){
            for(int j=0; j<m[i].length; j++){
                System.out.printf("Matriz[%d] [%d]: %d \n", i,j, m[i][j]);
            }
        }
    }

}
