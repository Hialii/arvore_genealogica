import java.util.List;

public interface Amontoavel<T> {
   void inserirFamiliar(T pessoa);

   void removerFamiliar(T pessoa);

   List<T> visualizarArvore();

   T buscarFamiliar(String pessoa);

   T detalharFamiliar(T pessoa);

   T verificarFamiliar(T pessoa);

   String imprimir();

   boolean estaVazia();

   boolean estaCheia();
}
