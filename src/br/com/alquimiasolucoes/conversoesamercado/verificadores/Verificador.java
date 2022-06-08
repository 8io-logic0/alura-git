package br.com.alquimiasolucoes.conversoesamercado.verificadores;

public class Verificador {
	
	private boolean valida;
	
	public Verificador() {
		this.setValida(false);
	}
		
// getters e setters	
	public boolean getValida() {
		return valida;
	}


	public void setValida(boolean valida) {
		this.valida = valida;
	}


// m�todo de valida��o com uso de exce��o.	
	public boolean validacao(String valor) {
		try {
			Double.parseDouble(valor);
			this.setValida(true);
			return this.getValida();
		}catch(NumberFormatException ex) {
			this.setValida(false);
			return this.getValida();
		}catch(NullPointerException ex) {
			this.setValida(false);
			return this.getValida();
		}
		
	}
	
}
