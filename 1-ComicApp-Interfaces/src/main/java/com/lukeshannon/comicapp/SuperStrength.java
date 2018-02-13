/**
 * 
 */
package com.lukeshannon.comicapp;


/**
 * This is a OK power, there could be better. Thanks to interfaces
 * we can do better.
 * @author lshannon
 *
 */
public class SuperStrength implements Power {

	private String name;


	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String use(String user, String target) {
		return user + " says: Lifts heavy things and throws it at " + target;
	}

}
