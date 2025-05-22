package arvorebinariaestatica;

public class ArvoreBinaria {
    private Integer[] arvore;
    private int tamanho;

    public ArvoreBinaria(int tamanho) {
        this.tamanho = tamanho;
        arvore = new Integer[tamanho];
    }

    public void inserir(int valor) {
        inserir(valor,0);
    }

    public void remover(int valor) {
        remover(valor,0);
    }

    private void inserir(int valor, int i) {
        if(i > tamanho) {
            System.out.println("Fora dos limites da árvore.");
            return;
        }

        if(arvore[i] == null) {
            arvore[i] = valor;
        } else if(valor < arvore[i]) {
            inserir(valor, 2 * i + 1);
        } else {
            inserir(valor, 2 * i + 2);
        }
    }

    private void remover(int valor, int i) {
        if(i >= tamanho || arvore[i] == null) {
            System.out.println("Valor não encontrado.");
            return;
        }

        if(valor < arvore[i]) {
            remover(valor, 2 * i + 1);
        } else if(valor > arvore[i]) {
            remover(valor, 2 * i + 2);
        } else {

            if(filhoEsquerda(i) == -1 && filhoDireita(i) == -1) {
                arvore[i] = null;
            } else if(filhoEsquerda(i) == -1) {
                remover(arvore[filhoDireita(i)], filhoDireita(i));
            } else if(filhoDireita(i) == -1) {
                arvore[i] = arvore[filhoEsquerda(i)];
                remover(arvore[filhoEsquerda(i)], filhoEsquerda(i));
            } else {
                int substitutoIndex = encontrarMinimo(filhoDireita(i));
                arvore[i] = arvore[substitutoIndex];
                remover(arvore[substitutoIndex], substitutoIndex);
            }
        }
    }

    private int filhoEsquerda(int i) {
        int esq = 2 * i + 1;
        return (esq < tamanho && arvore[esq] != null) ? esq : -1;
    }

    private int filhoDireita(int i) {
        int dir = 2 * i + 2;
        return (dir < tamanho && arvore[dir] != null) ? dir : -1;
    }

    private int encontrarMinimo(int i) {
        int atual = i;
        while (filhoEsquerda(atual) != -1) {
            atual = filhoEsquerda(atual);
        }
        return atual;
    }

    public void imprimir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println("[" + i + "] = " + (arvore[i] == null ? "null" : arvore[i]));
        }
    }

}
