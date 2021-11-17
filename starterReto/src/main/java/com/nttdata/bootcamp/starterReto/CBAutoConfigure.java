package com.nttdata.bootcamp.starterReto;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
@ConditionalOnClass(CB.class)
@EnableConfigurationProperties(CBProperties.class)
public class CBAutoConfigure { 
	
	private final CBProperties properties;
	public CBAutoConfigure(CBProperties properties) {
		this.properties= properties;
	}
	
	@Bean
	public CB cb() {
		return new CB(properties.getEstado());
	}

}
