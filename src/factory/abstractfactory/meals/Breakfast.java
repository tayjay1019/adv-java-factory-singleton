package factory.abstractfactory.meals;



public class Breakfast implements Meal {
    private String description;
    private int calories;

    public Breakfast() {
        description = "Bacon, Waffles, and Orange Juice";
        calories = 500;
    }


    @Override
    public void dispayMeal() {
        System.out.println(description + " is " + calories + " calories");
    }
}
