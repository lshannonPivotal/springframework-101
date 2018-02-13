package com.lukeshannon.comicapp;

/**
 * A Power for our Super Hero
 * @author lshannon
 *
 */
public class SuperStrength {
	
	private String name;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String use(String user, String target) {
		return user + " says: I will lift a huge thing and throw it at " + target;
	}

}
