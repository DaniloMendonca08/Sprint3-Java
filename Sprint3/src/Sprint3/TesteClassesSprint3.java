package Sprint3;

public class TesteClassesSprint3 {
	public static void main(String[] args) {
		Sinistro s1 = new Sinistro();
		Ajuda aj = new Ajuda();
		
		//caso o usuário queira acionar o sinistro
		s1.acionarSinistro();
		
		//caso o usuário queira tirar dúvidas, poderá acessar o menu
		//aj.DuvidasAjuda();
		
		//os métodos ModalAdequado() e chamarEquipe() não estão sendo chamados aqui pois ele será chamado
		//dentro do método acionarSinistro()
	}
}
