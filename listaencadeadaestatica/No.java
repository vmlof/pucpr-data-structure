package listaencadeadaestatica;

public class No {
    private int elemento;
    private int proximo;

    public No(int elemento) {
        this.elemento = elemento;
        proximo = -1;
    }
    public int getElemento() {
        return elemento;
    }
    public void setElemento(int elemento) {
        this.elemento = elemento;
    }
    public int getProximo() {
        return proximo;
    }
    public void setProximo(int proximo) {
        this.proximo = proximo;
    }
}
