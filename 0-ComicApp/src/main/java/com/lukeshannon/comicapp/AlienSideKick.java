package com.lukeshannon.comicapp;

/**
 * Side kick for the hero
 * @author lshannon
 *
 */
public class AlienSideKick {
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String deliverWiseCrack() {
		return name + " says: This is how we did it on Mars!";
	}
	
	public String callForBackUp() {
		return  name + " says: Mars to Earth...HELP!";
	}

}
