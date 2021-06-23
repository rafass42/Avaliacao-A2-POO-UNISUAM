package WB;

public abstract class OcorrenciaPolicial {
	private int numero;
	private String nomeVitima;
	private String descricaoOcorrencia ;


	public String getNomeVitima() {
		return nomeVitima;
	}

	public void setNomeVitima(String nomeVitima) {
		this.nomeVitima = nomeVitima;
	}

	public String getDescricaoOcorrencia() {
		return descricaoOcorrencia ;
	}

	public void setDescricaoOcorrencia (String descricaoOcorrencia ) {
		this.descricaoOcorrencia  = descricaoOcorrencia ;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public abstract String exibeinfoOcorrencia();

	

}
