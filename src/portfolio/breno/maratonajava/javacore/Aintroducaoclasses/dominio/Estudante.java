package portfolio.breno.maratonajava.javacore.Aintroducaoclasses.dominio;

/**
 * Coesão: Cada classe ter um proposito especifico!
 * <b>Alta coesão é bom</b>.
*/
public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    // Constructor
    public Estudante(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
}

