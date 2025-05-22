package arvorebinariaestatica;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria(15);

        int[] valores = {8, 4, 12, 2, 6, 10, 14, 1, 3, 5, 7, 9, 11, 13, 15};
        int qtd = 15;

        for(int i = 0; i < qtd; i++) {
            arvore.inserir(valores[i]);
        }

        arvore.imprimir();
        System.out.println("Removendo 8...");

        arvore.remover(8);
        arvore.imprimir();
    }
}
