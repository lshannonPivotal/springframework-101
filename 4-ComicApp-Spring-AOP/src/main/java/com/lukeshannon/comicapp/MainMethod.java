package com.lukeshannon.comicapp;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainMethod {
	
	public static void main(String args[]) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ComicConfig.class);
		Hero hero = (Hero) context.getBean(Hero.class);
		hero.setName("Max 4040");
		System.out.println(hero.saveTheDay());
	}

}
