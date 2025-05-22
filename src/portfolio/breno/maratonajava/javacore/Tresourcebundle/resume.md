# Internacionalização com ResourceBundle no Java

O `ResourceBundle` é uma ferramenta fundamental do Java utilizada para **internacionalização (i18n)** de aplicações. Ele permite adaptar a interface do sistema a diferentes idiomas e regiões, **sem a necessidade de alterar o código-fonte principal**. Com isso, é possível oferecer uma melhor experiência para usuários de diferentes localidades, apenas fornecendo traduções em arquivos externos.

## Criando arquivos de tradução (bundles)

Para começar, criamos arquivos chamados **bundles**, que são basicamente arquivos `.properties` contendo pares de `chave=valor`, onde cada chave representa um identificador de texto, e o valor representa a tradução correspondente.

### Exemplo:

```properties
# messages_pt_BR.properties
bem_vindo=Bem-vindo ao nosso site!
```

Esses arquivos são nomeados de acordo com o idioma e a localidade, como no exemplo acima: `messages_pt_BR.properties` (português do Brasil). A base do nome do arquivo (`messages`) é a mesma, mudando apenas o sufixo que representa a localidade.

## Adicionando suporte a outro idioma

Para adicionar suporte a outro idioma, como **inglês**, basta criar um novo arquivo `.properties` com o mesmo conjunto de chaves, mas traduzido:

```properties
# messages_en_US.properties
bem_vindo=Welcome to our website!
```

## Seleção automática de idioma

Em tempo de execução, o Java seleciona automaticamente o arquivo apropriado com base na configuração de **localidade do sistema ou da aplicação**. Dessa forma, o conteúdo da interface é exibido no idioma adequado, tornando o sistema mais acessível e amigável para diferentes públicos.

[Acesse para mais detalhes](https://www.baeldung.com/java-resourcebundle)