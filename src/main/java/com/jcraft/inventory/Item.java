package com.jcraft.inventory;

/**
 * This interface represents the basic functionality required for
 * the variety of items in JCraft.
 * @author Cody Perry (CPerry26)
 *
 */
public interface Item {
	// This is the item ID.
	public int itemID = 0;
	
	/**
	 * This function gets the item type.
	 * @return The type of the item.
	 */
	public String get_item_type();
	
	/**
	 * This function returns the ID of the item.
	 * @return ID of the item.
	 */
	public int get_item_id();
}
