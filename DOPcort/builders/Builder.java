package DOPcort.builders;

import DOPcort.components.Bread;
import DOPcort.components.Meat;
import DOPcort.cort.CortType;
import DOPcort.components.Vegetables;
import DOPcort.components.Fruit;

public interface Builder {
    void setCortType(CortType type);

    void setVegetables(Vegetables vegetables);
    void setFruit(Fruit fruit);
    void setMeat(Meat meat);
    void setBread(Bread bread);

}
