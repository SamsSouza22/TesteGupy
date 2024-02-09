import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero para conferir se ele pertence a sequencia de Fibonacci");
        int numero = scanner.nextInt();

        if (pertenceFibonacci(numero)) {
            System.out.println(numero + " pertence a sequencia de Fibonacci");
        } else {
            System.out.println(numero + " nao pertence a sequencia de Fibonacci");
        }

        scanner.close();
    }

    // funcao de conferencia de Fibonacci
    public static boolean pertenceFibonacci(int num) {
        // valores iniciais da sequencia
        int a = 0;
        int b = 1;

        // caso o loop encontre o numero, retorna true; caso contrario, retorna false
        while (b <= num) {

            if (b == num) {
                return true;
            }
            // calcula o proximo valor da sequencia
            int prox = a + b;
            // atribuindo os valores para a conferencia na proxima iteracao do loop
            a = b;
            b = prox;

        }

        return false;
    }
}
