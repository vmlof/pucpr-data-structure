package pilhaencadeada;

public class Pilha {
    private No topo;

    public Pilha() {
        topo = null;
    }

    private boolean vazia() {
        return topo == null;
    }

    public void insere(int elemento) {
        No novoNo = new No(elemento);
        novoNo.setProximo(topo);
        topo = novoNo;
    }

    public Integer remove() {
        if (vazia()) {
            System.out.println("pilha vazia");
            return null;
        }
        int noTopo = topo.getElemento();
        topo = topo.getProximo();
        return noTopo;
    }

    public void imprime() {
        if (vazia()) {
            System.out.println("pilha vazia");
            return;
        }
        No atual = topo;
        while (atual != null) {
            System.out.println(atual.getElemento());
            atual = atual.getProximo();
        }
    }
}
