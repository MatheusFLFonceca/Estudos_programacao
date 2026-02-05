import java.util.HashMap;

public class DetectorFraude {
    public static void main(String[] args) {
        // 1. O Array de IDs que vamos analisar
        int[] idsAcesso = {101, 202, 303, 404, 202, 505};

        // 2. O Mapa para servir de memória (ID -> FoiVisto?)
        HashMap<Integer, Boolean> mapaId = new HashMap<>();

        // 3. O Loop para percorrer os IDs
        for (int id : idsAcesso) {
            if (mapaId.containsKey(id)){
                System.out.println("FRAUDE DECTADA"+ id) ;
                return;
            }
            else {
                mapaId.put(id, true);
                System.out.println("Id adicionada" + id);
            }
            // --- SEU TRABALHO COMEÇA AQUI ---

            // A. Verifique se o ID já está no mapa (use o método containsKey)

            // B. Se estiver, imprima "FRAUDE DETECTADA: " + id e use 'return;' para parar

            // C. Se não estiver, adicione o ID ao mapa (use o método put)

            // --- SEU TRABALHO TERMINA AQUI ---
        }

        System.out.println("SISTEMA SEGURO: Nenhum ID repetido.");
    }
}