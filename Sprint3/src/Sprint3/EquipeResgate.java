package Sprint3;

import java.util.Scanner;

public class EquipeResgate {

	public String chamarEquipe() {
		Scanner input = new Scanner(System.in);
		System.out.println("Qual você precisa que seja chamado até o local?");
		System.out.println("1 - Bombeiros");
		System.out.println("2 - Equipe médica");
		System.out.println("3 - Ambas as equipes");
		int num_assistencia = input.nextInt();
		String resgate = "";
		if (num_assistencia == 1) {
			resgate = "Bombeiros";
		}
		
		else if (num_assistencia == 2) {
			resgate = "Equipe médica mais próxima da região";
		}
		
		else if (num_assistencia == 3) {
			resgate = "Bombeiros e equipe médica estão sendo chamados ao local da sua ocorrência";
		}
		
		return resgate;
		
		}
}
