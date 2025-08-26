package portfolio.breno.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] array = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));

        System.out.println("--------------------");

        Integer[] numeros2 = new Integer[]{1, 2, 3};
        List<Integer> list = Arrays.asList(numeros2); // Criação de link com o array, mudanças em um alteram o outro.
        list.set(1, 15);
        System.out.println(list);
        System.out.println(Arrays.toString(numeros2));

        System.out.println("---------------------");
        List<Integer> list2 = new ArrayList<>(Arrays.asList(numeros2)); // Não cria link com o array original
        list2.set(2, 80);
        System.out.println(list2);
        System.out.println(Arrays.toString(numeros2));

        System.out.println("---------------------");
        List<Integer> java9 = List.of(1, 2, 3, 4, 5); //Introduzida a partir do java 9
        System.out.println(java9);
    }
}
