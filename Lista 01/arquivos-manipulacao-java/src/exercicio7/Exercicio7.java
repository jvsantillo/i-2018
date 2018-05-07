/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jv_sa
 */
public class Exercicio7 {
        public static void main(String[] args) {
	    try {
	    	FileInputStream arquivo = new FileInputStream(args[0]);
	    	InputStreamReader isr = new InputStreamReader(arquivo, "UTF-8");
			BufferedReader br = new BufferedReader(isr);

			FileOutputStream arquivo_destino = new FileOutputStream(args[1] + ".txt");
			DataOutputStream Output_dados = new DataOutputStream(arquivo_destino);

			String linha;
			int lineIndex = 0;
			while ((linha = br.readLine()) != null) {

				byte[] linhaToByte = linha.getBytes("UTF-8");
				int byteAmount = linhaToByte.length;
				Output_dados.writeInt(lineIndex);
				lineIndex = lineIndex + 1;
				Output_dados.writeInt(byteAmount);
				Output_dados.write(linhaToByte, 0, byteAmount);

			}

	    	br.close();
			Output_dados.close();

	    } catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
	          e.getMessage());
	    }

}
}
