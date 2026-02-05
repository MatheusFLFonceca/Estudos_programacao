import java.util.Arrays; // Não esqueças do import!

public class RevisaoDia1 {
    public static void main(String[] args) {
        int[] numeros = {9, 4, 1, 7};
        Arrays.sort(numeros);
        System.out.println("A ordem atual é: "+ Arrays.toString(numeros));
        int menorNumero = numeros[0];
        int maiorNumero = numeros[numeros.length - 1];
        System.out.println("Onde o menor número é " + menorNumero + " e o maior número é " + maiorNumero);
    }
}