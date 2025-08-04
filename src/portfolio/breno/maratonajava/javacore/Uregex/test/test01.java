package portfolio.breno.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test01 {
    public static void main(String[] args) {
        //Simbolos

        String regex = "ab";
        String texto = "abbbababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }
}
