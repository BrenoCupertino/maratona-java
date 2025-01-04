package portfolio.breno.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImprimeEstudante {

    /**
     * O parametro <b>estudante</b> fará referência ao mesmo objeto de <b>EstudanteTeste</b>, ou seja, qualquer alteração do objeto nesse metódo irá ter efeito geral.
     */
    public void imprime(Estudante estudante) {
        System.out.println("----------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
