package org.example;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();

        cuenta.depositar(500);
        cuenta.retirar(200);
        cuenta.retirar(2000);

        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}
