# Seleção

tomada decisão

## vocabulario

- if = se
- else = senao

```java
if ( /* condição / booleano */ ) {
  // faça algo se for verdadeiro
}
```

```java
boolean estaChovendo = false;

if(estaChovendo) {
  // do something
}
```

```java
double nota = 7.8;

if ( nota >= 7 ) {
  System.out.println("aprovado");
} else {
  System.out.println("recuperacao");
}
```

```java
// se for maior ou igual a 7, aprovado
// se for maior ou igual a 4 e menor que 7, recuperacao
// se for abaixo de 4, reprovado
double nota = 7.8;

if ( nota >= 7 ) {
  System.out.println("aprovado");
} else if ( nota >= 4 ) {
  System.out.println("recuperacao");
} else {
  System.out.println("reprovado");
}
```

```java
if (cargo == "admin") {

} else if (cargo == "backoffice") {

} else if (cargo == "user") {
  
}
```
