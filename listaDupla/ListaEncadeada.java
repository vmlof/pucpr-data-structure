package listaDupla;

public class ListaEncadeada {
    private No cabeca;
    private No cauda;

    public ListaEncadeada() {
        cabeca = null;
        cauda = null;
    }

    private boolean vazia() {
        return cabeca == null && cauda == null;
    }

    public void inserirInicio(int elemento) {
        No novoNo = new No(elemento);

        if(cabeca == null) {
            cabeca = novoNo;
            cauda = cabeca;
        }
        else {
            novoNo.setProximo(cabeca);
            cabeca.setAnterior(novoNo);
            cabeca = novoNo;
        }
    }

    public void inserirFim(int elemento) {
        No novoNo = new No(elemento);

        if(cabeca == null) {
            inserirInicio(elemento);
        }
        else {
            novoNo.setAnterior(cauda);
            cauda.setProximo(novoNo);
            cauda = novoNo;
        }
    }

    private void removerInicio() {
        cabeca.getProximo().setAnterior(null);
        cabeca = cabeca.getProximo();
    }

    private void removerFim() {
        cauda.getAnterior().setProximo(null);
        cauda = cauda.getAnterior();
    }

    public void remover(int elemento) {
        if(cabeca.getElemento() == elemento) {
            removerInicio();
        }
        if(cauda.getElemento() == elemento){
            removerFim();
        }

        No atual = cabeca;
        while(atual.getProximo() != cauda) {
            if(atual.getProximo().getElemento() == elemento) {
                atual.getProximo().getProximo().setAnterior(atual);
                atual.setProximo(atual.getProximo().getProximo());
            }
            atual = atual.getProximo();
        }
        // removerFim();
    }

    public void exibirDoInicio() {
        if(vazia()) {
            System.out.println("Erro: lista vazia");
        }
        No atual = cabeca;
        while(atual.getProximo() != null) {
            System.out.print(atual.getElemento() + " ");
            atual = atual.getProximo();
        }
        System.out.print(atual.getElemento() + " ");
    }

    public void exibirDoFim() {
        if(vazia()) {
            System.out.println("Erro: lista vazia");
        }
        No atual = cauda;
        while(atual.getAnterior() != null) {
            System.out.print(atual.getElemento() + " ");
            atual = atual.getAnterior();
        }
        System.out.print(atual.getElemento() + " ");
    }
}
