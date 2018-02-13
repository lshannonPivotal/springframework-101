package com.lukeshannon.comicapp;

/**
 * Runs our program. BTW, the business loves it.
 * @author lshannon
 *
 */
public class MainMethod {
	
	public static void main(String args[]) {
		//create the hero
		RobotHero hero = new RobotHero();
		hero.setName("Max-2020");
		//kick off the adventure
		System.out.println("###############################################");
		System.out.println("");
		System.out.println(hero.saveTheDay());
		System.out.println("");
		System.out.println("###############################################");
	}

}
