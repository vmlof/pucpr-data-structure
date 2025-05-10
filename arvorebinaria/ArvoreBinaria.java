package arvorebinaria;

public class ArvoreBinaria {
    private class No {
        int valor;
        No esquerda;
        No direita;
        No(int valor) {
            this.valor = valor;
        }
    }
    private No raiz;

    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    public void remover(int valor) {
        raiz = removerRec(raiz, valor);
    }

    public void menorElemento() {
        System.out.println("menor elemento: " + menorArvore(raiz).valor);
    }

    public void maiorElemento() {
        System.out.println("maior elemento: " + maiorArvore(raiz).valor);
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


    private No inserirRec(No raiz, int valor) {
        if(raiz == null) {
            raiz = new No(valor);
        }
        else if(valor < raiz.valor) {
            raiz.esquerda = inserirRec(raiz.esquerda, valor);
        }
        else if(valor > raiz.valor) {
            raiz.direita = inserirRec(raiz.direita, valor);
        }
        return raiz;
    }

    private No removerRec(No raiz, int valor) {
        if(raiz == null) {
            return null;
        }
        if(valor < raiz.valor) {
            raiz.esquerda = removerRec(raiz.esquerda, valor);
        }
        else if(valor > raiz.valor) {
            raiz.direita = removerRec(raiz.direita, valor);
        }
        else {
            if(raiz.esquerda == null || raiz.direita == null) {
                No atual;
                atual = raiz.esquerda == null ? raiz.direita : raiz.esquerda;
                return atual;
            }
            else {
                No sucessor = sucessor(raiz);
                raiz.valor = sucessor.valor;
                raiz.direita = removerRec(raiz.direita, sucessor.valor);
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
            System.out.print(raiz.valor + " ");
            inOrdemRec(raiz.direita);
        }
    }

    private void preOrdemRec(No raiz) {
        if(raiz != null) {
            System.out.print(raiz.valor + " ");
            preOrdemRec(raiz.esquerda);
            preOrdemRec(raiz.direita);
        }
    }

    private void posOrdemRec(No raiz) {
        if(raiz != null) {
            posOrdemRec(raiz.esquerda);
            posOrdemRec(raiz.direita);
            System.out.print(raiz.valor + " ");
        }

    }
}
