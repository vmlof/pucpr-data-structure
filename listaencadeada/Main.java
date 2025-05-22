package listaencadeada;

public class Main {

    public static void main(String[] args) {

        ListaEncadeada lista = new ListaEncadeada();

        lista.insereElemento(10);
        lista.insereElemento(20);
        lista.insereElemento(30);
        lista.insereElemento(40);

        lista.exibeLista();


        lista.removeElemento(20);
        lista.exibeLista();

        lista.removeElemento(10);
        lista.exibeLista();

        lista.removeElemento(50);

    }

}
