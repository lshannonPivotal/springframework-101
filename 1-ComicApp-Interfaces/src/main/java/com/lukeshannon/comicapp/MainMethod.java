package com.lukeshannon.comicapp;

/**
 * Main method to run this code
 * @author lshannon
 *
 */
public class MainMethod {
	
	public static void main(String args[]) {
		System.out.println("###############################################");
		System.out.println("");
		//create all our references
		SuperStrength power = new SuperStrength();
		IntelligentVillain villain = new IntelligentVillain();
		villain.setName("Crazy Cortex!");
		AlienSideKick sideKick = new AlienSideKick();
		sideKick.setName("Kip the Wonder Blob");
		Hero hero = new RobotHero(power, villain, sideKick);
		hero.setName("Max-2030");
		//start the fun
		System.out.println(hero.saveTheDay());
		System.out.println("");
		System.out.println("###############################################");
	}

}
