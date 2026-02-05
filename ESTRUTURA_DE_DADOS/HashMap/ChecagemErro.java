/*Desafio 1: O Tradutor de Códigos (Dicionário)
Em sistemas de segurança, muitas vezes recebemos códigos de erro numéricos e precisamos exibir uma mensagem amigável para o usuário.

O que fazer:

Crie um HashMap<Integer, String>.

Adicione os seguintes erros:

        404 -> "Página não encontrada"

        500 -> "Erro interno no servidor"

        403 -> "Acesso negado"

Crie uma variável int codigoRecebido = 500;.

Use o código para buscar a mensagem no mapa e imprima: "Erro detectado: Erro interno no servidor".
Dica: Use o método .get(chave).*/
import java.util.HashMap;

public class ChecagemErro {C
    public static void main(String[] args){

        int [] codigosErro = {404, 500, 403};

        HashMap<Integer, String> bibliotecaCodigos = new HashMap<>();

        bibliotecaCodigos.put(404, "Pagina não encontrada");
        bibliotecaCodigos.put(500, "Erro interno no servidor");
        bibliotecaCodigos.put(403, "Acesos negado");

        for (int codigoRecebido : codigosErro){
            if (bibliotecaCodigos.containsKey(codigoRecebido)){
                System.out.println("Erro detectado: "+bibliotecaCodigos.get(codigoRecebido));
                return;
            }
        }

    }
}