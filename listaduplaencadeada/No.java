package listaduplaencadeada;

public class No {
    private int elemento;
    private No proximo;
    private No anterior;

    public No(int elemento) {
        this.elemento = elemento;
        proximo = null;
        anterior = null;
    }

    public int getElemento() {
        return elemento;
    }
    public void setElemento(int elemento) {
        this.elemento = elemento;
    }
    public No getProximo() {
        return proximo;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    public No getAnterior() {
        return anterior;
    }
    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
}
