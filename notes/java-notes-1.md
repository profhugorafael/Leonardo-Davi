# Entradas e saidas no Java

## Saída

imprime e pula pra linha baixa

```java
// sout
System.out.println("Ola mundo");
```

imprime:

```java
// sout
System.out.print("Ola mundo");
```

## Variáveis

São caixinhas de espaço na memória do computador. Java é uma linguagem tipada, então, toda variável tem que ter tipo.

mais importantes:

```java
int idade = 30; // inteiro
double altura = 1.8; // numero com ponto
String nome = "Leo Davi"; // texto
boolean ehHabilitado = true; // verdadeiro ou falso
```

|tipo|exemplo|motivo|
|:-:|:-:|:-:|
|`int`|`int idade = 30`|inteiro|
|`long`|`int idade = 30`|inteiro maior|
|`float`|`float altura = 1.7F`|numero com virgula|
|`double`|`double altura = 1.7F`|numero com virgula|
|`char`|`char inicialNome = 'L'`|um caracter|
|`String`|`String nome = "Leo Davi"`|texto|
|`boolean`|`boolean estaChovendo = false`|true ou false|

usando variáveis:

```java
int a, b = 3;
a = 2;

System.out.println(a + b);
```

## Entada em java

```java
public class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int a = teclado.nextInt();
    int b = teclado.nextInt();

    System.out.println(a + b);

  }
}
```
