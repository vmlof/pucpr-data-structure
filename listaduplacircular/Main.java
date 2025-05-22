package listaduplacircular;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        System.out.println("Inserindo elementos no início:");
        lista.inserirInicio(10);
        lista.inserirInicio(20);
        lista.inserirInicio(30);
        lista.exibirDoInicio();
        lista.exibirDoFim();

        System.out.println("\nInserindo elementos no fim:");
        lista.inserirFim(40);
        lista.inserirFim(50);
        lista.exibirDoInicio();
        lista.exibirDoFim();

        System.out.println("\nRemovendo do início:");
        lista.remover(30);
        lista.exibirDoInicio();

        System.out.println("\nRemovendo do fim:");
        lista.remover(50);
        lista.exibirDoInicio();

        System.out.println("\nRemovendo do meio:");
        lista.remover(10);
        lista.exibirDoInicio();

        System.out.println("\nRemovendo todos os elementos:");
        lista.remover(20);
        lista.remover(40);
        lista.exibirDoInicio();
    }
}
