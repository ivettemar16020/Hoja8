
/**
 * @author: Ivette Cardona 16020
 * @author: Carlos Arroyave 16774
 * Interfaz PriorityQueue
 * Codigo obtenido del libro JavaStructures
 */

public interface PriorityQueue<E extends Comparable<E>>
{
	// Metodo getFirst()
	// pre: !isEmpty()
	// post: returns the minimum value in priority queue
	public E getFirst();

	// Metodo remove()
	// pre: !isEmpty()
	// post: returns and removes minimum value from queue
	public E remove();
	
	// Metodo add()
	// pre: value is non-null comparable
	// post: value is added to priority queue
	public void add(E value);
	
	// Metodo isEmpty()
	// post: returns true iff no elements are in queue
	public boolean isEmpty();
	
	//Metodo size()
	// post: returns number of elements within queue
	public int size();
	
	//Metodo clear()
	public void clear();
	// post: removes all elements from queue
}