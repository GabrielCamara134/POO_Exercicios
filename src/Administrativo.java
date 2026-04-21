public class Administrativo extends Colaborador{

    public double calcularSalario(){
        return this.salarioBase + (this.salarioBase/10);
    }
}
