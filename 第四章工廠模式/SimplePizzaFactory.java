package com.hfad.pizza;

public class SimplePizzaFactory
{
	public Pizza CreatePizza(String type)
	{
		Pizza pizza = null;
		if(type.equals("cheese"))
		{
			pizza = new CheesePizza();
		}
		else if(type.equals("pepperoni"))
		{
			pizza = new PepperoniPizza();
		}
		else if(type.equals("Clam"))
		{
			pizza = new ClamPizza();
		}
		else if(type.equals("veggie"))
		{
			pizza = new VeggiePizza();
		}
		else
		{
			pizza = new Pizza();
		}
		return pizza;
	}
}