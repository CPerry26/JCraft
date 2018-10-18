package com.jcraft.inventory;

/**
 * This abstract class represents a tool in Minecraft. All different tool types
 * will extend this class. The functionality is separated so handling of 
 * different tool types and their associated valid actions isn't congested in the
 * top level class.
 * 
 * @author Cody Perry (CPerry26)
 *
 */
public abstract class Tool implements Item {
	// This is the item ID.
	private int itemID;

	// This is the item type.
	private String itemType;
	
	/**
	 * This is the default constructor for a Tool. It currently does nothing.
	 */
	public Tool() {
		
	}

	/**
	 * This function gets the item type of the Tool. In
	 * this case it will return "Tool".
	 * 
	 * @return {@link #itemType}
	 */
	public String get_item_type() {
		return this.itemType;
	}

	/**
	 * This function gets the item ID of the Tool. In this
	 * case the ID returned is 0.
	 * 
	 * @return {@link #itemID}
	 */
	public int get_item_id() {
		return this.itemID;
	}

	/**
	 * This function allows the setting of item type for a tool.
	 * It will be used for setting the types for specific tools (i.e. 
	 * diamond, wood, etc. tools).
	 * 
	 * @param itemType : {@link String} with the item type.
	 */
	public void set_item_type(String itemType) {
		this.itemType = itemType;
	}

	/**
	 * This function allows the setting of the item ID for a tool.
	 * It will be used for setting the ID for specific tools (i.e. 
	 * 1 for diamond, 2 for wood, etc.).
	 * 
	 * @param itemID : {@link Integer} with the item ID.
	 */
	public void set_item_id(int itemID) {
		this.itemID = itemID;
	}

}
