/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inf.ufg.es.integracaoapps.lista1.exercicio5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 *
 * @author jv_sa
 */
public class NewClass {
    public static void main(String[] args) throws IOException {

        File arquivo_converter = new File("C:\\Users\\jv_sa\\Documents\\NetBeansProjects\\"
                + "IntegracaoApps\\src\\exercicio5\\arquivo.txt");
        
        File arquivo_convertido = new File("C:\\Users\\jv_sa\\Documents\\NetBeansProjects\\"
                + "IntegracaoApps\\src\\exercicio5\\binarios.txt");
        
        
        
         try {
             FileInputStream fileInputStream = new FileInputStream(arquivo_converter);
             DataInputStream dis = new DataInputStream(fileInputStream);
             PrintWriter pw = new PrintWriter(arquivo_convertido);
             
             String text_lido = dis.readUTF();
             byte b[] = text_lido.getBytes("UTF-8");

            for(int i = 0; i < b.length; i++){
                pw.print(b[i]);
            }


          } catch (FileNotFoundException e) {
                      System.out.println("Arquivo não encontrado");
                      e.printStackTrace();
          }
          catch (IOException e1) {
                   System.out.println("Erro ao ler o arquivo");
                    e1.printStackTrace();
          }
        

    }
}
