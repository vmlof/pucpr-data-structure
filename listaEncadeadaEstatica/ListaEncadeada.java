package listaEncadeadaEstatica;

public class ListaEncadeada {
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


    public void inserir(int elemento) {
        if(cheia()) {
            System.out.println("Erro: lista cheia.");
            return;
        }

        if(primeiro == -1) {
            primeiro = 0;

            lista[primeiro] = new No(elemento);
            preenchidos++;
            return;
        }

        int atual = primeiro;
        while(lista[atual].getProximo() != -1) {
            atual = lista[atual].getProximo();
        }

        int livre = posicaoLivre();
        if(livre == -1) {
            return;
        }

        lista[livre] = new No(elemento);
        lista[atual].setProximo(livre);
        preenchidos++;

    }

    public void remover(int elemento) {
        if(vazia()) {
            System.out.println("Erro: lista vazia.");
        }

        if(lista[primeiro].getElemento() == elemento) {
            int posicaoLiberada = primeiro;
            primeiro = lista[primeiro].getProximo();
            lista[posicaoLiberada] = null;
            preenchidos--;
        }

        int atual = primeiro;
        while(lista[atual].getProximo() != -1) {
            if(lista[lista[atual].getProximo()].getElemento() == elemento) {
                int liberarPosicao = lista[atual].getProximo();
                int atualizarProximo = lista[lista[atual].getProximo()].getProximo();
                lista[atual].setProximo(atualizarProximo);
                lista[liberarPosicao] = null;
                preenchidos--;
                return;
            }
            atual = lista[atual].getProximo();
        }
    }

    public void imprimir() {

        if(vazia()) {
            System.out.println("Erro: lista vazia.");
        }

        int atual = primeiro;
        while(atual != -1) {
            System.out.print(lista[atual].getElemento() + " ");
            atual = lista[atual].getProximo();
        }
    }
}
