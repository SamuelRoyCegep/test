package pool.services;
import pool.product.Pool;


public class PiscineFiltre extends Services {

	public PiscineFiltre(Pool p) 
	{
		super(p);
		this.servicePrice = 300;
	}
	public double calculatePrice()
	{
		return this.servicePrice + this.pool.calculatePrice();
	}
}
