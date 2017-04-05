import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		VectorHeap<Paciente> vector = new VectorHeap<>();
		Paciente jose = new Paciente();
		jose.setPaciente("jose","parto","A");
		vector.add(jose);
		assertEquals(1,vector.size());
		assertEquals(jose,vector.remove());
	}

}
