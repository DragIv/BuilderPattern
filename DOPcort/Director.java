package DOPcort;

import DOPcort.builders.Builder;
import DOPcort.components.Meat;
import DOPcort.cort.CortType;
import DOPcort.components.Vegetables;
import DOPcort.components.Fruit;

public class Director {

    public void constructVegan(Builder builder) {
        builder.setCortType(CortType.Vegetarian);
        builder.setFruit(new Fruit());
        builder.setVegetables(new Vegetables());
        builder.setVegetables(new Vegetables());
    }

    public void constructHealthy(Builder builder) {
        builder.setCortType(CortType.Healthy);
        builder.setFruit(new Fruit());
        builder.setVegetables(new Vegetables());
        builder.setMeat(new Meat());
    }

    public void constructMeat(Builder builder) {
        builder.setCortType(CortType.Meat);
        builder.setMeat(new Meat());
        builder.setMeat(new Meat());
    }
}