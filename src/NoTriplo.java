public class NoTriplo<T> {
    private NoTriplo<T> proximo;
    private NoTriplo<T> anterior;
    private NoTriplo<T> raiz;
    private T dado;

    public NoTriplo<T> getRaiz() {
        return raiz;
    }

    public void setRaiz() {
        this.raiz = raiz;
    }

    public T getDado() {
        return dado;
    }

    public void setDado() {
        this.dado = dado;
    }

    public NoTriplo<T> getAnterior() {
        return anterior;
    }

    public void setAnterior() {
        this.anterior = anterior;
    }

    public NoTriplo<T> getProximo() {
        return proximo;
    }

    public void setProximo() {
        this.proximo = proximo;
    }
}
