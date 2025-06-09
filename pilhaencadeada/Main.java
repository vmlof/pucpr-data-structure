package pilhaencadeada;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        System.out.println("Inserindo elementos na pilha:");
        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);
        pilha.exibir();

        System.out.println("\nRemovendo um elemento:");
        pilha.desempilhar();
        pilha.exibir();

        System.out.println("\nInserindo mais elementos:");
        pilha.empilhar(40);
        pilha.empilhar(50);
        pilha.exibir();
    }
}
