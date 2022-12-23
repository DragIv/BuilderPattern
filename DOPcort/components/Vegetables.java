package DOPcort.components;

public class Vegetables {
    private final String content;

    public Vegetables() {
            this.content = "fats = 0.4%, squirrels = 10%, carbohydrates = 1%";
        }

    public Vegetables(String manualRoute) {
        this.content = manualRoute;
    }

    public String getRoute() {
        return content;
    }
}
