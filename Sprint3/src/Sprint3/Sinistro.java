package Sprint3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sinistro {
	
	public void acionarSinistro() throws InputMismatchException{
		try {
			EquipeResgate e1 = new EquipeResgate();
			EscolhaModal m = new EscolhaModal();
			Scanner input = new Scanner(System.in);
			System.out.println("Seja bem-vindo(a) ao nosso serviço de acionamento de sinistro!");
			
			System.out.println("Você necessita de algum tipo de assistência médica ou bombeiros? Digite S(sim) ou N(não)");
			String resposta = input.next();
			if (resposta.equals("S") || resposta.equals("s") || resposta.equals("sim")) {
				  String equipe_resgate = e1.chamarEquipe();
				  System.out.println("A equipe que será chamada: " + equipe_resgate);
			}
			
			System.out.println("Digite o peso do seu veículo (apenas o valor em toneladas e utilizando vírgula caso seja necessário): ");
			double peso = input.nextDouble();
			
			String Guincho = m.ModalAdequado(peso);
			System.out.println("Você está carregando alguma carga? Digite S(sim) ou N(não)");
			String carga = input.next();
			if (carga.equals("S") || carga.equals("s") || carga.equals("sim")) {
				System.out.println("A carga é de que tipo? (viva, corrosiva, inflamável), se não tiver risco, digite comum");
				String tipo_carga = input.next();
				if (tipo_carga.equals("viva")) {
					System.out.println("Certo, enviaremos os órgãos responsáveis para checagem da carga");
					System.out.println("O seu acionamento de sinistro foi concluido com sucesso!");
					System.out.println("O guincho que irá até o local será: " + Guincho);
				
				} else if (tipo_carga.equals("corrosiva") || tipo_carga.equals("inflamável") || tipo_carga.equals("inflamavel")) {
					System.out.println("Tenha cuidado, mantenha uma distância segura da carga até a chegada do guincho");
					System.out.println("O seu acionamento de sinistro foi concluido com sucesso!");
					System.out.println("O guincho que irá até o local será: " + Guincho);
					
				} else if (tipo_carga.equals("comum")) {
					System.out.println("Nesse caso, a sua carga não precisará de cuidado especial");
					System.out.println("O seu acionamento de sinistro foi concluido com sucesso!");
					System.out.println("O guincho que irá até o local será: " + Guincho);
				}
			}
			else {
				System.out.println("Acionamento de sinistro concluido, aguarde a chegada do guincho até o seu local!");
			}
			input.close();
		} catch (InputMismatchException e) {
			System.err.println("Digite o peso utilizando vírgula e não ponto, por favor");
			acionarSinistro();
		}
	}
}

