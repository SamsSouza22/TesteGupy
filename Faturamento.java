import java.util.*;

public class Faturamento {
    public static void main(String[] args) {
        Map<Integer, Double> faturamentoDiario = new HashMap<>();
        faturamentoDiario.put(1, 22174.1664);
        faturamentoDiario.put(2, 24537.6698);
        faturamentoDiario.put(3, 26139.6134);
        faturamentoDiario.put(4, 0.0);
        faturamentoDiario.put(5, 0.0);
        faturamentoDiario.put(6, 26742.6612);
        faturamentoDiario.put(7, 0.0);
        faturamentoDiario.put(8, 42889.2258);
        faturamentoDiario.put(9, 46251.174);
        faturamentoDiario.put(10, 11191.4722);
        faturamentoDiario.put(11, 0.0);
        faturamentoDiario.put(12, 0.0);
        faturamentoDiario.put(13, 3847.4823);
        faturamentoDiario.put(14, 373.7838);
        faturamentoDiario.put(15, 2659.7563);
        faturamentoDiario.put(16, 48924.2448);
        faturamentoDiario.put(17, 18419.2614);
        faturamentoDiario.put(18, 0.0);
        faturamentoDiario.put(19, 0.0);
        faturamentoDiario.put(20, 35240.1826);
        faturamentoDiario.put(21, 43829.1667);
        faturamentoDiario.put(22, 18235.6852);
        faturamentoDiario.put(23, 4355.0662);
        faturamentoDiario.put(24, 13327.1025);
        faturamentoDiario.put(25, 0.0);
        faturamentoDiario.put(26, 0.0);
        faturamentoDiario.put(27, 25681.8318);
        faturamentoDiario.put(28, 1718.1221);
        faturamentoDiario.put(29, 13220.495);
        faturamentoDiario.put(30, 8414.61);

        double minFaturamento = calcularMinFaturamento(faturamentoDiario);
        double maxFaturamento = calcularMaxFaturamento(faturamentoDiario);
        double diasAcimaDaMedia = calcularDiasAcimaDaMedia(faturamentoDiario);

        System.out.println("O menor faturamento diario foi de: " + minFaturamento);
        System.out.println("O maior faturamento diario foi de: " + maxFaturamento);
        System.out.println("Tivemos " + diasAcimaDaMedia + " dias onde o faturamento ficou acima da media mensal");
    }

    public static double calcularMinFaturamento(Map<Integer, Double> faturamento) {
        double menor = Double.MAX_VALUE;

        for (double valor : faturamento.values()) {
            if (valor < menor)
                menor = valor;
        }
        return menor;
    }

    public static double calcularMaxFaturamento(Map<Integer, Double> faturamento) {
        double maior = Double.MIN_VALUE;

        for (double valor : faturamento.values()) {
            if (valor > maior)
                maior = valor;
        }
        return maior;
    }

    public static int calcularDiasAcimaDaMedia(Map<Integer, Double> faturamento) {
        int dias = 0;
        double soma = 0;

        for (double valor : faturamento.values()) {
            soma += valor;
        }
        double mediaFaturamento = soma / faturamento.size();
        for (double faturado : faturamento.values()) {
            if (faturado > mediaFaturamento)
                dias++;
        }

        return dias;
    }
}
