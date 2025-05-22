package filaencadeada;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();

        System.out.println("Inserindo elementos na fila:");
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        fila.imprimir();

        System.out.println("\nRemovendo um elemento:");
        fila.remover();
        fila.imprimir();

        System.out.println("\nInserindo mais elementos:");
        fila.inserir(40);
        fila.inserir(50);
        fila.imprimir();

        System.out.println("\nRemovendo todos os elementos:");
        fila.remover();
        fila.remover();
        fila.remover();
        fila.remover();
        fila.remover();
        fila.imprimir();
    }
}
