package pool.services;
import pool.product.Pool;


public class PiscinePompe extends Services {

	public PiscinePompe(Pool p) 
	{
		super(p);
		this.servicePrice = 600;
	}
	public double calculatePrice()
	{
		return this.servicePrice + this.pool.calculatePrice();
	}
}