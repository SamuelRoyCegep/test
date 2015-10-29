package pool.services;
import pool.product.Pool;


public class PiscineThermopompe extends Services {

	public PiscineThermopompe(Pool p) 
	{
		super(p);
		this.servicePrice = 1000;
	}
	public double calculatePrice()
	{
		return this.servicePrice + this.pool.calculatePrice();
	}

}
