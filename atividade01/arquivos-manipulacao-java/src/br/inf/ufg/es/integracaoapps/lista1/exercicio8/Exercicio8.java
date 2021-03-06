/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inf.ufg.es.integracaoapps.lista1.exercicio8;
/**
 *
 * @author jv_sa
 */
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.io.IOException;

public class Exercicio8 {

	public static void main(String[] args) {
	    try {
	    	FileInputStream file = new FileInputStream(args[0]);
			DataInputStream dis = new DataInputStream(file);
			int lineIndexToRead = Integer.parseInt(args[1]);

			byte[] intByte = new byte[4];
			int lineIndex;
			int lineByteAmount;
			int byteAmountToSkip = 0;

			while ((lineIndex = dis.read(intByte)) != -1) {
				lineIndex = ByteBuffer.wrap(intByte).getInt();

				if (lineIndex == lineIndexToRead) {
					lineByteAmount = dis.read(intByte);
					lineByteAmount = ByteBuffer.wrap(intByte).getInt();

					byte[] byteArray = new byte[lineByteAmount];
					dis.read(byteArray);

					String str = new String(byteArray, "UTF-8");
					System.out.println(str);
				} else {
					byteAmountToSkip = dis.read(intByte);
					byteAmountToSkip = ByteBuffer.wrap(intByte).getInt();
					dis.skipBytes(byteAmountToSkip);
				}
			
			}

			dis.close();

	    } catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
	          e.getMessage());
	    }

	}

}
