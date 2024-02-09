import java.util.Scanner;

public class Inverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma palavra para ser invertida");
        String palavra = scanner.next();

        String palavraInvertida = inverterString(palavra, palavra.length());
        System.out.println("Resultado: " + palavraInvertida);

        scanner.close();
    }

    // funcao recursiva para montar a string invertida
    /*
     * enquanto a variavel num nao for zero, a funcao vai
     * sendo chamada junto do primeiro caracter da String,
     * que vai sendo modificado a cada chamada de funcao. Dessa
     * forma, ao chegar no estado de parada num == 1, a funcao retorna
     * os caracteres no formato invertido
     */
    public static String inverterString(String info, int num) {
        if (info == null) {
            return null;
        } else {
            if (num == 1) {
                return "" + info.charAt(0);
            } else {
                return inverterString(info.substring(1), num - 1) + info.charAt(0);
            }
        }
    }
}
