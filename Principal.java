package gestioncuentas;

public class Principal {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta("Ana López");
        cuenta.setSaldo(500);

        CuentaAhorro cuentaAhorro = new CuentaAhorro();
        cuentaAhorro.setTitular("Pedro Gómez");
        cuentaAhorro.setSaldo(1000);


        CuentaCorriente cc = new CuentaCorriente();
        cc.setTitular("Ana López");
        cc.setSaldo(800);

        // Operaciones hechas directamente sobre el saldo (mal diseño intencionado)

        cuenta.ingresar(200);
        cuenta.retirar(50);

        cuentaAhorro.ingresar(300);
        cuentaAhorro.aplicarInteres();

        cc.retirar(100);
        cc.aplicarComision();

        cuentaAhorro.setSaldo(cuentaAhorro.getSaldo() + 300);
        cuentaAhorro.aplicarInteres();

        cc.setSaldo(cc.getSaldo() - 100);
        cc.aplicarComision();

        System.out.println("---- Cuenta normal ----");
        cuenta.mostrarDatos();

        System.out.println("---- Cuenta ahorro ----");
        cuentaAhorro.mostrarDatos();

        System.out.println("---- Cuenta corriente ----");
        cc.mostrarDatos();
    }
}