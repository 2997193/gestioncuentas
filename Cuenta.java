package gestioncuentas;

public class Cuenta {

    public Cuenta(String titular) {
        this.titular = titular;
    }

    private String titular;
    private double saldo;

    public Cuenta() {
        setSaldo(0);
    }

    public void mostrarDatos() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
    }

    public boolean retirarConControl(double cantidad) {
        if (cantidad <= getSaldo()) {
            setSaldo(getSaldo() - cantidad);
            return true;
        } else {
            return false;
        }
    }
    public void ingresar(double cantidad) {
        this.setSaldo(this.getSaldo() + cantidad);
    }

    public void retirar(double cantidad) {
        this.setSaldo(this.getSaldo() - cantidad);
    }

    public double calcularSaldoFinal() {
        return this.getSaldo();
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
}
