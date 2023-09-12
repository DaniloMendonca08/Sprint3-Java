package Sprint3;

public class EscolhaModal {

	public String ModalAdequado(double peso) {
		String guincho = "";
		if (peso >= 1 && peso <= 4) {
			String guinchoL = "Modal Leve";
			guincho = guinchoL;
			
		}
		
		else if (peso >= 5 && peso <= 9) {
			String guinchoM = "Modal Moderado";
			guincho = guinchoM;
		}
		
		else if (peso >= 10) {
			String guinchoP = "Modal Pesado";
			guincho = guinchoP;
		}
		return guincho;
		
	}
}
