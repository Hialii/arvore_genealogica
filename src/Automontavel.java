public interface Automontavel<T> {
   void inserirFamiliar(T dados);
   T extrairFamiliar();
   T obterFamiliar();
   void removerFamiliar();


   String imprimir();
   boolean estazazia();
   boolean estaCheia();

}