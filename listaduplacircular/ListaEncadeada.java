package listaduplacircular;

public class ListaEncadeada {
    private No cabeca;
    private No cauda;

    public ListaEncadeada() {
        cabeca = null;
        cauda = null;
    }

    private boolean vazia() {
        return cabeca == null;
    }

    public void inserirInicio(int elemento) {
        No novoNo = new No(elemento);

        if (vazia()) {
            cabeca = cauda = novoNo;
            cabeca.setProximo(cabeca);
            cabeca.setAnterior(cabeca);
        } else {
            novoNo.setProximo(cabeca);
            novoNo.setAnterior(cauda);
            cabeca.setAnterior(novoNo);
            cauda.setProximo(novoNo);
            cabeca = novoNo;
        }
    }

    public void inserirFim(int elemento) {
        if (vazia()) {
            inserirInicio(elemento);
        } else {
            No novoNo = new No(elemento);
            novoNo.setAnterior(cauda);
            novoNo.setProximo(cabeca);
            cauda.setProximo(novoNo);
            cabeca.setAnterior(novoNo);
            cauda = novoNo;
        }
    }

    private void removerInicio() {
        if (cabeca == cauda) {
            cabeca = cauda = null;
        } else {
            cabeca = cabeca.getProximo();
            cabeca.setAnterior(cauda);
            cauda.setProximo(cabeca);
        }
    }

    private void removerFim() {
        if (cabeca == cauda) {
            cabeca = cauda = null;
        } else {
            cauda = cauda.getAnterior();
            cauda.setProximo(cabeca);
            cabeca.setAnterior(cauda);
        }
    }

    public void remover(int elemento) {
        if (vazia()) return;

        // Caso de único elemento
        if (cabeca == cauda && cabeca.getElemento() == elemento) {
            cabeca = cauda = null;
            return;
        }

        // Remoção na cabeça
        if (cabeca.getElemento() == elemento) {
            removerInicio();
            return;
        }

        // Remoção na cauda
        if (cauda.getElemento() == elemento) {
            removerFim();
            return;
        }

        // Remoção no meio
        No atual = cabeca.getProximo();
        while (atual != cabeca) {
            if (atual.getElemento() == elemento) {
                atual.getAnterior().setProximo(atual.getProximo());
                atual.getProximo().setAnterior(atual.getAnterior());
                return;
            }
            atual = atual.getProximo();
        }
    }

    public void exibirDoInicio() {
        if (vazia()) {
            System.out.println("Erro: lista vazia");
            return;
        }

        No atual = cabeca;
        do {
            System.out.print(atual.getElemento() + " ");
            atual = atual.getProximo();
        } while (atual != cabeca);
        System.out.println();
    }

    public void exibirDoFim() {
        if (vazia()) {
            System.out.println("Erro: lista vazia");
            return;
        }

        No atual = cauda;
        do {
            System.out.print(atual.getElemento() + " ");
            atual = atual.getAnterior();
        } while (atual != cauda);
        System.out.println();
    }
}
