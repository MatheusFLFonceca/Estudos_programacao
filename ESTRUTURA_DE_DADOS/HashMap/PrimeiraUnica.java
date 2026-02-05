/*Desafio 2: Encontrar o "Primeiro Único" (Ouro em Entrevistas)
Este cai muito em processos seletivos. Dada uma palavra, você deve encontrar a primeira letra que não se repete.

Exemplo: Na palavra "ESTATISTICA", a letra 'E' aparece uma vez, 'S' aparece duas, 'T' aparece três... Sua missão:

Use um HashMap<Character, Integer> para contar quantas vezes cada letra aparece (igual fizemos no contador de pães).

Depois, percorra a palavra de novo e pergunte ao mapa qual letra tem o valor 1.

A primeira que você encontrar com valor 1, você imprime e para o programa.*/
import java.util.HashMap;

public class PrimeiraUnica {
    public static void main (String[] args){
        String palavra = "PARALELEPIPEDO";
        char[] letras = palavra.toCharArray();
        System.out.println("A palavra inicial é: "+ palavra);
        HashMap<Character, Integer> contagem = new HashMap<>();

        for (char letra : letras){
            if (contagem.containsKey(letra)) {
                contagem.put(letra, contagem.get(letra)+1);
            }
            else {
                contagem.put(letra, 1);
            }/* OU
            for (char letra : letras){
            contagem.put(letra, contagem.getOrDefault(letra, 0) + 1);
            }
            */
        }
        // 2. Exibição: Percorrendo o mapa para mostrar o relatório
        System.out.println("--- Relatório de Frequência ---");

        // Aqui usamos o entrySet() para pegar o "Par" (Chave e Valor) de uma vez só
        for (HashMap.Entry<Character, Integer> entrada : contagem.entrySet()) {
            System.out.println("Letra: " + entrada.getKey() + " | Aparece: " + entrada.getValue() + " vezes");
        }

        for (char letra : letras){
            if (contagem.get(letra)==1){
                System.out.println("A primeira letra única é: " + letra);
                return;
                  }
             }
        }
    }