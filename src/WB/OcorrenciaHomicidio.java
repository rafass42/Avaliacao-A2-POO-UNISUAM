package WB;

import javax.swing.JOptionPane;

public class OcorrenciaHomicidio extends OcorrenciaPolicial implements Morte {

	@Override
	public String informaLocalAssassinato() {
		String local =  JOptionPane.showInputDialog("Digite do local do assassinato:");
		
		
		
		return local;
	}

	@Override
	public String exibeinfoOcorrencia() {
		String info = "==========OCORRENCIA HOMIC�DIO==========\n\n";
		info+="\nNumero da Ocorrencia: "+this.getNumero();
		info+="\nNome da vitima: "+this.getNomeVitima();
		info+="\nDescri��o da Ocorrencia:  "+this.getDescricaoOcorrencia();
		info+="\nLocal do assassinato:  "+this.informaLocalAssassinato();
		
		
		return info;
	}

	
	

}
