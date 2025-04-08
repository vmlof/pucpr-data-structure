package listaDupla;

public class Main {

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        for(int i = 1; i <= 5; i++) {
            lista.inserirFim(i);
        }
        //                                    cabeça <- [1] 2 3 4 [5] -> cauda

        lista.remover(1);
        lista.remover(2);
        lista.remover(3);
        // lista.remover(4);
        // lista.remover();

        lista.exibirDoInicio();

    }
}
