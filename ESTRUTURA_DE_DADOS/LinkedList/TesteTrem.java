/*
Desafio: O Trem de Vagões (Manual-Híbrido)
Em vez de usar apenas o add(), vamos entender como o Java conecta um item ao outro. Imagine que cada objeto da lista é um "Vagão".

A Missão:

Criar uma LinkedList<String> trem = new LinkedList<>();.

Adicionar 3 vagões: "Locomotiva", "Carga", "Passageiros".

Usar um método para inserir um vagão exatamente no meio (na posição 1), entre a Locomotiva e a Carga.

Remover o vagão da frente (Locomotiva).
 */
import java.util.LinkedList;

public class TesteTrem {
    public static void main(String[] args) {
        LinkedList<String> trem = new LinkedList<>();

        // 1. Adicionando normalmente
        trem.add("Locomotiva");
        trem.add("Carga");
        trem.add("Passageiros");


        // 2. O "Pulo do Gato": Inserir no meio (Posição 1)
        // No Array isso seria lento (teria que empurrar todos).
        // Na Linked List, o Java só troca os elos.
        trem.add(1, "Vagão de Manutenção");

        System.out.println("Trem completo: " + trem);

        // 3. Remover o primeiro item (a cabeça da lista)
        // Qual método você usaria para tirar quem está na frente?
        trem.removeFirst();

        // 4. Checar se o Vagão de Manutenção agora é o primeiro
        System.out.println("Após trocar a locomotiva: " + trem);
        System.out.println("Novo primeiro: " + trem.getFirst());
    }
}