package listaencadeadaestatica;

public class ListaEncadeada {
    private class No {
        int valor;
        int proximo;
        No(int valor) {
            this.valor = valor;
            this.proximo = -1;
        }
    }
    private No[] lista;
    private int primeiro;
    private int tamanho;
    private int preenchidos;

    public ListaEncadeada(int tamanho){
        lista = new No[tamanho];
        this.tamanho = tamanho;
        primeiro = -1;
        preenchidos = 0;
    }

    public boolean cheia() {
        return preenchidos == tamanho;
    }

    public boolean vazia() {
        return preenchidos == 0;
    }

    private int posicaoLivre() {
        for(int i = 0; i < tamanho; i ++) {
            if(lista[i] == null) {
                return i;
            }
        }
        return -1;
    }


    public void inserir(int valor) {
        if(cheia()) {
            System.out.println("Erro: lista cheia.");
            return;
        }

        if(primeiro == -1) {
            primeiro = 0;

            lista[primeiro] = new No(valor);
            preenchidos++;
            return;
        }

        int atual = primeiro;
        while(lista[atual].proximo!= -1) {
            atual = lista[atual].proximo;
        }

        int livre = posicaoLivre();
        if(livre == -1) {
            return;
        }

        lista[livre] = new No(valor);
        lista[atual].proximo = livre;
        preenchidos++;

    }

    public void remover(int valor) {
        if(vazia()) {
            System.out.println("Erro: lista vazia.");
        }

        if(lista[primeiro].valor == valor) {
            int posicaoLiberada = primeiro;
            primeiro = lista[primeiro].proximo;
            lista[posicaoLiberada] = null;
            preenchidos--;
        }

        int atual = primeiro;
        while(lista[atual].proximo != -1) {
            if(lista[lista[atual].proximo].valor == valor) {
                int liberarPosicao = lista[atual].proximo;
                int atualizarProximo = lista[lista[atual].proximo].proximo;
                lista[atual].proximo = atualizarProximo;
                lista[liberarPosicao] = null;
                preenchidos--;
                return;
            }
            atual = lista[atual].proximo;
        }
    }

    public void imprimir() {

        if(vazia()) {
            System.out.println("Erro: lista vazia.");
        }

        int atual = primeiro;
        while(atual != -1) {
            System.out.print(lista[atual].valor + " ");
            atual = lista[atual].proximo;
        }
    }
}
