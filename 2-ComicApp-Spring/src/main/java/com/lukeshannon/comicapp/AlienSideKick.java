package com.lukeshannon.comicapp;

public class AlienSideKick implements SideKick {
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String deliverWiseCrack() {
		return name + " says: Earthlings are the worst!";
	}

	public String callForBackUp() {
		return name + " says: Bring in the big guns! We need some help!";
	}
	
	public String specialAlienTrait() {
		return name + " says: I am see through walls";
	}

}
