package portfolio.breno.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test02 {
    public static void main(String[] args) {
        // \d -> Digitos
        // \D -> -Digitos
        // \s -> espaço em branco
        // \S -> -espaço em branco
        // \w -> a-zA-Z, digitos, _
        // \W -> -\w
        // [] -> Intervalo de caracteres
        String regex = "0[xX][0-9a-fA-F]";
        String texto = "45 82 0x 0X 4 0XFH 0x124";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
