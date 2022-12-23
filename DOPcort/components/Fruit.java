package DOPcort.components;

public class Fruit {
    private final String content;

    public Fruit() {
        this.content = "fats = 2%, squirrels = 2%, carbohydrates = 1%";
    }

    public Fruit(String manualRoute) {
        this.content = manualRoute;
    }

    public String getRoute() {
        return content;
    }
}