public interface Amontoavel<T> {
   void inserirFamiliar(T dados);
   void removerFamiliar();
   T visualizarArvore();
   T buscarFamiliar();
   T detalharFamiliar();
   T verificarFamiliar();

   String imprimir();
   boolean estaVazia();
   boolean estaCheia();
}