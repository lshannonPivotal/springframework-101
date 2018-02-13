package com.lukeshannon.comicapp;

/**
 * Interface for special abilities that a character can have
 * @author lshannon
 *
 */
public interface Power {
	
	public String use(String user, String target);
	public String getName();
	public void setName(String name);

}
