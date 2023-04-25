package filas;

import entidades.Paciente;

public class FilaPaciente {

	private class Node {
		Paciente dado;
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

	public void enqueue(Paciente elem) {

		Node newNode = new Node();
		newNode.dado = elem;
		newNode.prox = null;

		if (isEmpty())
			ini = newNode;

		else
			fim.prox = newNode;

		fim = newNode;

	}

	public Paciente dequeue() {
		Paciente valor = ini.dado;
		ini = ini.prox;

		if (ini == null)
			fim = null;

		return valor;

	}

	public Paciente first() {
		return ini.dado;
	}

}
