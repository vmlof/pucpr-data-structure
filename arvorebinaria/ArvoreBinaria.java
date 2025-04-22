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

    public void remover(int info) {
        raiz = removerRec(raiz, info);
    }

    public void menorElemento() {
        System.out.println("menor elemento: " + menorArvore(raiz).info);
    }

    public void maiorElemento() {
        System.out.println("maior elemento: " + maiorArvore(raiz).info);
    }

    public void inOrdem() {
        inOrdemRec(raiz);
    }

    public void preOrdem() {
        preOrdemRec(raiz);
    }

    public void posOrdem() {
        posOrdemRec(raiz);
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

    private No removerRec(No raiz, int info) {
        if(raiz == null) {
            return null;
        }
        if(info < raiz.info) {
            raiz.esquerda = removerRec(raiz.esquerda, info);
        }
        else if(info > raiz.info) {
            raiz.direita = removerRec(raiz.direita, info);
        }
        else {
            if(raiz.esquerda == null || raiz.direita == null) {
                No atual = null;
                atual = raiz.esquerda == null ? raiz.direita : raiz.esquerda;
                if(atual == null) {
                    return null;
                } else {
                    return atual;
                }
            }
            else {
                No sucessor = sucessor(raiz);
                raiz.info = sucessor.info;
                raiz.direita = removerRec(raiz.direita, sucessor.info);
                return raiz;
            }
        }
        return raiz;
    }

    private No sucessor(No raiz) {
        if (raiz == null || raiz.direita == null) {
            return null;
        }
        No atual = raiz.direita;
        while (atual.esquerda != null) {
            atual = atual.esquerda;
        }
        return atual;
    }


    private No menorArvore(No raiz) {
        if(raiz == null) {
            return null;
        }
        No atual = raiz;
        while(atual.esquerda != null) {
            atual = atual.esquerda;
        }
        return atual;
    }

    private No maiorArvore(No raiz) {
        if(raiz == null) {
            return null;
        }
        No atual = raiz;
        while(atual.direita != null) {
            atual = atual.direita;
        }
        return atual;
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

    private void posOrdemRec(No raiz) {
        if(raiz != null) {
            posOrdemRec(raiz.esquerda);
            posOrdemRec(raiz.direita);
            System.out.print(raiz.info + " ");
        }

    }
}
