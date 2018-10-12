package com.jcraft.character;

/**
 * This class represents a human controlled character.
 * Player will continue to change as more functionality is added to the class.
 * @author Cody Perry (CPerry26)
 */
public class Player implements Character {
	// This is the player's name.
	private String playerName;

	// This is the current position of the player.
	private double[] currentPosition;
	
	/**
	 * This is the default constructor for a Player. It does default variable
	 * initialization.
	 */
	public Player() {
		this.playerName = "DEFAULT_NAME";
		this.currentPosition = new double[] {0.0, 0.0, 0.0};
	}
	
	/**
	 * This is another constructor for a Player object. It takes in a name
	 * to be set as the player's name.
	 * @param name : {@link String} with the player's name.
	 */
	public Player(String name) {
		this.playerName = name;
		this.currentPosition = new double[] {0.0, 0.0, 0.0};
	}
	
	/**
	 * This is another constructor for a player object. It takes in a starting
	 * position for the player. The name gets set to the default name.
	 * @param startPosition : An array of double X, Y, Z coordinates of the 
	 * player.
	 */
	public Player(double[] startPosition) {
		this.playerName = "DEFAULT_NAME";
		this.currentPosition = startPosition;
	}
	
	/**
	 * This is another constructor which initializes both the name and
	 * starting position of the player.
	 * @param name : {@link String} with the player's name.
	 * @param startPosition : An array of double X, Y, Z coordinates of the 
	 * player.
	 */
	public Player(String name, double[] startPosition) {
		this.playerName = name;
		this.currentPosition = startPosition;
	}

	/**
	 * This function sets the player's name.
	 * @param name : {@link String} with the name to set.
	 */
	@Override
	public void set_name(String name) {
		this.playerName = name;
	}

	/**
	 * This function gets the name of the player instance.
	 * @return {@link #playerName}
	 */
	@Override
	public String get_name() {
		return this.playerName;
	}

	/**
	 * This function sets the current position of the player.
	 * TODO: Investigate logic for making sure the set is a valid move.
	 * Realistically this shouldn't matter as a player is able to move
	 * everyone but in the case of collision this needs to be checked.
	 * @param x : {@link Double} with the X coordinate of the player.
	 * @param y : {@link Double} with the Y coordinate of the player.
	 * @param z : {@link Double} with the Z coordinate of the player.
	 */
	@Override
	public void set_position(double x, double y, double z) {
		this.currentPosition[0] = x;
		this.currentPosition[1] = y;
		this.currentPosition[2] = z;
	}

	/**
	 * This function gets the current position of the player.
	 * @return {@link #currentPosition}
	 */
	@Override
	public double[] get_position() {
		return this.currentPosition;
	}
	
	/**
	 * This function overrides the Object toString for debugging purposes.
	 * @return {@link #playerName}
	 */
	@Override
	public String toString() {
		return this.playerName;
	}
}
