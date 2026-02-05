/* Desafio 3: O Caixa de Supermercado Otimizado
Imagine que você tem um mapa com os preços dos produtos. O usuário vai passando uma "sacola" de compras (um array de nomes de produtos) e você deve calcular o valor total da compra.

O que fazer:

Crie um HashMap<String, Double> tabelaPrecos.

Alimente-o com:

"Maçã" -> 3.50

"Pão" -> 1.20

"Leite" -> 4.50

"Café" -> 12.00

Crie um array (sua sacola): String[] sacola = {"Maçã", "Pão", "Café", "Pão"};.

Crie uma variável double total = 0.0;.

A Missão: Percorra o array sacola. Para cada item, busque o preço no mapa e some à variável total. No final, imprima o valor total. */
        // 1. Declare e alimente o mapa de preços (use Double para valores decimais)

        // 2. Crie o array 'sacola' com os nomes dos produtos

        // 3. Crie a variável 'total'

        // 4. Use um for-each para percorrer a sacola

        // 5. Dentro do loop: total += mapa.get(item);

        // 6. Imprima o resultado final

import java.util.HashMap;

public class CaixaSupermercado {
    public static void main(String[] args){

        String[] produtos = {"Maçã", "Pão", "Leite", "Café"};
        double total = 0.0;

        HashMap<String, Double> tabelaPrecos = new HashMap<>();

        tabelaPrecos.put("Maçã", 3.50);
        tabelaPrecos.put("Pão", 1.20);
        tabelaPrecos.put("Leite", 4.50);
        tabelaPrecos.put("Café", 12.00);

        String[] sacola =  {"Maçã", "Leite", "Café", "Chocolate"};

        for (String item : sacola){
            if (tabelaPrecos.containsKey(item)){
                total +=tabelaPrecos.get(item);
            }
            else {

              System.out.println("Aviso: "+item + " não encontrado no sistema!");
            continue;
            }
        }
        System.out.println("Valor total da sacola: "+total);

    }
}