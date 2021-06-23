package WB;

import javax.swing.JOptionPane;

public class OcorrenciaLatrocinio extends OcorrenciaPolicial implements Morte,Roubo {

	@Override
	public String informaValorRoubado() {
		
		String valor =  JOptionPane.showInputDialog("Digite o valor roubado:");
		
		return valor;
	}
	
	@Override
	public String informaLocalAssassinato() {
		String local =  JOptionPane.showInputDialog("Digite do local do assassinato:");
		
		
		return local;
	}
	
	
	

	@Override
	public String exibeinfoOcorrencia() {
		String info = "=========OCORRENCIA LATROCÍNIO==========\n\n";
		info+="\nNumero da Ocorrencia: "+this.getNumero();
		info+="\nNome da vitima: "+this.getNomeVitima();
		info+="\nDescrição da Ocorrencia:  "+this.getDescricaoOcorrencia();
		info+="\nLocal do assassinato:  "+this.informaLocalAssassinato();
		info+="\nValor roubado:  "+this.informaValorRoubado();
		
		
		return info;
	}




	

	
	

}
