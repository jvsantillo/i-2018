/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inf.ufg.es.integracaoapps.lista1.exercicio2;

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
public class Exercicio2 {
        public static void main(String[] args) throws IOException {
        
        Path path = Paths.get("C:\\Users\\Alunoinf_2\\Desktop\\Integracao\\jpeg2000-home.jpg");
        byte[] data = Files.readAllBytes(path);

        StringBuilder primeiroByte = new StringBuilder();
        StringBuilder ultimoByte = new StringBuilder();
        
        primeiroByte.append(data[0]);
        

        
        int tamanho = data.length;
        ultimoByte.append(data[tamanho - 1]);
     
        
        String primeiro_byte_string = primeiroByte.toString();
        String ultimo_byte_string = ultimoByte.toString();
        
        
        int primeiro = Integer.parseInt(primeiro_byte_string);
        int ultimo = Integer.parseInt(ultimo_byte_string);
        
        String primeiro_hexadecimal = Integer.toHexString(primeiro);
        String ultimo_hexadecimal = Integer.toHexString(ultimo);
        
        System.out.println(primeiro_hexadecimal);
        System.out.println(ultimo_hexadecimal);
        
    }
    
}

