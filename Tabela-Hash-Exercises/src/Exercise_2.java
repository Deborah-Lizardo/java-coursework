import java.util.LinkedList;

class Exercise_2 {

    /**
     * Aqui é criada uma tabela hash que vai funcionar como um vetor de listas encadeadas.
     * Cada posição do vetor vai ser uma lista que pode guardar várias chaves que caem
     * no mesmo índice, resolvendo colisões.
     * Basicamente, é criada uma instância da estrutura que depois vai representar
     * a tabela hash inteira.
     */
    protected LinkedList<String>[] tabelaHashEncadeada;

    /**
     * Aqui eu defino os atributos da minha classe.
     * - "tamanho_vetor" representa quantas posições o meu vetor da tabela hash vai ter.
     *   É basicamente o limite de índices, de 0 até tamanho-1.
     * - "tabelaHashEncadeada" é o meu vetor principal, onde cada posição vai guardar uma lista encadeada (LinkedList).
     *   Essa lista vai ser usada para resolver colisões — se mais de uma chave cair na mesma posição,
     *   elas ficam guardadas dentro dessa lista.
     */
    protected int tamanho_vetor;

    /**
     * Construtor da classe Exercise_2.
     * - O construtor recebe o tamanho da tabela hash (quantas posições o vetor vai ter).
     * - Ele cria o vetor "tabelaHashEncadeada" com esse tamanho.
     * - Depois, o laço "for" passa por todas as posições e inicializa cada uma com uma lista vazia (LinkedList).
     *  Em outras palavras:
     *  estou criando o esqueleto da tabela hash — um vetor onde cada posição já nasce com uma lista encadeada pronta
     *  pra guardar as chaves que forem inseridas.
     */
    public Exercise_2(int tamanho_vetor) {
        this.tamanho_vetor = tamanho_vetor;
        tabelaHashEncadeada = new LinkedList[tamanho_vetor];

        for (int i = 0; i < tamanho_vetor; i++) {
            tabelaHashEncadeada[i] = new LinkedList<>();
        }
    }

    /**
     * Função hash.
     *
     * Essa função gera um índice (posição no vetor da tabela hash) com base no comprimento da String passada.
     * Ou seja, ela transforma a chave em um número inteiro que indica onde a chave deve ser armazenada.
     *
     * Exemplo: se a chave for "Maria" e o tamanho da tabela for 10,
     *          o índice será (5 - 1) % 10 = 4.
     */
    protected int funcaoHash(String chave) {
        return (chave.length() - 1) % tamanho_vetor;
    }

    /**
     * Método para inserir uma chave na tabela hash.
     *
     * - Primeiro, calcula o índice da chave usando a função hash.
     * - Depois, adiciona essa chave dentro da lista encadeada que está naquela posição do vetor.
     * - Se outra chave cair no mesmo índice, ela também vai pra essa mesma lista (isso é o encadeamento).
     */
    public void inserirChave(String chave) {
        int indice_chave = funcaoHash(chave);
        tabelaHashEncadeada[indice_chave].add(chave);
    }

    /**
     * Método para buscar uma chave na tabela hash.
     *
     * - Calcula o índice onde a chave deveria estar.
     * - Acessa a lista daquela posição e verifica se a chave está lá dentro.
     * - Se encontrar, retorna "true". Se não, retorna "false".
     */
    public boolean buscarChave(String chave) {
        int indice_chave = funcaoHash(chave);
        return tabelaHashEncadeada[indice_chave].contains(chave);
    }
}
