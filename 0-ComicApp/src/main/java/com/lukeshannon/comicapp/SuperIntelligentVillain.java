package com.lukeshannon.comicapp;

/**
 * Every hero needs a Villain. This one is a smart Lex Luthor type
 * @author lshannon
 *
 */
public class SuperIntelligentVillain {
	
	private String name;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String scheme() {
		return name + " says: I will rule the world";
	}
	
	public String attack(String target) {
		return name + " says: These Nanobots will take care of " + target;
	}
	
	public String flee() {
		return name + " says: Next time I will get you!";
	}

}
