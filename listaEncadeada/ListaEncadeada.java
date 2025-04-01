package listaEncadeada;

public class ListaEncadeada {

    private No inicio = null;

    public void insereElemento(int elemento) {

        No novoNo = new No(elemento);
        if(inicio == null) {
            inicio = novoNo;
        }
        else {
            No atual = inicio;
            while(atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
        }
    }

    public void removeElemento(int valor) {

        if(inicio == null) {
            System.out.println("Erro: lista vazia");
            return;
        }

        if(inicio.getElemento() == valor) {
            inicio = inicio.getProximo();
            return;
        }

        No atual = inicio;
        while(atual.getProximo() != null) {
            if(atual.getProximo().getElemento() == valor) {
                atual.setProximo(atual.getProximo().getProximo());
                return;
            }
            atual = atual.getProximo();
        }
        System.out.println("Erro: Elemento não encontrado");

    }

    public void exibeLista () {
        No atual = inicio;
        System.out.println("Lista: ");
        while(atual != null) {
            System.out.println(atual.getElemento() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }

}
