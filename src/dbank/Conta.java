package dbank;

import java.util.Scanner;

public class Conta {
    public int numConta;
    private String nome;
    protected String tipo;
    private double saldo;
    private boolean status;
    private double deposito;
    private double saque;
    Scanner a = new Scanner(System.in);
    public Conta(int numConta, String nome, String tipo) {
        this.setNome(nome);
        this.setTipo(tipo);
        this.setNumConta(numConta);
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    // métodos da aplicação 
    
    public void abrirConta(){
        this.setStatus(true);
        if (tipo == "CC"){
            this.setSaldo(50);
        }else if (tipo == "CP"){
            this.setSaldo(150);
        }
    }
    public void fecharConta(){
        if (saldo == 0){
            this.setStatus(false);
            System.out.println("Conta Fechada. \nSentiremos sua falta.");
        }else if (saldo < 0){
            System.out.println("Conta em débito.");
        } else {
            System.out.println("Conta com dinheiro");
        }
    }
    public void depositar(double deposito){
        if (isStatus()){
            this.setSaldo(saldo + deposito);
        }else{System.out.println("Impossível depositar");}
    }
    public void sacar(double saque){
        if (isStatus()){
            if (saldo>=saque){
                this.setSaldo(getSaldo()-saque);
            }else{System.out.println("Saldo infuficiente");}
        }else{System.out.println("Imposspivel sacar de uma conta fechada");}
    }
    public void pagarMensal(String tipo){
        if(isStatus()){
            if("CC".equals(tipo)){
                this.saldo -= 12;
        }else{this.saldo -= 20;}
        }else{System.out.println("Impossível cobrar");}
    }
    public void estadoConta(){
        System.out.println("------------------------------------");
        System.out.println("Nº Conta: " + this.getNumConta());
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Saldo atual: R$" + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
}
