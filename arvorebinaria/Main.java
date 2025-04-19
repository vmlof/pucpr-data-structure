package arvorebinaria;

public class Main {

    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(8);
        arvore.inserir(7);
        arvore.inserir(12);
        arvore.inserir(15);
        arvore.inserir(2);
        arvore.inserir(5);

        //arvore.inOrdem();
        arvore.preOrdem();
    }
}
