package listaduplaencadeada;

public class ListaEncadeada {
    private class No {
        int valor;
        No proximo;
        No anterior;
        No(int valor) {
            this.valor = valor;
        }
    }

    private No cabeca;
    private No cauda;

    private boolean vazia() {return cabeca == null && cauda == null;}

    public ListaEncadeada() {
        cabeca = null;
        cauda = null;
    }

    public void inserirInicio(int valor) {
        No novoNo = new No(valor);

        if (cabeca == null) {
            cabeca = novoNo;
            cauda = novoNo;
        } else {
            novoNo.proximo = cabeca;
            cabeca.anterior = novoNo;
            cabeca = novoNo;
        }
    }

    public void inserirFinal(int valor) {
        No novoNo = new No(valor);

        if(vazia()) {
            cabeca = novoNo;
            cauda = novoNo;
        } else {
            novoNo.anterior = cauda;
            cauda.proximo = novoNo;
            cauda = novoNo;
        }
    }

    private void removerInicio() {
        if(cabeca == cauda) {
            cabeca = null;
            cauda = null;
        } else {
            cabeca = cabeca.proximo;
            cabeca.anterior = null;
        }
    }

    private void removerFinal() {
        if(cabeca == cauda) {
            cabeca = null;
            cauda = null;
        } else {
            cauda = cauda.anterior;
            cauda.proximo = null;
        }
    }

    public void remover(int valor) {
        if(vazia()) return;

        No atual = cabeca;
        while(atual != null) {
            if(atual.valor == valor) {
                if(atual == cabeca) {
                    removerInicio();
                } else if(atual == cauda) {
                    removerFinal();
                } else {
                    atual.anterior.proximo = atual.proximo;
                    atual.proximo.anterior = atual.anterior;
                }
                return;
            }
            atual = atual.proximo;
        }
    }

    public void exibirInicio() {
        if(vazia()) {
            System.out.println("erro: lista vazia");
            return;
        }

        No atual = cabeca;
        while(atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
    }

    public void exibirFim() {
        if(vazia()) {
            System.out.println("erro: lista vazia");
            return;
        }

        No atual = cauda;
        while(atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.anterior;
        }
    }

}
