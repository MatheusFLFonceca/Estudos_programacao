/*Desafio Final do Dia 3: A "Lista de Compras" Inteligente
Para encerrar os testes de LinkedList e consolidar tudo, vamos simular uma situação onde a ordem importa, mas a gente muda de ideia o tempo todo.

Sua missão:

Crie uma LinkedList<String> compras.

Adicione: "Arroz", "Feijão", "Carne".

O cliente lembrou que precisa de "Ovos" com urgência. Adicione "Ovos" na primeira posição da lista.

O cliente desistiu da "Carne". Remova o último item.

Verifique se um item está na lista: Use o método .contains("Feijão") dentro de um if e imprima "Feijão está na lista!" se for verdade.

🛠️ Dica de Ouro para o código:
        No Java, para adicionar no início, você pode usar add(0, "Ovos") ou o método mais específico: addFirst("Ovos").

Tente montar esse último teste. Se o seu contains funcionar, você terá dominado:

Inserção no início (addFirst).

Remoção no fim (removeLast).

Busca em listas (contains). */
import java.util.LinkedList;

public class ListaCompras {
    public static void main (String[] args){
        LinkedList<String> compras = new LinkedList<>();

        compras.add("Arroz");
        compras.add("Feijão");
        compras.add("Carne");

        compras.add(0, "Ovos");
        System.out.println("Lista atual: "+ compras);

        compras.removeLast();
        System.out.println("Lista atual: "+ compras);
        if (compras.contains("Feijão")){
        System.out.println("O feijão está na lista!");
        }
    }
}