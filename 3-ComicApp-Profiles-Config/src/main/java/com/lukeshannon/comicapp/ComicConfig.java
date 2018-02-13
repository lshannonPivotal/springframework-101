package com.lukeshannon.comicapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.lukeshannon.comicapp")
public class ComicConfig {
	
	@Bean
	Villain getVillain() {
		IntelligentVillain villain = new IntelligentVillain();
		villain.setName("Crazy Cortex");
		return villain;
	}
	
	@Bean
	Power getPower() {
		SuperStrength power = new SuperStrength();
		power.setName("Super Strength");
		return power;
	}
	
	@Bean
	SideKick getSideKick() {
		AlienSideKick alienSideKick = new AlienSideKick();
		alienSideKick.setName("Kip The Wonder Blob");
		return alienSideKick;
	}

}
