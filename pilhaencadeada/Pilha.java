package pilhaencadeada;

public class Pilha {
   private class No {
       int valor;
       No proximo;
       No(int valor) {
           this.valor = valor;
       }
   }

   private No topo;

   private boolean vazia() {
       return topo == null;
   }

   public Pilha() {
       topo = null;
   }

   public void empilhar(int valor) {
       No novoNo = new No(valor);
       novoNo.proximo = topo;
       topo = novoNo;
   }

   public void desempilhar() {
       if(vazia()) {
           System.out.println("erro, pilha vazia. ");
           return;
       }
       topo = topo.proximo;
   }

   public void exibir() {
       if(vazia()) {
           System.out.println("erro, pilha vazia. ");
           return;
       }
       No atual = topo;
       while(atual != null) {
           System.out.println(atual.valor);
           atual = atual.proximo;
       }
   }

}
