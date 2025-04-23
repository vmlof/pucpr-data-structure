package listaEncadeadaCircular;

public class ListaEncadeadaCircular {
    private No inicio = null;

    private boolean vazia() {
        return inicio == null;
    }

    public void inserir(int elemento) {
        No novoNo = new No(elemento);

        if(inicio == null) {
            inicio = novoNo;
            novoNo.setProximo(inicio);
        }
        else {
            No atual = inicio;
            while(atual.getProximo() != inicio) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
            novoNo.setProximo(inicio);
        }
    }

    public void remover(int elemento) {
        if (vazia()) {
            System.out.println("Erro: lista vazia");
            return;
        }
        No atual = inicio;
        No anterior = null;

        if (inicio.getElemento() == elemento) {

            if (inicio.getProximo() == inicio) {
                inicio = null;
            } else {
                No ultimo = inicio;
                while (ultimo.getProximo() != inicio) {
                    ultimo = ultimo.getProximo();
                }
                inicio = inicio.getProximo();
                ultimo.setProximo(inicio);
            }
            return;
        }

        anterior = inicio;
        atual = inicio.getProximo();
        while (atual != inicio) {
            if (atual.getElemento() == elemento) {
                anterior.setProximo(atual.getProximo());
                return;
            }
            anterior = atual;
            atual = atual.getProximo();
        }

        System.out.println("Elemento " + elemento + " não encontrado.");
    }

    public void imprimir() {
        if(vazia()) {
            System.out.println("Erro: lista vazia");
            return;
        }
        No atual = inicio;
        while(atual.getProximo() != inicio) {
            System.out.print(atual.getElemento() + " ");
            atual = atual.getProximo();
        }
        System.out.print(atual.getElemento() + " ");
    }

}