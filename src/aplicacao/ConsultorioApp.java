package aplicacao;

import java.util.Scanner;

import entidades.Paciente;
import filas.FilaPaciente;
import filas.FilaString;

public class ConsultorioApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		FilaString filaAtendimento = new FilaString();

		FilaPaciente filaPaciente = new FilaPaciente();
		filaAtendimento.init();
		filaPaciente.init();

		int opcao;

		do {
			System.out.println("1- Inserir paciente\n2- Atender Paciente\n0- Encerrar\n");
			System.out.print("Opcao: ");
			opcao = input.nextInt();

			switch (opcao) {
			case 0:
				if (filaPaciente.isEmpty()) {
					System.out.println("Atendimento Encerrado.");
					opcao = 3;
				} else
					System.out.println("Pacientes Aguardando Atendimento, impossivel encerrar");
				break;

			case 1:

				Paciente paciente = new Paciente();
				System.out.print("Informe o nome do paciente a ser inserido: ");
				input.nextLine();
				String nome = input.nextLine();
				System.out.print("Informe a idade do paciente " + nome + ": ");
				int idade = input.nextInt();
				paciente.setNome(nome);
				paciente.setIdade(idade);

				filaPaciente.enqueue(paciente);

				break;
			case 2:
				if (filaPaciente.isEmpty())
					System.out.println("Fila Vazia, ninguem a ser atendido");
				else
				
				System.out.println("Paciente a ser atendido: " + filaPaciente.dequeue().toString());

				break;
			default:
				System.out.println("Opcao Invalida");

			}

		} while (opcao != 3);

		input.close();

	}

}
