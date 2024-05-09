package calculo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scanTerminal = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = scanTerminal.nextInt();
		
		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = scanTerminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametosInvalidosExpection e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
	}
	
	public static void contar(int parametroUm, int parametroDois) throws ParametosInvalidosExpection {
		if(parametroUm > parametroDois) throw new ParametosInvalidosExpection();
		
		int contagem = parametroDois - parametroUm;
		for(int t=0;t<=contagem;t++) {
			System.out.println("Imprimindo o número "+t);
		}
	}
}
