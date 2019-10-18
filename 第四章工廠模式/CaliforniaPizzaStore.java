public class CaliforniaPizzaStore extends PizzaStore
{
	Pizza pizza;
	Pizza CreatePizza(String item)
	{
		if(item.equals("cheese"))
		{
			return new CaliforniaPizzaStoreStyleCheesePizza();
		}
		else if(item.equals("pepperoni"))
		{
			return new CaliforniaPizzaStoreStylePepperoniPizza();
		}
		else if(item.equals("clam"))
		{
			return new CaliforniaPizzaStoreStyleClamPizza();
		}
		else if(item.equals("veggie"))
		{
			return new CaliforniaPizzaStoreStyleVeggiePizza();
		}

		return null;
	}
}