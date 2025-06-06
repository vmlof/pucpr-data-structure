package listaencadeada;

public class ListaEncadeada {
    class No {
        int valor;
        No proximo;
        No(int valor) {
            this.valor = valor;
        }
    }

    private No inicio;

    private boolean vazia(){return inicio == null;}

    public void inserir(int valor) {
        No novoNo = new No(valor);

        if(vazia()) {
            inicio = novoNo;
            return;
        }

        No atual = inicio;
        while(atual.proximo != null) {
            atual = atual.proximo;
        }
        atual.proximo = novoNo;
    }

    public void remover(int valor) {
        if(vazia()) {
            System.out.println("Lista vazia.");
            return;
        }

        if(valor == inicio.valor) {
            inicio = inicio.proximo;
            return;
        }

        No atual = inicio;
        while(atual.proximo != null) {
            if(atual.proximo.valor == valor) {
                atual.proximo = atual.proximo.proximo;
                return;
            }
            atual = atual.proximo;
        }
        System.out.println("Elemento não encotrado.");

    }

    public void exibir() {
        if(vazia()) {
            System.out.println("Lista vazia.");
            return;
        }

        No atual = inicio;
        while(atual.proximo != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }
        System.out.print(atual.valor);

    }
}
