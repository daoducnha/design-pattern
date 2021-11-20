package abstract_factory_pattern.store;

import abstract_factory_pattern.Pizza;
import abstract_factory_pattern.PizzaStore;
import abstract_factory_pattern.factory.PizzaIngredientFactory;
import abstract_factory_pattern.factory.impl.ChicagoPizzaIngredientFactory;
import abstract_factory_pattern.pizza.CheesePizza;
import abstract_factory_pattern.pizza.ClamPizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago style cheese pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago style clam pizza");
        }
        return pizza;
    }
}
