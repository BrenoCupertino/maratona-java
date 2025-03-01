package portfolio.breno.maratonajava.javacore.QString.test;

public class StringTest02 {
    public static void main(String[] args) {
        String n = "    Breno   ";
        String n2 = "012345";
        System.out.println(n.charAt(0));
        System.out.println(n.length());
        System.out.println(n.replace("n", "p"));
        System.out.println(n.toLowerCase());
        System.out.println(n.toUpperCase());
        System.out.println(n2.substring(1, 3));
        System.out.println(n.trim());
    }
}
