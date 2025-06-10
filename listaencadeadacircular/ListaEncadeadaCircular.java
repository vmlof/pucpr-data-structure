package listaencadeadacircular;

public class ListaEncadeadaCircular {
    private class No {
        int valor;
        No proximo;
        No(int valor) {
            this.valor = valor;
        }
    }

    private No inicio;

    private boolean vazia() {
        return inicio == null;
    }

    public void inserir(int valor) {
        No novoNo = new No(valor);

        if (vazia()) {
            inicio = novoNo;
            novoNo.proximo = inicio;
            return;
        }

        No atual = inicio;
        while (atual.proximo != inicio) {
            atual = atual.proximo;
        }
        atual.proximo = novoNo;
        novoNo.proximo = inicio;
    }

    public void remover(int valor) {
        if (vazia()) {
            System.out.println("Lista vazia.");
            return;
        }

        No atual = inicio;
        No anterior = null;

        do {
            if (atual.valor == valor) {
                if (anterior == null) { // Remover início
                    if (atual.proximo == inicio) { // Só tem 1 elemento
                        inicio = null;
                    } else {
                        No ultimo = inicio;
                        while (ultimo.proximo != inicio) {
                            ultimo = ultimo.proximo;
                        }
                        inicio = inicio.proximo;
                        ultimo.proximo = inicio;
                    }
                } else {
                    anterior.proximo = atual.proximo;
                }
                return;
            }
            anterior = atual;
            atual = atual.proximo;
        } while (atual != inicio);

        System.out.println("Elemento não encontrado.");
    }

    public void exibir() {
        if (vazia()) {
            System.out.println("Lista vazia.");
            return;
        }

        No atual = inicio;
        do {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        } while (atual != inicio);
        System.out.println("(volta ao início)");
    }
}
