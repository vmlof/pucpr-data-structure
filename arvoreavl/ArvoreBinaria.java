package arvoreavl;

public class ArvoreBinaria {
    private class No {
        int valor;
        No esquerda;
        No direita;
        int altura;
        No(int valor) {
            this.valor = valor;
            altura = 0;
        }
    }

    No raiz;

    private int altura(No no) {
        if(no == null) return -1;

        int esquerda = altura(no.esquerda);
        int direita = altura(no.direita);
        if(esquerda > direita) return 1 + esquerda;
        return 1 + direita;
    }

    private int fatorBalanceamento(No no) {
        if(no == null) return 0;
        return altura(no.esquerda) - altura(no.direita);
    }

    // rotacao direita
    // No novaRaiz = raiz.esquerda
    // No temp = novaRaiz.direita
    // novaRaiz.direita = raiz
    // raiz.esquerda = temp

    // rotacao esquerda
    // No novaRaiz = raiz.direita
    // No temp = novaRaiz.esquerda
    // novaRaiz.esquerda = raiz
    // raiz.direita = temp


}
