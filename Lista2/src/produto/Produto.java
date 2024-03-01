package produto;
public class Produto {
    private int codigo;
    private int quantidade;

    public Produto(int codigo, int quantidade) {
        setCodigo(codigo);
        setQuantidade(quantidade);
    }

    public Produto() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo >  0) {
            this.codigo = codigo;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade >= 0) {
            this.quantidade = quantidade;
        }
    }
}
