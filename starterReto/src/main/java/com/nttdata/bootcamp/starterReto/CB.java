package com.nttdata.bootcamp.starterReto;

public class CB {
	
	private String estado = "open";
	
	
	
	public CB(String estado) {
		this.estado = estado;
		
	}



	public String cambioEstados(Integer contador) {
	String	respuesta = "";
		if(estado.equals("closed") && contador < 10) {
			estado = "open";
			respuesta = "open";
		}
		
		if(estado.equals("closed") && contador > 10) {
			estado = "open";
			respuesta = "open";
		}
		
		return respuesta;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	

}
