package subsistema2.cep;

public class CepApi {

	private static CepApi instancia = new CepApi();

	private CepApi() {
		super();
	}

	public static CepApi getInstancia() {
		return instancia;
	}
	
	//Modificado para a cidade do Recife
	public String recuperarCidade(String cep) {
		return "Recife";
	}
	
	//Modificado para o estado de PE
	public String recuperarEstado(String cep) {
		return "PE";
	}
}
