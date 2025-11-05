public class Exercise_1 {
    //O tamanho da tabela hash e M=5.
    //Isso significa que os índices possíveis vão de 0 a 4. (M-1)
    int tamanho;
    String chave;

    public Exercise_1(String chave, int tamanho){
        this.chave =chave;
        this.tamanho = tamanho;
    }

    
    int hash(String chave, int tamanho) {
        return (chave.length() - 1) % tamanho;
    }

}
