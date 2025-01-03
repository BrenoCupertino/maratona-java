package portfolio.breno.maratonajava.introducao;

public class Aula08ArraysMultidimensionais {
    public static void main(String[] args) {
        //Nesse tipo de array é sempre obrigatorio definir o tamanho do primeiro array
        int[][] lis = new int[2][];
        int[][] lis2 = {{1, 2}, {3, 4}};
        int[][] list3 = new int[][]{{1, 2}, {3, 4}};

        for (int i = 0; i < lis2.length; i++) {
            for(int j = 0; j < lis2[i].length; j++) {
                System.out.println(lis2[i][j]);
            }
        }

        // Foreach
        for (int[] pos: lis2) {
            for (int num: pos) {
                System.out.println(num);
            }
        }
    }
}
