public class Circulo extends FormaGeometrica {
    private double raio;
    private double area;

    public void  setRaio(double raio){
        this.raio = raio;
    }
    @Override
    public double calcularArea(){
        this.area = 3.14*(this.raio*this.raio);
        return this.area;
    }
}
