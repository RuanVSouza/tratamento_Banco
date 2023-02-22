package principal;

import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import excecoes.excecoesClientes;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira os dados da conta");
		System.out.print("Numero da Conta:");
		int numeroConta = sc.nextInt();
		
		System.out.print("Nome do Cliente:");
		String nome = sc.next();
		
		System.out.print("Saldo inicial:");
		double saldo = sc.nextDouble();
		
		System.out.print("Limite de saque:");
		double limiteRetirada = sc.nextDouble();
		
		Cliente cliente = new Cliente(numeroConta, nome, saldo, limiteRetirada);
		
		System.out.print("Quantia que deseja retirar:");
		double quantia = sc.nextDouble();
		
		try {
			cliente.retirada(quantia);
			System.out.printf("Novo saldo %.2f%n", cliente.getSaldo());
		}
		catch(excecoesClientes e) {
			System.out.println(e.getMessage());
		}
		
		
		sc.close();

	}

}
