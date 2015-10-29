package pool.product;

import java.awt.Color;

public abstract class AboveGroundPool extends Pool 
{
	protected Color color;
	public AboveGroundPool(Color color) 
	{
		this.color = color;
	}
	public void setColorPool(Color color)
	{
		this.color = color;
	}

}
