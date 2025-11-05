import java.util.LinkedList;

/**
 * Exercise_3 herda Exercise_2 e adiciona funcionalidades de
 * Fator de Carga e Rehashing automático.
 */
public class Exercise_3 extends Exercise_2 {

    // Quantidade atual de elementos na tabela
    private int quant_el;

    // Fator de carga atual
    private double fatorCarga;

    /**
     * Construtor de Exercise_3
     *
     * - Recebe o tamanho inicial do vetor.
     * - Herda o vetor e as listas encadeadas do Exercise_2 via super().
     * - Inicializa a quantidade de elementos como 0.
     */
    public Exercise_3(int tamanho_vetor) {
        super(tamanho_vetor);
        this.quant_el = 0;
        this.fatorCarga = 0.0;
    }

    /**
     * Calcula o fator de carga atual da tabela.
     *
     * Fator de carga = número de elementos / tamanho do vetor
     */
    public double calculoFatorCarga() {
        fatorCarga = (double) quant_el / tamanho_vetor;
        return fatorCarga;
    }

    /**
     * Rehashing da tabela:
     *
     * - Dobra o tamanho do vetor.
     * - Cria um novo vetor de listas encadeadas.
     * - Reinsere todas as chaves antigas no novo vetor.
     */
    public void rehashing() {
        // Guarda a tabela antiga
        LinkedList<String>[] tabelaAntiga = tabelaHashEncadeada;

        // Dobra o tamanho do vetor
        tamanho_vetor *= 2;
        tabelaHashEncadeada = new LinkedList[tamanho_vetor];

        // Inicializa todas as posições com listas vazias
        for (int i = 0; i < tamanho_vetor; i++) {
            tabelaHashEncadeada[i] = new LinkedList<>();
        }

        // Reseta a quantidade de elementos
        quant_el = 0;

        // Reinsere todas as chaves antigas
        for (LinkedList<String> lista : tabelaAntiga) {
            for (String chave : lista) {
                inserirChave(chave); // reutiliza a função de inserção
            }
        }
    }

    /**
     * Inserção de chave com verificação de fator de carga
     */
    @Override
    public void inserirChave(String chave) {
        int indice_chave = funcaoHash(chave); // calcula índice via hash
        tabelaHashEncadeada[indice_chave].add(chave); // insere na lista
        quant_el++; // incrementa quantidade de elementos

        // Atualiza fator de carga
        fatorCarga = calculoFatorCarga();

        // Se ultrapassar 0.75, faz rehash
        if (fatorCarga > 0.75) {
            rehashing();
        }
    }

    /**
     * Busca de chave
     */
    @Override
    public boolean buscarChave(String chave) {
        int indice_chave = funcaoHash(chave);
        return tabelaHashEncadeada[indice_chave].contains(chave);
    }
}
