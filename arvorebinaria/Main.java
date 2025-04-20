package arvorebinaria;

public class Main {

    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(14);
        arvore.inserir(4);
        arvore.inserir(9);
        arvore.inserir(3);

        arvore.inOrdem();
        System.out.println();

        arvore.menorElemento();
        arvore.maiorElemento();

    }
}
