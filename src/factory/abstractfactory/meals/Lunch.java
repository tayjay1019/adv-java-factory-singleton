package factory.abstractfactory.meals;

public class Lunch implements Meal {
    private String description;
    private int calories;

    public Lunch() {
        description = "Hamburgers and Fries";
        calories = 800;
    }

    @Override
    public void dispayMeal() {
        System.out.println(description + " is " + calories + " calories");
    }
}
