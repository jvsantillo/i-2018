/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Alunoinf_2
 */
public class IntegracaoApps {

    /**
     * @param args the command line arguments
     */
    
  
    
    public static void main(String[] args) throws IOException {
        
        FileInputStream fis = new FileInputStream("C:\\Users\\Alunoinf_2\\Desktop\\Integracao\\Ponto2D.class");
        DataInputStream dis = new DataInputStream(fis);
        
        int valor = dis.readInt();
        dis.close();
        String hexadecimal = Integer.toHexString(valor);

 
        System.out.println("O valor em hexadecimal é: " + hexadecimal);

        
        
    }
    
}
