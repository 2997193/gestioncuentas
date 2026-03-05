package gestioncuentas;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(String titular, double comision) {
        super(titular);
        this.comision = comision;
    }

    private double comision;
    
    public CuentaCorriente() {
        setComision(2.0);
    }

    public void aplicarComision() {
        setSaldo(getSaldo() - getComision());
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}