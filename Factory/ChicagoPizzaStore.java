package Factory;

import Factory.ChicagoStyle.ChicagoStyleCheesePizza;
import Factory.ChicagoStyle.ChicagoStyleClamPizza;
import Factory.ChicagoStyle.ChicagoStylePepperoniPizza;
import Factory.ChicagoStyle.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
