package DOPcort.builders;

import CarsExample.cars.Manual;
import DOPcort.components.Bread;
import DOPcort.components.Meat;
import DOPcort.cort.Cort;
import DOPcort.cort.CortType;
import DOPcort.components.Vegetables;
import DOPcort.components.Fruit;

public class CortBuilder implements Builder {
    private CortType type;

    private Vegetables vegetables;
    private Fruit fruit;
    private Meat meat;
    private Bread bread;

    @Override
    public void setCortType(CortType type) {
        this.type = type;
    }

    @Override
    public void setVegetables(Vegetables vegetables) {
        this.vegetables = vegetables;
    }

    @Override
    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    @Override
    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public Cort getResult() {
        return new Cort(type, vegetables,fruit,meat,bread);
    }
}
