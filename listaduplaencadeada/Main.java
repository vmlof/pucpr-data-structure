package listaduplaencadeada;

public class Main {

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.inserirFinal(1);
        lista.inserirFinal(2);
        lista.inserirFinal(3);
        lista.exibirInicio();

        System.out.println();
        lista.remover(2);
        lista.exibirInicio();

        System.out.println();
        lista.remover(1);
        lista.exibirFim();

        System.out.println();
        lista.remover(3);
        lista.exibirInicio();
    }
}
