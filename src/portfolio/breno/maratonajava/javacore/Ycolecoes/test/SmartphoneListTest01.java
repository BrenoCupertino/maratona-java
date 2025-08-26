package portfolio.breno.maratonajava.javacore.Ycolecoes.test;

import portfolio.breno.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("123", "Samsumg");
        Smartphone s2 = new Smartphone("156", "Iphone");
        Smartphone s3 = new Smartphone("503", "LG");

        List<Smartphone> smartphoneList = new ArrayList<>();
        smartphoneList.add(s1);
        smartphoneList.add(s2);
        smartphoneList.add(s3);

        for(Smartphone s : smartphoneList) {
            System.out.println(s.toString());
        }

        Smartphone s4 = new Smartphone("156", "Iphone");
        System.out.println(smartphoneList.contains(s4));
        System.out.println(smartphoneList.indexOf(s3));
        System.out.println(smartphoneList.get(2));

    }
}
