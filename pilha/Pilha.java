package pilha;

public class Pilha {
    private int capacidade;
    private int topo;
    private int[] dados;

    public Pilha(int capacidade) {
        topo = -1;
        this.capacidade = capacidade;
        dados = new int[capacidade];
    }

    public void insere(int elemento) {
        if(cheia()) {
            System.out.println("Erro: pilha cheia");
        }
        else {
            topo += 1;
            dados[topo] = elemento;
        }
    }

    public boolean cheia() {
        return topo == capacidade - 1;
    }

    public boolean vazia() {
        return topo == -1;
    }

    public int remove() {
        if(vazia()) {
            System.out.println("Erro: pilha vazia");
            return -1;
        }
        else {
            int elemento = dados[topo];
            topo -= 1;
            return elemento;
        }
    }

    public int topo() {
        if(vazia()) {
            System.out.println("Erro: pilha vazia");
            return -1;
        }
        else {
            return dados[topo];
        }
    }

    public void imprime() {
        for(int i = 0; i <= topo; i++) {
            System.out.print(dados[i] + " ");
        }
        System.out.println();
    }
}
