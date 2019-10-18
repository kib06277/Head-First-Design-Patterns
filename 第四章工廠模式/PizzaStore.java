package com.hfad.pizza;

public abstract class PizzaStore
{
	abstract Pizza CreatePizza(String type);
	public Pizza orderPizza(String type)
	{
		Pizza pizza;
		pizza = CreatePizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}