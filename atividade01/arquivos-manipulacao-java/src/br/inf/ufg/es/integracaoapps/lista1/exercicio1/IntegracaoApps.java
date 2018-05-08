package br.inf.ufg.es.integracaoapps.lista1.exercicio1;

import java.io.IOException;

/**
 *
 * @author Alunoinf_2 
 * Classe principal que instancia o objeto da classe ConverterHexadecimal
 */
public class IntegracaoApps {
/**
 *
 * @author Alunoinf_2 
 * Método principal que instacia o objeto da classe ConverterHexadecimal
 * @param args diretório do arquivo .class que terá seus 4 primeiros bytes 
 * convertidos para hexadecimal
 * @throws IOException Lança essa exeção se o diretório informado nos argumentos
 * for inválido
 */
    public static void main(String[] args) throws IOException{
        
        ConverterHexadecimal converter = new ConverterHexadecimal();
        converter.convertaArquivoParaHexadecimal(args[0]);
        
    }
    
}
