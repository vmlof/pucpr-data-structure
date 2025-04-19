package arvorebinaria;

public class ArvoreBinaria {
    private class No {
        int info;
        No esquerda;
        No direita;
        No(int info) {
            this.info = info;
        }
    }
    private No raiz;

    public void inserir(int info) {
        raiz = inserirRec(raiz, info);
    }

    public void inOrdem() {
        inOrdemRec(raiz);
    }

    public void preOrdem() {
        preOrdemRec(raiz);
    }

    private No inserirRec(No raiz, int info) {
        if(raiz == null) {
            raiz = new No(info);
        }
        else if(info < raiz.info) {
            raiz.esquerda = inserirRec(raiz.esquerda, info);
        }
        else if(info > raiz.info) {
            raiz.direita = inserirRec(raiz.direita, info);
        }
        return raiz;
    }

    private void inOrdemRec(No raiz) {
        if(raiz != null) {
            inOrdemRec(raiz.esquerda);
            System.out.print(raiz.info + " ");
            inOrdemRec(raiz.direita);
        }
    }

    private void preOrdemRec(No raiz) {
        if(raiz != null) {
            System.out.print(raiz.info + " ");
            preOrdemRec(raiz.esquerda);
            preOrdemRec(raiz.direita);
        }
    }
}
