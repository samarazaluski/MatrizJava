package Matriz;

public class texteMatrix {
    public static void main(String[] args) {
        exemploMatriz em = new exemploMatriz();
        int[] v = em.tamanhoMatriz();
        int[][] m = em.criarMatriz(v);
        em.inprimirMatriz(m);
    }
}
