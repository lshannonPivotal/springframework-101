package com.lukeshannon.comicapp;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.lukeshannon.comicapp")
@EnableAspectJAutoProxy
public class ComicConfig {
	
	@Bean
	Villian getVillian() {
		IntelligentVillian villian = new IntelligentVillian();
		villian.setName("The Thinker");
		return villian;
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
		alienSideKick.setName("Kip");
		return alienSideKick;
	}
	
	@Bean
    public ActionAspect actionAspect(){
        return new ActionAspect();
    }

}
