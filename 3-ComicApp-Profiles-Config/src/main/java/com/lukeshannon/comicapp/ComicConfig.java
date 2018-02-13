package com.lukeshannon.comicapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan("com.lukeshannon.comicapp")
//Note: Profiles can also be set for the whole config file
//@Profile("")
@PropertySource("classpath:sidekick.properties")
public class ComicConfig {

	/*
	 * Two beans with the name villain
	 */
	@Bean(name="Villain")
	@Profile("dev")
	Villain getVillainDev() {
		IntelligentVillain villain = new IntelligentVillain();
		villain.setName("Crazy Cortex");
		return villain;
	}
	
	@Bean(name="Villain")
	@Profile("qa")
	Villain getVillainQA() {
		IntelligentVillain villain = new IntelligentVillain();
		villain.setName("The Thinker");
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
	
	/*
	 * When there are beans of the same type (see above), a name is define here, places
	 * where this beans is required we can use the Qualifier annotation
	 */
	@Bean(name="seriousSideKick")
	SideKick getSideKickSerious(@Value("${sidekick.serious.name}") String name) {
		AlienSideKick alienSideKick = new AlienSideKick();
		alienSideKick.setName(name);
		return alienSideKick;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer props() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}
