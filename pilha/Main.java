package pilha;

public class Main {

    public static void main(String[] args) {

        Pilha pilha = new Pilha(5);
        System.out.println("\n--- inserindo elementos ---");

        for(int i = 1; i <= 5; i++) {
            if(!pilha.cheia()) {
                pilha.insere(i);
                pilha.imprime();
            }
        }

        System.out.println("inserindo novo elemento...");
        pilha.insere(6);

        System.out.println("removendo elemento do topo: " + pilha.topo());
        pilha.remove();

        System.out.println("inserindo novo elemento...");
        pilha.insere(6);

        pilha.imprime();

        System.out.println("\n--- removendo elementos ---");
        pilha.imprime();

        for(int i = 1; i <= 5; i++) {
            if(!pilha.vazia()) {
                pilha.remove();
            }
            pilha.imprime();
        }
        System.out.println("removendo novo elemento...");
        pilha.remove();


    }
}
