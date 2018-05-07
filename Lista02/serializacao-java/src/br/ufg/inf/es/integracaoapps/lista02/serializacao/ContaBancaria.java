/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.es.integracaoapps.lista02.serializacao;

import java.io.Serializable;

/**
 *
 * @author Alunoinf_2
 */
public class ContaBancaria implements Serializable{
    
    public double saldo;
    private int tipo;
    
    public ContaBancaria(float saldo, int tipo){
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public void deposito(double valor){
        setSaldo(this.saldo + valor);
    }
    
    public double retornaSaldo(){
        return this.saldo;
    }
    
    public void saque(double valor){
        setSaldo(this.saldo - valor);
    }
    
}
