public class Carro {
    private String marca, modelo;
    private int ano;
    private double velocidadeAtual;

    public Carro(String marca, String modelo, int ano, double velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca (String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo (String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno (int ano) {
        this.ano = ano;
    }
    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    public void acelerar(double incremento){
        this.velocidadeAtual += incremento;
    }
    public void frear(double decremento){
        this.velocidadeAtual -= decremento;

        if(velocidadeAtual<0){
            this.velocidadeAtual = 0;
        }
    }
}
