package gestioncuentas;

/**
 * Clase que representa una cuenta bancaria genérica.
 * @author Yus
 * @version 1.0
 */
public class Cuenta {

    public Cuenta(String titular) {
        this.titular = titular;
    }

    private String titular;
    private double saldo;

    public Cuenta() {
        setSaldo(0);
    }

    /**
     * Metodo que imprime el nombre del titular con su saldo actual
     */
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

    /**
     *
     * @param cantidad
     * @return devuelve el saldo base, mas la suma del ingreso realizado.
     */
    public void ingresar(double cantidad) {
        this.setSaldo(this.getSaldo() + cantidad);
    }

    /**
     *
     * @param cantidad
     * @return devuelve el saldo base, restando la cantidad retirada
     */
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
