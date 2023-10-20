package negocio;

public class ContaBancaria {
    private String nomeCorrentista;
    private double saldo;

    public ContaBancaria(String nomeCorrentista, double saldo) {
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
