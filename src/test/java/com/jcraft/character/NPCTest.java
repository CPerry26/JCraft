package com.jcraft.character;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This is the JUnit test for the NPC class.
 * @author Cody Perry (CPerry26)
 */
public class NPCTest {

	/**
	 * This function tests the default creation of an NPC.
	 */
	@Test
	public void test_npc_default_create() {
		// Create default NPC.
		NPC npc = new NPC();
		
		// In default creation, the NPC name should be the following.
		assertTrue(npc.get_name().equals("DEFAULT_NAME"));
		
		// Get the current position of the NPC.
		double[] position = npc.get_position();
		
		// Check to ensure that the position is 0,0,0.
		assertTrue(position[0] == 0.0);
		assertTrue(position[1] == 0.0);
		assertTrue(position[2] == 0.0);
	}
	
	/**
	 * This function tests the creation of an NPC with a specific name.
	 */
	@Test
	public void test_npc_name_create() {
		// Create an NPC with a specific name.
		NPC npc = new NPC("TEST");
		
		// Ensure the object was created with the given name.
		assertTrue(npc.get_name().equals("TEST"));
		
		// Get the current position.
		double[] position = npc.get_position();
		
		// Ensure the position was set properly.
		assertTrue(position[0] == 0.0);
		assertTrue(position[1] == 0.0);
		assertTrue(position[2] == 0.0);
	}
	
	/**
	 * This function tests creating an NPC with a specific position.
	 */
	@Test
	public void test_npc_position_create() {
		// Create an NPC with a specific location.
		NPC npc = new NPC(new double[] {1.0, 1.0, 1.0});
		
		// Ensure the object was created with a default name.
		assertTrue(npc.get_name().equals("DEFAULT_NAME"));
		
		// Get the current position.
		double[] position = npc.get_position();
		
		// Ensure the current position was set properly.
		assertTrue(position[0] == 1.0);
		assertTrue(position[1] == 1.0);
		assertTrue(position[2] == 1.0);
	}
	
	/**
	 * This function tests doing a full NPC create which includes both name
	 * and position.
	 */
	@Test
	public void test_npc_full_create() {
		// Create an NPC with a specific name and location.
		NPC npc = new NPC("TEST", new double[] {1.0, 1.0, 1.0});
		
		// Ensure the NPC has the proper name set.
		assertTrue(npc.get_name().equals("TEST"));
		
		// Get the current position.
		double[] position = npc.get_position();
		
		// Ensure the current position was set properly.
		assertTrue(position[0] == 1.0);
		assertTrue(position[1] == 1.0);
		assertTrue(position[2] == 1.0);
	}
	
	/**
	 * This function tests the toString method on the NPC.
	 */
	@Test
	public void test_to_string() {
		// Create an NPC object.
		NPC npc = new NPC();
		
		// Ensure that the toString method produces the correct string.
		assertTrue(npc.toString().equals("DEFAULT_NAME"));
	}
	
	/**
	 * This function tests the setting of the NPC name.
	 */
	@Test
	public void test_set_name() {
		// Create an NPC object.
		NPC npc = new NPC();
		
		// Set the name of NPC.
		npc.set_name("TEST");
		
		// Check that the name setter worked properly.
		assertTrue(npc.get_name().equals("TEST"));
	}
	
	/**
	 * This function tests the setting of the current position.
	 */
	@Test
	public void test_set_position() {
		// Create an NPC object.
		NPC npc = new NPC();
		
		// Set the current position.
		npc.set_position(1.0, 1.0, 1.0);
		
		// Check the position setter worked properly.
		double[] position = npc.get_position();
		
		assertTrue(position[0] == 1.0);
		assertTrue(position[1] == 1.0);
		assertTrue(position[2] == 1.0);
	}

}
