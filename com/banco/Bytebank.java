package com.banco;

public class Bytebank {
    double saldo;
    int agencia;
    int numero;
    String titular;


    public void deposita(double valor) {
        saldo += valor;
    }
    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Bytebank contaDoPaulo = new Bytebank();
        contaDoPaulo.titular = "Paulo Silveira";
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.saldo);
        System.out.println(contaDoPaulo.titular);
    }

}
