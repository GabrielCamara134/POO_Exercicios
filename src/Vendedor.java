public class Vendedor extends Colaborador{
    private double comissao;
    private double aux;

    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    @Override
    public double calcularSalario(){
        return (this.salarioBase + this.comissao);
    }

}
