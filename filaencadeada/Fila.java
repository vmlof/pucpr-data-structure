package filaencadeada;

public class Fila {
    private No inicio;
    private No fim;

    public Fila() {
        inicio = null;
        fim = null;
    }

    public boolean vazia() {
        return inicio == null && fim == null;
    }

    public No getInicio() {
        return inicio;
    }

    public void inserir(int elemento) {
        No novoNo = new No(elemento);
        if (vazia()) {
            inicio = novoNo;
        } else {
            fim.setProximo(novoNo);
        }
        fim = novoNo;
    }

    private Integer removerElemento() {
        if (vazia()) {
            System.out.println("fila vazia");
            return null;
        }
        int elemento = inicio.getElemento();
        inicio = inicio.getProximo();

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
            System.out.print("[ " + atual.getElemento() + " ]");
            if (atual.getProximo() != null) {
                System.out.print(" → ");
            }
            atual = atual.getProximo();
        }
        System.out.println();
    }
}
