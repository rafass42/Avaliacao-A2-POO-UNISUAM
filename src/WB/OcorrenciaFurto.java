package WB;

import javax.swing.JOptionPane;

public class OcorrenciaFurto extends OcorrenciaPolicial implements Roubo {

	
	
	GeradorOcorrencia go = new GeradorOcorrencia();
	@Override
	public String informaValorRoubado() {
		
         String valor =  JOptionPane.showInputDialog("Digite o valor roubado:");
		
		return valor;
		
		
	}

	
	

	@Override
	public String exibeinfoOcorrencia() {
		String info = "==========OCORRENCIA FURTO==========\n\n";
		info+="\nNumero da Ocorrencia: "+this.getNumero();
		info+="\nNome da vitima: "+this.getNomeVitima();
		info+="\nDescrição da Ocorrencia:  "+this.getDescricaoOcorrencia();
		info+="\nValor roubado:  "+this.informaValorRoubado();
		
		
		
		
		return info;
	}

	
	

}
