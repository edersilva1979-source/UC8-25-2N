package modelo;


public class Produto {

    private int id;
    private String descricao;
    private double valor;
    private int quantidade;

    public Produto() {
    }

    public Produto(int id, String descricao, double valor, int quantidade) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    @Override
    public String toString() {
        return "Produto{" +
               "id=" + id +
               ", descricao='" + descricao + '\'' +
               ", valor=" + valor +
               '}';
    }

}