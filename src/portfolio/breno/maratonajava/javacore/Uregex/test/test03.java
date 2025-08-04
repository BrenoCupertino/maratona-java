package portfolio.breno.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test03 {
    public static void main(String[] args) {
        // \d -> Digitos
        // \D -> -Digitos
        // \s -> espaço em branco
        // \S -> -espaço em branco
        // \w -> a-zA-Z, digitos, _
        // \W -> -\w
        // [] -> Intervalo de caracteres
        // ? -> 0 ou 1 ocorrencia
        // * -> 0+
        // + -> 1+
        // {x,y} -> De x a y ocorrências
        // () -> Agrupamento
        // | -> Ou
        // $ -> EndLine
        // . -> Coringa. Ex.: 1.3 = 1835, 1@3, etc...
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "45 82 0x 0X 4 0XFD 0x12G";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
