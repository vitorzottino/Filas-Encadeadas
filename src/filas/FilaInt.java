package filas;

public class FilaInt {

	private class Node {
		int dado;
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

	public void enqueue(int elem) {

		Node newNode = new Node();
		newNode.dado = elem;
		newNode.prox = null;

		if (isEmpty())
			ini = newNode;

		else
			fim.prox = newNode;

		fim = newNode;

	}

	public int dequeue() {
		int valor = ini.dado;
		ini = ini.prox;

		if (ini == null)
			fim = null;

		return valor;

	}

	public int first() {
		return ini.dado;
	}

}
