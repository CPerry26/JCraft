package com.jcraft.character;

/**
 * This interface represents a character in the game.
 * Both playable and non-playable characters will implement this interface.
 * @author Cody Perry (CPerry26)
 *
 */
public interface Character {
	
	/**
	 * This function sets the Character's name.
	 * @param name : {@link String} with the character's name to set.
	 */
	public void set_name(String name);
	
	/**
	 * This function returns the Character instance's name.
	 * @return {@link #characterName}
	 */
	public String get_name();
	
	/**
	 * This function sets the current position of the player.
	 * @param x : {@link Double} with the X coordinate of the player.
	 * @param y : {@link Double} with the Y coordinate of the player.
	 * @param z : {@link Double} with the Z coordinate of the player.
	 */
	public void set_position(double x, double y, double z);
	
	/**
	 * This function gets the current position of the player.
	 * @return The current position of the player.
	 */
	public double[] get_position();
}
