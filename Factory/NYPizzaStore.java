package Factory;

import Factory.NYStyle.NYStyleCheesePizza;
import Factory.NYStyle.NYStyleClamPizza;
import Factory.NYStyle.NYStylePepperoniPizza;
import Factory.NYStyle.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else
            return null;
    }
}
