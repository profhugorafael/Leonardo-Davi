import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // crio minha variavel leitora
        Scanner teclado = new Scanner(System.in);

        // leio e salvo o valor nas variaveis a e b
        int a = teclado.nextInt();
        int b = teclado.nextInt();

        // exibo a soma
        System.out.println(a + b);

    }
}