package listaencadeadaestatica;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada(5);

        for(int i = 1; i <= 5; i++) {
            lista.inserir(i);
        }

        lista.imprimir();
        System.out.println();

        lista.remover(2);
        lista.remover(3);
        lista.remover(4);
        lista.inserir(6);
        lista.inserir(7);
        lista.inserir(8);
        lista.remover(5);

        lista.imprimir();

    }
}
