package abstract_factory_pattern.factory.impl;

import abstract_factory_pattern.factory.PizzaIngredientFactory;
import abstract_factory_pattern.ingredient.veggie.Veggies;
import abstract_factory_pattern.ingredient.cheese.Cheese;
import abstract_factory_pattern.ingredient.cheese.MozzarellaCheese;
import abstract_factory_pattern.ingredient.clams.Clams;
import abstract_factory_pattern.ingredient.clams.FreshClams;
import abstract_factory_pattern.ingredient.dough.Dough;
import abstract_factory_pattern.ingredient.dough.ThickCrustDough;
import abstract_factory_pattern.ingredient.pepperoni.Pepperoni;
import abstract_factory_pattern.ingredient.pepperoni.SlicedPepperoni;
import abstract_factory_pattern.ingredient.sauce.PlumTomatoSauce;
import abstract_factory_pattern.ingredient.sauce.Sauce;
import abstract_factory_pattern.ingredient.veggie.BlackOlives;
import abstract_factory_pattern.ingredient.veggie.EggPlant;
import abstract_factory_pattern.ingredient.veggie.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Veggies[] createVeggie() {
        return new Veggies[]{new BlackOlives(), new Spinach(), new EggPlant()};
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
