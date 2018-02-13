package com.lukeshannon.comicapp;
/**
 * 
 */

/**
 * @author lshannon
 *
 */
public class SuperStrength implements Power {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String use(String user, String target) {
		return user + " says: Lifts heavy things and throws it at " + target;
	}

}
