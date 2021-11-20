package abstract_factory_pattern.store;

import abstract_factory_pattern.Pizza;
import abstract_factory_pattern.PizzaStore;
import abstract_factory_pattern.factory.PizzaIngredientFactory;
import abstract_factory_pattern.factory.impl.NYPizzaIngredientFactory;
import abstract_factory_pattern.pizza.CheesePizza;
import abstract_factory_pattern.pizza.ClamPizza;
import factory_method_pattern.pizza.VeggiePizza;

public class NyPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NewYork style cheese pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NewYork style clam pizza");
        }
        return pizza;
    }
}
