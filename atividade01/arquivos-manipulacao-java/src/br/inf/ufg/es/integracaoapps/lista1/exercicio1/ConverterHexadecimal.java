/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inf.ufg.es.integracaoapps.lista1.exercicio1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class ConverterHexadecimal {
        /**
     * Lê um arquivo a partir de um diretório informado na linha de comando 
     * e o exibe os 4 primeiros bytes (int) em hexadecimal.    
     * @param diretorio argumentos da linha de comando
     * @return String que contém o hexadecimal correspondente aos primeiros 
     * 4 bytes do arquivo
     * @throws IOException Lança exceção quando o arquivo informado 
     * no diretório não existe
     */
    public String convertaArquivoParaHexadecimal(String diretorio) throws IOException{
         Scanner leitor = new Scanner(System.in);
         System.out.println("Digite o diretório no qual o arquivo .class se encontra:");
        
         diretorio = leitor.nextLine();
        
         FileInputStream fis = new FileInputStream(diretorio);
         DataInputStream dis = new DataInputStream(fis);
        
         int valor = dis.readInt();
         dis.close();
       
        return Integer.toHexString(valor);
    }     
       

 
        
}
