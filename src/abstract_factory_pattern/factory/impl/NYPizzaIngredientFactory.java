package abstract_factory_pattern.factory.impl;

import abstract_factory_pattern.factory.PizzaIngredientFactory;
import abstract_factory_pattern.ingredient.veggie.Veggies;
import abstract_factory_pattern.ingredient.cheese.Cheese;
import abstract_factory_pattern.ingredient.cheese.ReggianoCheese;
import abstract_factory_pattern.ingredient.clams.Clams;
import abstract_factory_pattern.ingredient.clams.FreshClams;
import abstract_factory_pattern.ingredient.dough.Dough;
import abstract_factory_pattern.ingredient.dough.ThinCrustDough;
import abstract_factory_pattern.ingredient.pepperoni.Pepperoni;
import abstract_factory_pattern.ingredient.pepperoni.SlicedPepperoni;
import abstract_factory_pattern.ingredient.sauce.MarinaraSauce;
import abstract_factory_pattern.ingredient.sauce.Sauce;
import abstract_factory_pattern.ingredient.veggie.Garlic;
import abstract_factory_pattern.ingredient.veggie.Mushroom;
import abstract_factory_pattern.ingredient.veggie.Onion;
import abstract_factory_pattern.ingredient.veggie.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Veggies[] createVeggie() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
