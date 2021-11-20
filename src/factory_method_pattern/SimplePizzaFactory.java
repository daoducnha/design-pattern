package factory_method_pattern;

import factory_method_pattern.pizza.CheesePizza;
import factory_method_pattern.pizza.ClamPizza;
import factory_method_pattern.pizza.PepperoniPizza;
import factory_method_pattern.pizza.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) pizza = new CheesePizza();
        else if ("pepperoni".equals(type)) pizza = new PepperoniPizza();
        else if ("clam".equals(type)) pizza = new ClamPizza();
        else if ("veggie".equals(type)) pizza = new VeggiePizza();
        return pizza;
    }
}
