import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * @author: Ivette Cardona 16020
 * @author: Carlos Arroyave 
 * Clase Main
 */

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String cadena; 
	
	 	try {
			//Utilizacion de buffered Reader para obtener los datos de un archivo de texto
		 	FileReader fr = new FileReader("pacientes.txt"); //Leer el archivo definido
		 	BufferedReader bf = new BufferedReader(fr);
		 	StringBuffer sb = new StringBuffer();
	 	    while ((cadena = bf.readLine()) != null){
	 	    	sb.append(cadena);
	 	    	sb.append("\n"); //Definir que caracter separa las oraciones
	 	    	
	 	    	//for (int i = 0;i < cadena.length(); i++){
	 	    	    //System.out.println(cadena.charAt(i));
	 	    	//}
	 	    	StringTokenizer token = new StringTokenizer(cadena, ","); //Separar cada frase antecedida por una ",

	 			while (token.hasMoreTokens()) {
	 				System.out.println(token.nextToken());
	 			}
	 	    }
	 	    bf.close();
	 	} catch (IOException e) {
	 	}
		
	}
}

