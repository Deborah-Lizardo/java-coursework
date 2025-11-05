public class Exercise_1 {
    int tamanho; // tamanho do vetor p a tabela hash
    String chave;// nomes que vamos inserir

    public Exercise_1(String chave, int tamanho){ //construtor
        this.chave =chave;
        this.tamanho = tamanho;
    }

    public int funcaoHash(String chave, int tamanho) { // Método pedido no exercício 1 parte 1
        return (chave.length() - 1) % tamanho;
    }
}
