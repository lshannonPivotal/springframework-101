package com.lukeshannon.comicapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainMethod {
	
	public static void main(String args[]) {
		System.out.println("###############################################");
		System.out.println("");
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(ComicConfig.class);
		Hero hero = (Hero) context.getBean(Hero.class);
		System.out.println(hero.saveTheDay());
		System.out.println("");
		System.out.println("###############################################");
	}

}
