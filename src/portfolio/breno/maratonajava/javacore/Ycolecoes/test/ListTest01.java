package portfolio.breno.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        // Forçar definição do tipo em tempo de compilação
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Breno");
        nomes.add("Lucas");
        nomes.add("Junior");
        nomes.add("Senior");
        nomes.remove(3);
        nomes.remove("Breno");
        nomes2.add("Julia");
        nomes2.add("Maria");
        nomes.addAll(nomes2);

        for(String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("------------");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println("------------");
        List<Integer> nums = new ArrayList<>(); // Coleções só podem ser criadas a partir de wrappers
        nums.add(1);
        nums.add(2);
        nums.add(3);

        for(Integer n : nums) {
            System.out.println(n);
        }
    }
}
