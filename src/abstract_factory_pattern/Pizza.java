package abstract_factory_pattern;

import abstract_factory_pattern.ingredient.cheese.Cheese;
import abstract_factory_pattern.ingredient.clams.Clams;
import abstract_factory_pattern.ingredient.dough.Dough;
import abstract_factory_pattern.ingredient.pepperoni.Pepperoni;
import abstract_factory_pattern.ingredient.sauce.Sauce;
import abstract_factory_pattern.ingredient.veggie.Veggies;

public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Veggies veggies[];
    protected Pepperoni pepperoni;
    protected Clams clam;

    protected abstract void prepare();

    protected void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    protected void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    protected void box() {
        System.out.println("Please pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
