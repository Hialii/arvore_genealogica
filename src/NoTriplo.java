public class NoTriplo<T> {
    private NoTriplo<T> proximo;
    private NoTriplo<T> anterior;
    private NoTriplo<T> raiz;
    private T dado;

    public NoTriplo<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NoTriplo<T> raiz) {
        this.raiz = raiz;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public NoTriplo<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NoTriplo<T> anterior) {
        this.anterior = anterior;
    }

    public NoTriplo<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoTriplo<T> proximo) {
        this.proximo = proximo;
    }
}
