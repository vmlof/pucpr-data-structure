package filaencadeadacircular;

public class Fila {
    class No {
        int valor;
        No proximo;
        No(int valor) {
            this.valor = valor;
        }
    }

    private No inicio;
    private No fim;

    private boolean vazia(){return inicio == null && fim == null;}

    public Fila() {
        inicio = null;
        fim = null;
    }

    public void inserir(int valor) {
        No novoNo = new No(valor);

        if(vazia()) {
            inicio = novoNo;
        } else {
            fim.proximo = novoNo;
        }
        fim = novoNo;
        novoNo.proximo = inicio;
    }

    public void remover() {
        if(vazia()) {
            System.out.println("erro, fila vazia");
            return;
        }

        if(inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.proximo;
            fim.proximo = inicio;
        }
    }

    public void exibir() {
        if(vazia()) {
            System.out.println("erro, fila vazia");
            return;
        }

        No atual = inicio;
        do {
            System.out.print("[" + atual.valor + "] ");
            atual = atual.proximo;
        } while(atual != inicio);
        System.out.println();
    }
}
