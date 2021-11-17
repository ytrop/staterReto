package com.nttdata.bootcamp.starterReto;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("cb")
public class CBProperties {
	
	private String estado ="closed";
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		
		this.estado= estado;
	}

}
