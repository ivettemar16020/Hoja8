import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;

/**
 * @author: Ivette Cardona 16020
 * @author: Carlos Arroyave 16774
 * Clase Main
 */

public class Main {
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		VectorHeap<Paciente> vector = new VectorHeap<>();
		BufferedReader texto = new BufferedReader(new FileReader(new File("pacientes.txt")));
		String cadena;
		
		while((cadena=texto.readLine()) != null){
			String[] dividido = cadena.split(",");
			Paciente paciente = new Paciente();
			paciente.setPaciente(dividido[0],dividido[1],dividido[2]);
			vector.add(paciente);
		}
		
		while(vector.size()!=0){
			System.out.println(vector.getFirst().getNombre()+", "+vector.getFirst().getEnfermedad()+", "+vector.getFirst().getImportancia());
			vector.remove();
		}
		texto.close();
	}
}

