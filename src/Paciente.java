/**
 * @author: Ivette Cardona 16020
 * @author: Carlos Arroyave 16774
 * Clase Paciente
 */
public class Paciente implements Comparable<Paciente> {
	//Atributos del paciente
	public String nombre; 
	public String enfermedad; 
	public String importancia; 
	
	public Paciente(){
		nombre = " ";
		enfermedad = " ";
		importancia = " ";
	}
	
	/**
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return enfermedad
	 */
	public String getEnfermedad() {
		return enfermedad;
	}
	
	/**
	 * @param enfermedad
	 */
	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}
	
	/**
	 * @return importancia
	 */
	public String getImportancia() {
		return importancia;
	}
	
	/**
	 * @param importancia
	 */
	public void setImportancia(String importancia) {
		this.importancia = importancia;
	}
	public void setPaciente(String nombre, String enfermedad,String importancia){
		this.nombre= nombre;
		this.enfermedad = enfermedad;
		this.importancia=importancia;
	}

	@Override
	public int compareTo(Paciente o) {
		return importancia.compareToIgnoreCase(o.getImportancia());
	}
	
	
	
	
}
