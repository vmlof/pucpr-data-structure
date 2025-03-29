package fila;

public class Main {

    public static void main(String[] args) {

        Fila fila = new Fila(6);

        for(int i = 1; i <= 5; i++) {
            fila.inserirElemento(i);
        }

        fila.imprimirFila();

        fila.inserirElemento(6);

        System.out.println("removendo elemento: "+fila.removerElemento());

        fila.imprimirFila();

        System.out.println("inserindo novo elemento...");

        fila.inserirElemento(6);

        fila.imprimirFila();

        fila.inserirElemento(7);

        System.out.println("removendo elemento: "+fila.removerElemento());

        fila.imprimirFila();

        System.out.println("inserindo novo elemento...");

        fila.inserirElemento(7);

        fila.imprimirFila();

    }
}
