import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue; //Java Collection Framework

/**
 * @author: Ivette Cardona 16020
 * @author: Carlos Arroyave 16774
 * Clase MainPriorityQueue
 */

public class MainPriorityQueue {
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		PriorityQueue miPrio = new PriorityQueue();
		BufferedReader texto = new BufferedReader(new FileReader(new File("pacientes.txt")));
		String cadena;

		System.out.println("Utilizando PriorityQueue");
		while((cadena=texto.readLine()) != null){
			String[] dividido = cadena.split(","); //Separa la linea al encontrar una coma
			Paciente paciente = new Paciente();
			paciente.setPaciente(dividido[0],dividido[1],dividido[2]); //Guarda los datos en paciente
			String agregar = new String(); //Crear un string para guardar los datos del paciente
			agregar = dividido[2] + ", " + dividido[0] + ", " + dividido[1]; //Se guarda primero la letra para poder ordenarlo
			miPrio.add(agregar); //Añade el string creado al PriorityQueue
		}
		
		while(miPrio.size()!=0){
			System.out.println(miPrio.remove()); //Imprime
		}
		texto.close();
	}
}
