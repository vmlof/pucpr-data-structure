package listaEncadeadaCircular;

public class Main {

    public static void main(String[] args) {
        ListaEncadeadaCircular lista = new ListaEncadeadaCircular();

        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(40);
        lista.inserir(50);
        lista.imprimir();

        lista.remover(10);
        System.out.println();
        lista.imprimir();

        lista.remover(50);
        System.out.println();
        lista.imprimir();

        lista.remover(30);
        System.out.println();
        lista.imprimir();

        lista.remover(40);
        System.out.println();
        lista.imprimir();

        lista.remover(20);
        System.out.println();
        lista.imprimir();


    }

}
