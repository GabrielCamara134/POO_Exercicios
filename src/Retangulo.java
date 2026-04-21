public class Retangulo extends FormaGeometrica {
    private double largura, altura;
    private double area;

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double calcularArea(){
        this.area = largura * altura;
        return area;
    }

}
