public class Livro {
    private String titulo = "The Black bird", autor = "Gabriel Camara";
    private int numeroPaginas = 300, paginaAtual = 0;

    public void avancarPaginas(){
        this.paginaAtual += 1;
    }
    public void retrocederPaginas(){
        this.paginaAtual -= 1;

        if(this.paginaAtual < 0){
            this.paginaAtual = 0;
        }
    }
    public int ExibirStatus(){
        return paginaAtual;

    }

}
