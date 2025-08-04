# Resumo de Expressões Regulares (Regex) em Java

Este repositório contém exemplos práticos de como usar **Regex (expressões regulares)** em Java utilizando as classes `Pattern` e `Matcher`.

## 📘 Conceitos Básicos

- **Regex (Regular Expressions)**: Sequência de caracteres que define um padrão de busca.
- **Pattern**: Classe responsável por compilar a regex.
- **Matcher**: Classe responsável por fazer a busca no texto usando o padrão.

```java
Pattern pattern = Pattern.compile(regex);
Matcher matcher = pattern.matcher(texto);
while (matcher.find()) {
    System.out.println(matcher.start() + " " + matcher.group());
}
```

## 🔍 Metacaracteres Comuns

| Regex | Significado |
|------|-------------|
| `.`  | Corresponde a **qualquer caractere** (exceto quebra de linha). |
| `\d` | Um dígito (0-9). |
| `\D` | Não é um dígito. |
| `\s` | Espaço em branco (tabs, quebras de linha, etc.). |
| `\S` | Não é espaço em branco. |
| `\w` | Letras, números e underscore (`a-z`, `A-Z`, `0-9`, `_`). |
| `\W` | Qualquer caractere que **não** seja `\w`. |
| `[abc]` | Qualquer caractere entre colchetes. |
| `[^abc]` | Qualquer caractere **exceto** os listados. |
| `?` | Zero ou uma ocorrência. |
| `*` | Zero ou mais ocorrências. |
| `+` | Uma ou mais ocorrências. |
| `{x,y}` | De **x** a **y** ocorrências. |
| `()` | Agrupamento. |
| `|` | Operador **OU**. |
| `$` | Final da linha. |

## 📂 Exemplos nos arquivos

- **test01.java** → Busca simples pelo padrão `"ab"` em um texto.
- **test02.java** → Demonstração de **intervalos de caracteres** (ex.: hexadecimal).
- **test03.java** → Uso de **quantificadores** e **agrupamentos**.
- **test04.java** → Validação de **e-mails** com regex.

## 📌 Exemplo Prático: Validação de E-mail

```java
String regex = "([a-zA-Z0-9\._-])+@([a-zA-Z])+(\.([a-zA-Z])+)+";
String texto = "email@dominio.com";
Pattern pattern = Pattern.compile(regex);
Matcher matcher = pattern.matcher(texto);

while (matcher.find()) {
    System.out.println("Encontrado: " + matcher.group());
}
```

## 📖 Referências
- [Documentação - Regex](https://www.digitalocean.com/community/tutorials/regular-expression-in-java-regex-example)
