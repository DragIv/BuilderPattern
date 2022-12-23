package DOPcort.components;

public class Bread {
    private final String content;

    public Bread() {
        this.content = "fats = 14%, squirrels = 2%, carbohydrates = 19%";
    }

    public Bread(String manualRoute) {
        this.content = manualRoute;
    }

    public String getRoute() {
        return content;
    }
}