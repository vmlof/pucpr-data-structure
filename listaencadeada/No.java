package listaencadeada;

public class No {

    private int elemento;
    private No proximo;

    public No(int elemento) {
        this.setElemento(elemento);
        this.setProximo(null);
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getProximo() {
        return proximo;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

}