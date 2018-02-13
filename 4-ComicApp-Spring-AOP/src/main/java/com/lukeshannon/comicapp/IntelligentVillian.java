package com.lukeshannon.comicapp;

public class IntelligentVillian implements Villian {
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String scheme() {
		return name + " says: This super virus will bring the world to its knees";
	}

	public String attack(String name) {
		return name + " says: My super sonic phaser will take care of you " + name;
	}

	public String flee() {
		return name + " says: Next time you won't be so lucky fools!";
	}

}
