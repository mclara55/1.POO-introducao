package model;
public class Produto{
//atributos
    private String nome ;
    private double valor;
    private int estoque;
//metodos construtores
    public Produto() {
// construtor padrão-vazio
    }

    public Produto(String nome, double valor, int estoque) {
// construtor parametrizado
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }
//métodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
//regra de negócio (não pode haver estoque negativo)
        int novoEstoque = this.estoque + estoque;
        if (novoEstoque > 0)
            this.estoque = estoque;
    }
//método utilitário (converte Objeto em String) [imprime muitos objetos de uma vez]
    @Override
    public String toString() {
        return "Produto{" + "nome='" + nome + '\'' + ", valor=" + valor + ", estoque=" + estoque + '}';
    }
}
