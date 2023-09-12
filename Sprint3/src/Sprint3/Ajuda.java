package Sprint3;

import java.util.Scanner;

public class Ajuda {

	public void DuvidasAjuda() {
		Scanner input = new Scanner(System.in);
		System.out.println("Bem-vindo(a) à nossa central de ajuda!\n");
		System.out.println("Selecione uma das opções abaixo!");
		System.out.println("1 - Para dúvidas referentes ao acionamento do sinistro");
		System.out.println("2 - Sobre o tempo que o guincho leva em média até o local");
		System.out.println("3 - Referente a cargas que estiverem sendo levadas");
		System.out.println("4 - Pesagem do meu veículo");
		System.out.println("5 - Cancelar");
		int opcao = input.nextInt();
		
		if (opcao == 1) {
			System.out.println("Qual das opções abaixo você precisa?\n");
			System.out.println("1 - O acionamento é rápido e fácil de fazer?");
			System.out.println("2 - Posso acionar o sinistro independente de onde eu estiver?");
			System.out.println("3 - Cancelar");
			int opcao_menu = input.nextInt();
			if (opcao_menu == 1) {
				System.out.println("Sim, nós fizemos o possível para tornar o acionamento de sinistro simples e eficiente");
			}
			
			else if (opcao_menu == 2) {
				System.out.println("Faremos o possível para tentar auxiliá-lo da melhor forma onde quer que esteja!");
			}
		}
		
		else if (opcao == 2) {
			System.out.println("O tempo do guincho irá depender de onde você estiver localizado, o trânsito pode ser o principal fator, costumamos dizer que o tempo mínimo é de 20 minutos.");
		}
		
		else if (opcao == 3) {
			System.out.println("As cargas que estiverem no veículo serão manuseadas de acordo com o tipo delas, não se preocupe");
		}
		
		else if (opcao == 4) {
			System.out.println("Você deve pesar o seu veículo nas balanças que estiverem nas rodovias, caso você acione o sinistro, iremos precisar do peso do veículo");
		}
		
		input.close();
	}
}
