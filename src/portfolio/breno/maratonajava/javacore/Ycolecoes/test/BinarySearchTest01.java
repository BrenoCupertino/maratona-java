package portfolio.breno.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        // Retorna a posição do elemente ou onde devemos inserir caso não esteja na lista
        // Lista precisa estar ordenada primeiro
        // Posição de inserção -> (-(ponto de inserção) -1)
        Collections.sort(nums);
        System.out.println(Collections.binarySearch(nums,10));
    }
}
