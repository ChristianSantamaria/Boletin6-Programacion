/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6;

/**
 *
 * @author csantamariacameselle
 */
public class Conta {
    private String nome;
    private String nConta;
    private double saldo;
    
    
    
    public Conta(){
    }
    
    public Conta(String n, String c, double s){
        nome = n;
        nConta = c;
        saldo = s;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String x){
        nome = x;
    }    
    public String getNConta(){
        return nConta;
    } 
    public void setNConta(String x){
        nConta = x;
    }   
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double x){
        saldo = x;
    }
    
    
    public boolean Ingreso(double x){
        if (x > 0){
            saldo += x;
            return true;
        }
        else
            return false;
    }
    public boolean Reintegro(double x){
        double aux = saldo - x;
        if (aux > 0){
            saldo -= x;
            return true;
        }
        else
            return false;
    }
    
    public void Visualizar(){
        System.out.println(nome);
        System.out.println(nConta);
        System.out.println(saldo);
    }
    
    public void Transferencia(Conta nombre, double sald){
        if(sald <= saldo){
            saldo -= sald;
            nombre.saldo += sald;
        }
        
        
        
    }
    
}
