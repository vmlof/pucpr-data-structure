package pilhaencadeada;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        System.out.println("Inserindo elementos na pilha:");
        pilha.insere(10);
        pilha.insere(20);
        pilha.insere(30);
        pilha.imprime();

        System.out.println("\nRemovendo um elemento:");
        Integer removido = pilha.remove();
        System.out.println("Elemento removido: " + removido);
        pilha.imprime();

        System.out.println("\nInserindo mais elementos:");
        pilha.insere(40);
        pilha.insere(50);
        pilha.imprime();

        System.out.println("\nRemovendo todos os elementos:");
        while (pilha.remove() != null) {
            pilha.imprime();
            System.out.println("---");
        }

        pilha.remove();
        pilha.imprime();
    }
}
