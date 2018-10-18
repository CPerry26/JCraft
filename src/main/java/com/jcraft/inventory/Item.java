package com.jcraft.inventory;

/**
 * This interface represents the basic functionality required for
 * the variety of items in JCraft.
 * @author Cody Perry (CPerry26)
 *
 */
public interface Item {
	
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
	
	/**
	 * This function sets the Item type.
	 * @param itemType : {@link String} with the item type.
	 */
	public void set_item_type(String itemType);
	
	/**
	 * This function sets the Item ID.
	 * @param itemID : {@link Integer} with the item ID.
	 */
	public void set_item_id(int itemID);
}
