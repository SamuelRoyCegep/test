package pool.services;
import pool.product.Pool;


public class ServiceInstallation extends Services 
{
	public ServiceInstallation(Pool p) 
	{
		super(p);
		this.servicePrice = 1500;
	}
	public double calculatePrice()
	{
		return this.servicePrice + this.pool.calculatePrice();
	}
}
