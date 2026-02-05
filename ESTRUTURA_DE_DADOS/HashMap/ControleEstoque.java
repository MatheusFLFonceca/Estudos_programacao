import java.util.HashMap;

public class ControleEstoque {
    public static void main(String[] args) {
        // Nossa lista de vendas bruta
        String[] vendas = {"pao", "leite", "pao", "cafe", "pao", "leite"};

        // Declaramos o HashMap: Chave (String) e Valor (Integer)
        HashMap<String, Integer> contagem = new HashMap<>();

        for (String item : vendas) {
            // Se o mapa já contém o produto, pegamos o valor atual e somamos +1
            if (contagem.containsKey(item)) {
                contagem.put(item, contagem.get(item) + 1);
            }
            // Se for a primeira vez que o produto aparece, começamos com 1
            else {
                contagem.put(item, 1);
            }
        }

        // Imprimindo o resultado final
        System.out.println("Relatório de Vendas: " + contagem);

        // Teste de busca direta (O(1))
        System.out.println("Quantos pães foram vendidos? " + contagem.get("pao"));
    }
}