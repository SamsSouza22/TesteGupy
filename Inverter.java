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
