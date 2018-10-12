package com.jcraft.character;

/**
 * This is the NPC class. All non-playable characters will be an instance
 * of this class. For now, the functionality overlaps with Player, but
 * they will differentiate as the project grows.
 * @author Cody Perry (CPerry26)
 *
 */
public class NPC implements Character {
	// This is the name of the NPC. For now it will be a generic name
	// but the functionality for custom naming will exist.
	private String npcName;
	
	// This is the current position of the NPC.
	private double[] currentPosition;

	/**
	 * This is the default constructor for a Player. It does default variable
	 * initialization.
	 */
	public NPC() {
		this.npcName = "DEFAULT_NAME";
		this.currentPosition = new double[] {0.0, 0.0, 0.0};
	}
	
	/**
	 * This is another constructor for a Player object. It takes in a name
	 * to be set as the player's name.
	 * @param name : {@link String} with the player's name.
	 */
	public NPC(String name) {
		this.npcName = name;
		this.currentPosition = new double[] {0.0, 0.0, 0.0};
	}
	
	/**
	 * This is another constructor for a player object. It takes in a starting
	 * position for the player. The name gets set to the default name.
	 * @param startPosition : An array of double X, Y, Z coordinates of the 
	 * player.
	 */
	public NPC(double[] startPosition) {
		this.npcName = "DEFAULT_NAME";
		this.currentPosition = startPosition;
	}
	
	/**
	 * This is another constructor which initializes both the name and
	 * starting position of the player.
	 * @param name : {@link String} with the player's name.
	 * @param startPosition : An array of double X, Y, Z coordinates of the 
	 * player.
	 */
	public NPC(String name, double[] startPosition) {
		this.npcName = name;
		this.currentPosition = startPosition;
	}
	
	/**
	 * This function sets the name of the NPC.
	 * @param name : {@link String} with the NPC name.
	 */
	@Override
	public void set_name(String name) {
		this.npcName = name;
	}

	/**
	 * This function returns the name of the NPC.
	 * @return {@link #npcName}
	 */
	@Override
	public String get_name() {
		return this.npcName;
	}

	/**
	 * This function sets the current position of the NPC. Like the Player
	 * implementation, collision detection logic will need to be added here.
	 * @param x : {@link Double} with the X coordinate of the NPC.
	 * @param y : {@link Double} with the Y coordinate of the NPC.
	 * @param z : {@link Double} with the Z coordinate of the NPC.
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
	 * This simply override's the Object toString function. It is used for
	 * debugging purposes.
	 * @return {@link #npcName}
	 */
	@Override
	public String toString() {
		return this.npcName;
	}

}
