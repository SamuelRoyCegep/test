package pool.product;

import java.awt.Color;

public class SmallPool extends AboveGroundPool
{
	public static final int basePrice = 3000;
	private static final int size = 15;
	
	public SmallPool(Color color)
	{
		super(color);
	}
	public double calculatePrice()
	{
		return basePrice;
	}
	public int getSize()
	{
		return size;
	}
}