public class ArvoreGenealogica<T> implements Amontoavel {
    private NoTriplo ponteiroRaiz;
    private NoTriplo ponteiroFim;
    private int quantidade.
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

    public void inserirFamiliar(Object dado) {
        if(!estaCheia()) {
            NoTriplo<T> novoDado = new NoTriplo<>();
            novoDado.setDado(dado);

            if(!estaVazia()) {
                NoTriplo<T> noInserido = inserirRecursivo(ponteiroRaiz, novoDado);
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

    public NoTriplo<T> inserirRecursivo(NoTriplo<T> noAtual, NoTriplo<T> novoNo) {
        if(noAtual.setAnterior() == null) {
            noAtual.setAnterior(novoNo);
            novoNo.setRaiz(noAtual);
            return novoNo;
        } else if(noAtual.setProximo() == null){
            noAtual.setProximo(novoNo);
            novoNo.setRaiz(noAtual);
            return novoNo;
        } else {
            if(Math.Radom() < 0.5) {
                return inserirRecursivo(noAtual.getAnterior(), novoNo);
            } else {
                return inserirRecursivo(noAtual.getProximo(), novoNo);
            }
        }
    }

    public String imprimir() {
        String resultado = "";
        resultado += inserirRecursivo(ponteiroRaiz);
        return resultado;
    }

}   
