package filacircular;

public class Fila {
    private int inicio;
    private int fim;
    private int[] fila;
    private int MAX;

    public Fila (int max) {
        this.MAX = max;
        inicio = 0;
        fim = 0;
        fila = new int[MAX];
    }

    public boolean vazia() {
        return inicio == fim;
    }

    public boolean cheia() {
        return ((fim + 1) % MAX == inicio);
    }

    public void inserirElemento(int elemento) {
        if(cheia()) {
            System.out.println("Erro: Fila cheia");
            return;
        }
        fila[fim] = elemento;
        fim = (fim + 1) % MAX;
    }

    public int removerElemento() {
        if(vazia()) {
            System.out.println("Erro: Fila vazia");
            return -1;
        }
        int elemento = fila[inicio];
        inicio = (inicio + 1) % MAX;
        return elemento;
    }

    public void imprimirFila() {

        if(vazia()) {
            System.out.println("Erro: Fila vazia");
            return;
        }

        int i = inicio;

        while( i != fim ) {
            System.out.print(fila[i] + " ");
            i = (i + 1) % MAX;
        }
        System.out.println();

    }

}
