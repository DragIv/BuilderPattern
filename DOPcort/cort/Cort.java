package DOPcort.cort;

import DOPcort.components.Bread;
import DOPcort.components.Meat;
import DOPcort.components.Vegetables;
import DOPcort.components.Fruit;

public class Cort {
    private final CortType cortType;

    private Vegetables vegetables;
    private Fruit fruit;
    private Meat meat;
    private Bread bread;

    public Cort(CortType cortType,Vegetables vegetables, Fruit fruit,Meat meat,Bread bread) {
        this.cortType = cortType;
        this.vegetables = vegetables;
        this.fruit = fruit;
        this.meat = meat;
        this.bread = bread;
    }

    public String print() {
        String info = "";
        info += "Type of cort: " + cortType + "\n";
        info += "The basket contains a vegetable with the information: " + vegetables + "\n";
        info += "The basket contains a fruit with the information: " + fruit +"\n";
        info += "The basket contains a meat with the information: " + meat + "\n";
        info += "The basket contains a bread with the information: " + bread + "\n";

        return info;
    }
}