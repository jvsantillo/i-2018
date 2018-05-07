/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inf.ufg.es.integracaoapps.lista1.exercicio6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author jv_sa
 */
public class Exercicio6 {
        public static void main(String[] args) throws IOException {

        File arquivo_convertido = new File(args[0]);
        
        File arquivo_converter = new File(args[1]);
        
        
       byte[] b = new byte[(int) arquivo_converter.length()];
        
         try {
             FileInputStream fileInputStream = new FileInputStream(arquivo_converter);
             PrintWriter pw = new PrintWriter(arquivo_convertido);
             fileInputStream.read(b);

            String texto = new String(b, "UTF-8");
            pw.write(texto);
  
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
