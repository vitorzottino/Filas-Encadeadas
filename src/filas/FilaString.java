package filas;

public class FilaString {
	
	private class Node {
		String dado;
		Node prox;
	}

	private Node ini, fim;

	public void init() {
		ini = fim = null;
	}

	public boolean isEmpty() {
		if (ini == null && fim == null)
			return true;
		else
			return false;
	}

	public void enqueue(String elem) {

		Node newNode = new Node();
		newNode.dado = elem;
		newNode.prox = null;

		if (isEmpty())
			ini = newNode;

		else
			fim.prox = newNode;

		fim = newNode;

	}

	public String dequeue() {
		String valor = ini.dado;
		ini = ini.prox;

		if (ini == null)
			fim = null;

		return valor;

	}

	public String first() {
		return ini.dado;
	}
	
	
	

}
