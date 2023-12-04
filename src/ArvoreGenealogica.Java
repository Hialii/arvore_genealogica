public class ArvoreGenealogica<T> implements Amontoavel<T> {
    private NoTriplo<T> ponteiroRaiz;
    private NoTriplo<T> ponteiroFim;
    private int quantidade;
    private int tamanho;

    public ArvoreGenealogica(int tamanho) {
        ponteiroRaiz = null;
        ponteiroFim = null;
        quantidade = 0;
        this.tamanho = tamanho;
    }

    public ArvoreGenealogica() {
        this(10);
    }

    public void insert(T dado) {
        if (!isFull()) {
            NoTriplo<T> novoDado = new NoTriplo<>();
            novoDado.setDado(dado);

            if (!isEmpty()) {
                NoTriplo<T> noInserido = insertRecursive(ponteiroRaiz, novoDado);
                // ajustarAcima(noInserido);
            } else {
                ponteiroRaiz = novoDado;
            }
            ponteiroFim = novoDado;
            quantidade++;
        } else {
            System.out.println("Não foi possivel inserir!");
        }
    }

    public NoTriplo<T> insertRecursive(NoTriplo<T> noAtual, NoTriplo<T> novoNo) {
        if (noAtual.getAnterior() == null) {
            noAtual.setAnterior(novoNo);
            novoNo.setRaiz(noAtual);
            return novoNo;
        } else if (noAtual.getProximo() == null) {
            noAtual.setProximo(novoNo);
            novoNo.setRaiz(noAtual);
            return novoNo;
        } else {
            if (Math.random() < 0.5) {
                return insertRecursive(noAtual.getAnterior(), novoNo);
            } else {
                return insertRecursive(noAtual.getProximo(), novoNo);
            }
        }
    }

    @Override
    public boolean isFull() {
        return (quantidade == tamanho);
    }

    @Override
    public boolean isEmpty() {
        return (quantidade == 0);
    }

    public String print() {
        StringBuilder resultado = new StringBuilder();
        printRecursive(ponteiroRaiz, resultado);
        return resultado.toString();
    }

    private void printRecursive(NoTriplo<T> noAtual, StringBuilder resultado) {
        if (noAtual != null) {
            resultado.append(noAtual.getDado()).append(" ");
            printRecursive(noAtual.getAnterior(), resultado);
            printRecursive(noAtual.getProximo(), resultado);
        }
    }
}
