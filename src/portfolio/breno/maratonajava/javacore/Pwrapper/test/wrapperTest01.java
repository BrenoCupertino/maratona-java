package portfolio.breno.maratonajava.javacore.Pwrapper.test;

public class wrapperTest01 {
    /* Wrappers -> Iram encapsular os tipos primitivos e transforma-los em objetos.
     Para um tipo se tornar um Wrapper é necessário que a primeira letra que define o tipo seja maiscula.
     Nos casos de "int" e "char" mudaremos para "Interger" e "Character" respectivamente.
     Um dos motivos da criação foi a possibilidade de passagem de tipos primitivos por referência outro foi
     para se adequar as estruturas do pacote collection que não trabalham com tipos primitivos.*/
    public static void main(String[] args) {
        /*Autoboxing -> Transformação do tipo primitivo em wrapper.
          Unboxing -> Contrario do autoboxing.*/

        Byte byteW = 1;
        Short shortW= 100;
        Integer intW = 1025; // autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = true;

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("15");
        System.out.println(intW2);
    }
}
