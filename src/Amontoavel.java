public interface Amontoavel<T> {
   void inserirFamiliar(T dados);
   T vizualizarArvore();
   T buscarFamiliar();
   T detalharFamiliar();
   void removerFamiliar();

  
   String imprimir();
    String verificar();
   boolean estazazia();
   boolean estaCheia();

}