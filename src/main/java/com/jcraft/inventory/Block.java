package com.jcraft.inventory;

/**
 * This abstract class represents the block type in Minecraft. It will
 * be extended by each individual block type. I chose to do it this
 * way so the logic for how each block is affected by tools and such
 * will be separated from the top level block functionality.
 * 
 * @author Cody Perry (CPerry26)
 *
 */
public abstract class Block implements Item {
	// This is the item ID.
	private int itemID;
	
	// This is the item type.
	private String itemType;
	
	/**
	 * Default constructor for a Block. It currently does nothing.
	 */
	public Block() {
		
	}

	/**
	 * This function gets the item type of the Block. In
	 * this case it will return "Block".
	 * 
	 * @return {@link #itemType}
	 */
	public String get_item_type() {
		return this.itemType;
	}
	
	/**
	 * This function gets the item ID of the Block. In this
	 * case the ID returned is 0.
	 * 
	 * @return {@link #itemID}
	 */
	public int get_item_id() {
		return this.itemID;
	}
	
	/**
	 * This function allows the setting of item type for a block.
	 * It will be used for setting the types for specific blocks (i.e. 
	 * diamond, wood, etc. blocks).
	 * 
	 * @param itemType : {@link String} with the item type.
	 */
	public void set_item_type(String itemType) {
		this.itemType = itemType;
	}
	
	/**
	 * This function allows the setting of the item ID for a block.
	 * It will be used for setting the ID for specific blocks (i.e. 
	 * 1 for diamond, 2 for wood, etc.).
	 * 
	 * @param itemID : {@link Integer} with the item ID.
	 */
	public void set_item_id(int itemID) {
		this.itemID = itemID;
	}
}
