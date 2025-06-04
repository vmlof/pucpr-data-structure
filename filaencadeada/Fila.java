package filaencadeada;

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

    public Fila() {
        inicio = null;
        fim = null;
    }

    private boolean vazia(){return inicio == null && fim == null;}

    public void inserir(int valor) {
        No novoNo = new No(valor);
        if (vazia()) {
            inicio = novoNo;
        } else {
            fim.proximo = novoNo;
        }
        fim = novoNo;
    }

    private Integer removerElemento() {
        if (vazia()) {
            System.out.println("fila vazia");
            return null;
        }
        int elemento = inicio.valor;
        inicio = inicio.proximo;

        if (inicio == null) {
            fim = null;
        }
        return elemento;
    }

    public void remover() {
        System.out.println("Elemento removido: " + removerElemento());
    }

    public void imprimir() {
        if (vazia()) {
            System.out.println("Fila vazia");
            return;
        }
        No atual = inicio;
        while (atual != null) {
            System.out.print("[ " + atual.valor + " ]");
            if (atual.proximo != null) {
                System.out.print(" → ");
            }
            atual = atual.proximo;
        }
        System.out.println();
    }
}
