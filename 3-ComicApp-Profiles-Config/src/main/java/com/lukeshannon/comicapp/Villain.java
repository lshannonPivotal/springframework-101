/**
 * 
 */
package com.lukeshannon.comicapp;

/**
 * Everything you would expect from a Villain
 * 
 * @author lshannon
 *
 */
public interface Villain {
	
	public String scheme();
	public String attack(String name);
	public String flee();
	public String getName();
	public void setName(String name);

}
