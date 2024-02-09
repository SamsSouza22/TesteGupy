import java.util.*;

public class Estados {
    public static void main(String[] args) {
        Map<String, Double> estados = new HashMap<>();
        estados.put("SP", 67836.43);
        estados.put("RJ", 36678.66);
        estados.put("MG", 29229.88);
        estados.put("ES", 27165.48);
        estados.put("Outros", 19849.53);

        double somaTotal = 0;
        
        for(double faturamento: estados.values()){
            somaTotal += faturamento;
        }
        
        System.out.println("Percentual de representacao de cada estado: ");
        for(Map.Entry<String, Double> valores : estados.entrySet()){
            double percentual = (valores.getValue()/somaTotal) * 100;
            String percentualFormatado = String.format("%.2f", percentual);
            System.out.println(valores.getKey() + ": " + percentualFormatado);
        }
    }

}
