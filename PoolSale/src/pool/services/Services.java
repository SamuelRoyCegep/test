package pool.services;

import pool.product.Pool;


public abstract class Services extends Pool
{
	protected Pool pool;
	protected double servicePrice = 0;
	protected static double total = 0;

	public Services(Pool p)
	{
		this.pool = p;
	}
}
