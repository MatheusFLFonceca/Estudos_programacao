public class PalindromoVerificador {
    public static void main(String[] args) {
        String palavra = "NATAN";

        // Chamamos a nossa função e guardamos o resultado (verdadeiro ou falso)
        boolean resultado = ehPalindromo(palavra);

        System.out.println("A palavra " + palavra + " é palíndromo? " + resultado);
    }

    public static boolean ehPalindromo(String texto) {
        // PONTO 1: Criamos os nossos dois ponteiros (índices)
        int esquerda = 0;
        int direita = texto.length() - 1; // Lembra? Última posição é tamanho - 1

        // PONTO 2: Enquanto os ponteiros não se cruzarem no meio
        while (esquerda < direita) {

            // PONTO 3: Pegamos a letra de cada ponta e comparamos
            // charAt(i) é como acessamos a "gaveta" da String
            if (texto.charAt(esquerda) != texto.charAt(direita)) {
                return false; // Se uma letra for diferente, já paramos: não é palíndromo!
            }

            // PONTO 4: Movemos os ponteiros em direção ao centro
            esquerda++; // Anda para a direita
            direita--;  // Anda para a esquerda
        }

        // Se o loop terminou e não retornou 'false', é porque todas as letras bateram!
        return true;
    }
}