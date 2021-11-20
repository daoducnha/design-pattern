package abstract_factory_pattern.factory;

import abstract_factory_pattern.ingredient.cheese.Cheese;
import abstract_factory_pattern.ingredient.clams.Clams;
import abstract_factory_pattern.ingredient.dough.Dough;
import abstract_factory_pattern.ingredient.pepperoni.Pepperoni;
import abstract_factory_pattern.ingredient.sauce.Sauce;
import abstract_factory_pattern.ingredient.veggie.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Pepperoni createPepperoni();
    Veggies[ ] createVeggie();
    Clams createClam();
}
