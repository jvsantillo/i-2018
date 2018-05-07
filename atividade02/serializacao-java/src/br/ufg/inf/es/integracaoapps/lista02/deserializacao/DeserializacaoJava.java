/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.es.integracaoapps.lista02.deserializacao;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import br.ufg.inf.es.integracaoapps.lista02.serializacao.ContaBancaria;

/**
 *
 * @author Alunoinf_2
 */
public class DeserializacaoJava {
    public static void main(String[] args) {
        ContaBancaria conta02 = null;
        
        try{
           FileInputStream fileIn = new FileInputStream("C:\\Users\\Alunoinf_2\\Desktop\\ObjetoSerializado\\objeto_serializado.txt");
           ObjectInputStream in = new ObjectInputStream(fileIn);
           conta02 = (ContaBancaria) in.readObject();
           in.close();
           fileIn.close();
        } 
        catch(Exception e){
             e.printStackTrace();
        }
        
        System.out.println("Conta bancária extraída: ");
        System.out.println(conta02.getSaldo());
        System.out.println(conta02.getTipo());
        
    }
}
