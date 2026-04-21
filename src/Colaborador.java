public class Colaborador {
    protected String nome;
    protected double salarioBase;

    public double calcularSalario(){
        return this.salarioBase;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
