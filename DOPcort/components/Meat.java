package DOPcort.components;

public class Meat {
    private final String content;

    public Meat() {
        this.content = "fats = 24%, squirrels = 18%, carbohydrates = 6%";
    }

    public Meat(String manualRoute) {
        this.content = manualRoute;
    }

    public String getRoute() {
        return content;
    }
}