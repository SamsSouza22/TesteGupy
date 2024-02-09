import java.util.*;

public class Estados {
    public static void main(String[] args) {
        // usei hashmap mais uma vez para associar cada estado com seu faturamento
        Map<String, Double> estados = new HashMap<>();
        estados.put("SP", 67836.43);
        estados.put("RJ", 36678.66);
        estados.put("MG", 29229.88);
        estados.put("ES", 27165.48);
        estados.put("Outros", 19849.53);

        double somaTotal = 0;
        // calculando o valor total do faturamento no mes para realizar o calculo de
        // porcentagem
        for (double faturamento : estados.values()) {
            somaTotal += faturamento;
        }

        System.out.println("Percentual de representacao de cada estado: ");
        // usei Map.Entry para conseguir acessar as keys do hashmap, entao realizei o
        // calculo de percentual
        for (Map.Entry<String, Double> valores : estados.entrySet()) {
            double percentual = (valores.getValue() / somaTotal) * 100;
            // formatando para duas casas decimais
            String percentualFormatado = String.format("%.2f", percentual);
            System.out.println(valores.getKey() + ": " + percentualFormatado);
        }
    }

}
