/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author jv_sa
 */
public class Exercicio4 {

    public static void main(String[] args) throws IOException {

        Writer writer = new FileWriter(args[0]);
        writer.write(args[1]);
        writer.close();

    }

}
