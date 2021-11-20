package factory_method_pattern.store_stype;

import factory_method_pattern.Pizza;
import factory_method_pattern.PizzaStore;
import factory_method_pattern.pizza.*;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) pizza = new NYStyleCheesePizza();
        else if ("pepperoni".equals(type)) pizza = new PepperoniPizza();
        else if ("clam".equals(type)) pizza = new ClamPizza();
        else if ("veggie".equals(type)) pizza = new VeggiePizza();
        return pizza;
    }
}
