package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

public static void main(String[] args) {
		
		Scanner entradaSalario = new Scanner(System.in);
		Scanner entradaReajuste = new Scanner(System.in);
		
		System.out.print("Digite o valor do salario: ");
		double salario = entradaSalario.nextDouble();
		
		System.out.print("Digite o percentual de reajuste: ");
		double reajuste = entradaReajuste.nextDouble();
		
		double atualizado = salario / 100 * reajuste + salario;
		
		System.out.println(atualizado);
		
	}

}
