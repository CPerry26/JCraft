package com.jcraft.inventory;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a player's inventory.
 * @author Cody Perry (CPerry26)
 *
 */
public class Inventory {
	// This is the max size of the inventory.
	private static final int MAX_SIZE = 30;
	
	// The list of items currently in the reduced inventory.
	// In Minecraft, this would be the items in your hand.
	private List<Item> handInventory = new ArrayList<Item>();
	
	// The list of items in your pack.
	private List<Item> packInventory = new ArrayList<Item>();
	
	/**
	 * This function gets the items currently in the hand inventory.
	 * @return {@link #handInventory}
	 */
	public List<Item> get_hand_inventory() {
		return this.handInventory;
	}
	
	/**
	 * This function gets the items currently in the pack inventory.
	 * @return {@link #packInventory}
	 */
	public List<Item> get_pack_inventory() {
		return this.packInventory;
	}
	
	/**
	 * This function adds a given item to the inventory.
	 * It ensures that an item can be added first.
	 * @param item : {@link Item} to be added to the inventory.
	 */
	public void add_inventory_item(Item item) {
		// If the hand inventory has open spots, add it there.
		if (this.handInventory.size() < 10) {
			this.handInventory.add(item);
			
		// If the pack inventory has open spots, add it there.
		} else if (this.packInventory.size() < 20) {
			this.packInventory.add(item);
			
		// The inventory is full, display an error. This will be
		// an actual error display once graphics are implemented.
		} else {
			System.err.println(
					"The inventory is currently full. Cannot add item "
					+ item.get_item_type() + "."
			);
		}
	}
	
	/**
	 * This function removes a given inventory item.
	 * @param item : {@link Item} to be removed from the inventory.
	 */
	public void remove_inventory_item(Item item) {
		// If the hand inventory contains the item, remove it.
		if (this.handInventory.contains(item)) {
			this.handInventory.remove(item);
			
		// If the pack inventory contains the item, remove it.	
		} else if (this.packInventory.contains(item)) {
			this.packInventory.remove(item);
			
		// The item isn't in the inventory, display an error.
		} else {
			System.err.println(
					"The item to be removed doesn't exist in the inventory."
			);
		}
	}
}
