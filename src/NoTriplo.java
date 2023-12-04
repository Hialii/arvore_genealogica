public class NoTriplo<T> {
   private NoTriplo<T> raiz;
	private NoTriplo<T> esquerda;
	private NoTriplo<T> direita;
	private T dado;
   public NoTriplo<T> getraiz() {
      return raiz;
   }
   public void setraiz(NoTriplo<T> raiz) {
      this.raiz = raiz;
   }
   public NoTriplo<T> getEsquerda() {
      return esquerda;
   }
   public void setEsquerda(NoTriplo<T> esquerda) {
      this.esquerda = esquerda;
   }
   public NoTriplo<T> getDireita() {
      return direita;
   }
   public void setDireita(NoTriplo<T> direita) {
      this.direita = direita;
   }
   public T getDado() {
      return dado;
   }
   public void setDado(T dado) {
      this.dado = dado;
   }


}
