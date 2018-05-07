/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacao;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Alunoinf_2
 */
public class SerializacaoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ContaBancaria conta01 = new ContaBancaria(9000, 1);
        
        try
      {
          
         FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Alunoinf_2\\Desktop\\ObjetoSerializado\\objeto_serializado.txt");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(conta01);
         out.close();
         fileOut.close();
         System.out.printf("Os dados serializados da conta bancária estão salvos em: C:\\Users\\Alunoinf_2\\Desktop\\ObjetoSerializado\\objeto_serializado.txt");
         
      }catch(Exception e)
      {
          e.printStackTrace();
      }
        
    }
    
}
