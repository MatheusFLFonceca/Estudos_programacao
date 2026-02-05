/* Sua Missão: Escreva um programa Java completo (em um único arquivo chamado Validador.java) que contenha:

O Método Main:

Crie um array de inteiros chamado assinaturas com os valores: 10, 20, 30, 40, 30, 20, 10.

Chame um método chamado isSimetrico.

Imprima "Integridade Confirmada" se for verdadeiro, ou "Falha na Integridade" se for falso.

O Método isSimetrico:

Este método deve receber o array de inteiros.

Deve usar a estratégia de Two Pointers (dois ponteiros: um no início e um no fim).

Deve retornar um boolean.

Regra: O loop deve continuar apenas enquanto os ponteiros não se cruzarem.
Se encontrar qualquer par diferente, o método deve encerrar imediatamente retornando false.*/

public class ValidadorSimetria {

    public static void main(String[] args){
            //Array de inteiros
        int [] assinaturas = {10, 20, 30, 40, 30, 20, 10};
            //Variavel boolean
        boolean resultado = isSimetrico(assinaturas);
            //Imprime se a integridade é verdade ou falsa
        System.out.println("É simetrico? " + resultado);
    }
        public static boolean isSimetrico(int[] dados) {

            int left = 0;
            int right = dados.length -1; //Tamanho - 1 -> Indice da última posição

            while (left < right) {

                if (dados[left] != dados[right]) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }



















