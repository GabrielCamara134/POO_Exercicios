public class Aluno {
    private String nome, matricula;
    private double nota1 = 0, nota2 = 0, media = 0;
    private String estado;

    public String getNome() {
        return nome;
    }

    public Aluno(String nome, String matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
     public double calcularMedia() {
         this.media = (this.nota1 + this.nota2)/2;
         return this.media;
     }
     public String verificarAprovacao() {
         if(this.media >= 7){
             return this.estado = "Aprovado";
         }else{
             return this.estado = "Reprovado";
         }
     }
}
