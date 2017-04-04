import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;

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
		Paciente miPaciente = new Paciente();
		Paciente miPaciente2 = new Paciente();
		Paciente miPaciente3 = new Paciente();
		Paciente miPaciente4 = new Paciente();
		String[] pacientes = null; 
		Vector vector = new Vector();
		VectorHeap vH = new VectorHeap();
	
	 	try {
			//Utilizacion de buffered Reader para obtener los datos de un archivo de texto
		 	FileReader fr = new FileReader("pacientes.txt"); //Leer el archivo definido
		 	BufferedReader bf = new BufferedReader(fr);
		 	StringBuffer sb = new StringBuffer();
	 	    while ((cadena = bf.readLine()) != null){
	 	    	sb.append(cadena);
	 	    	sb.append("\n"); //Definir que caracter separa las oraciones
	 	    	
	 	    	/**
	 	    	StringTokenizer token = new StringTokenizer(cadena, ","); //Separar cada frase antecedida por una ",
	 	    	
	 			while (token.hasMoreTokens()) {
	 				int contador = 0; 
	 				String pacientito = token.nextToken();
	 				System.out.println(pacientito);
	 				pacientes[0] = pacientito;
	 				System.out.println(pacientes[contador]);
	 				contador++; 
	 			}
	 			*/
	 	    }
	 	    bf.close();
	 	    
	 	    for(int i=0; i<sb.toString().length(); i++){
	    		pacientes = sb.toString().split(",");
	    	}
	 	    for(int i =0; i<pacientes.length;i++){
	 	    	System.out.println(pacientes[i]);
	 	    	
	 	    }
	 	    //Guardar informacion de los pacientes
	 	    //Corregir esto porque esta feo :) <3
	 	    miPaciente.setNombre(pacientes[0]);
	 	    miPaciente.setEnfermedad(pacientes[1]);
	 	    miPaciente.setImportancia(pacientes[2]);
	 	    miPaciente2.setNombre(pacientes[3]);
	 	    miPaciente2.setEnfermedad(pacientes[4]);
	 	    miPaciente2.setImportancia(pacientes[5]);
	 	    miPaciente3.setNombre(pacientes[6]);
	 	    miPaciente3.setEnfermedad(pacientes[7]);
	 	    miPaciente3.setImportancia(pacientes[8]);
	 	    miPaciente4.setNombre(pacientes[9]);
	 	    miPaciente4.setEnfermedad(pacientes[10]);
	 	    miPaciente4.setImportancia(pacientes[11]);
	 	    
	 	    //Añadir al vectorHeap los codigos de los pacientes
	 	    //vH.add(miPaciente.getImportancia());
	 	    //vH.add(miPaciente2.getImportancia());
	 	    //vH.add(miPaciente3.getImportancia());
	 	    //vH.add(miPaciente4.getImportancia());
	 	    
	 	    //System.out.println(vH.getFirst());
	 	    
	 	} catch (IOException e) {
	 	}
		
	}
}

