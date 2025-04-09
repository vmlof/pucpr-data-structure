package listaDupla;

public class Main {

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        for(int i = 1; i <= 5; i++) {
            lista.inserirFim(i);
        }

        lista.exibirDoInicio();

        lista.remover(1);
        lista.remover(2);
        lista.remover(3);
        lista.remover(4);
        lista.remover(5);


        System.out.println();
        lista.exibirDoInicio();
    }
}
