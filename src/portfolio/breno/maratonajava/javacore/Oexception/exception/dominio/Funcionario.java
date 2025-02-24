package portfolio.breno.maratonajava.javacore.Oexception.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    /* Quando sobrescrever um metodo que lança execeptions não é necessário que o novo
     metodo lance as mesmas ou alguma exception. No entanto, na sobrescrição, não é possível
     adicionar exceptions mais genericas porém, é possível adicionar mais especificas.
     Também, não é possível colocar exceptions do tipo checked na sobreescrita que não estejam
     declaradas no metodo da superclasse.*/
    @Override
    public void salvar() {
        System.out.println("Salvando");
    }
}
