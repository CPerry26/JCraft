package com.jcraft.character;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This is the JUnit test for the Player class.
 * @author Cody Perry (CPerry26)
 */
public class PlayerTest {

	/**
	 * This function tests the default creation of an Player.
	 */
	@Test
	public void test_player_default_create() {
		// Create default player.
		Player player = new Player();
		
		// In default creation, the player name should be the following.
		assertTrue(player.get_name().equals("DEFAULT_NAME"));
		
		// Get the current position of the player.
		double[] position = player.get_position();
		
		// Check to ensure that the position is 0,0,0.
		assertTrue(position[0] == 0.0);
		assertTrue(position[1] == 0.0);
		assertTrue(position[2] == 0.0);
	}
	
	/**
	 * This function tests the creation of an player with a specific name.
	 */
	@Test
	public void test_player_name_create() {
		// Create an player with a specific name.
		Player player = new Player("TEST");
		
		// Ensure the object was created with the given name.
		assertTrue(player.get_name().equals("TEST"));
		
		// Get the current position.
		double[] position = player.get_position();
		
		// Ensure the position was set properly.
		assertTrue(position[0] == 0.0);
		assertTrue(position[1] == 0.0);
		assertTrue(position[2] == 0.0);
	}
	
	/**
	 * This function tests creating an player with a specific position.
	 */
	@Test
	public void test_player_position_create() {
		// Create an player with a specific location.
		Player player = new Player(new double[] {1.0, 1.0, 1.0});
		
		// Ensure the object was created with a default name.
		assertTrue(player.get_name().equals("DEFAULT_NAME"));
		
		// Get the current position.
		double[] position = player.get_position();
		
		// Ensure the current position was set properly.
		assertTrue(position[0] == 1.0);
		assertTrue(position[1] == 1.0);
		assertTrue(position[2] == 1.0);
	}
	
	/**
	 * This function tests doing a full player create which includes both name
	 * and position.
	 */
	@Test
	public void test_player_full_create() {
		// Create an player with a specific name and location.
		Player player = new Player("TEST", new double[] {1.0, 1.0, 1.0});
		
		// Ensure the Player has the proper name set.
		assertTrue(player.get_name().equals("TEST"));
		
		// Get the current position.
		double[] position = player.get_position();
		
		// Ensure the current position was set properly.
		assertTrue(position[0] == 1.0);
		assertTrue(position[1] == 1.0);
		assertTrue(position[2] == 1.0);
	}
	
	/**
	 * This function tests the toString method on the Player.
	 */
	@Test
	public void test_to_string() {
		// Create an Player object.
		Player player = new Player();
		
		// Ensure that the toString method produces the correct string.
		assertTrue(player.toString().equals("DEFAULT_NAME"));
	}
	
	/**
	 * This function tests the setting of the Player name.
	 */
	@Test
	public void test_set_name() {
		// Create an Player object.
		Player player = new Player();
		
		// Set the name of Player.
		player.set_name("TEST");
		
		// Check that the name setter worked properly.
		assertTrue(player.get_name().equals("TEST"));
	}
	
	/**
	 * This function tests the setting of the current position.
	 */
	@Test
	public void test_set_position() {
		// Create an Player object.
		Player player = new Player();
		
		// Set the current position.
		player.set_position(1.0, 1.0, 1.0);
		
		// Check the position setter worked properly.
		double[] position = player.get_position();
		
		assertTrue(position[0] == 1.0);
		assertTrue(position[1] == 1.0);
		assertTrue(position[2] == 1.0);
	}

}
