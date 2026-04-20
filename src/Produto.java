public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco){
        if(preco>=0){
            this.preco = preco;
        }else{
            System.out.println("O valor nao pode ser negativo!!");
        }

    }
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque){
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void AdicionarEstoque(int qtd){
        this.quantidadeEmEstoque += qtd;
    }
    public void removerEstoque(int qtd){
        this.quantidadeEmEstoque -= qtd;

        if(this.quantidadeEmEstoque <= 0){
            this.quantidadeEmEstoque = 0;
        }
    }


}
