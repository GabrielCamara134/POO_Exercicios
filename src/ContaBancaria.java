public class ContaBancaria {
    private String titular;
    private double saldo, numeroConta;

    public ContaBancaria(String titular, double numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public ContaBancaria(String titular, double numeroConta, double saldo){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor){
        if(valor >= 0) {
            this.saldo += valor;
        }else{
            System.out.println("Valor Negativo!!");
        }
    }

    public void sacar(double valor){
        if(valor>=0 && valor<=this.saldo){
            this.saldo -= valor;
        }else{
            System.out.println("Valor Estranho");
        }
    }

}
