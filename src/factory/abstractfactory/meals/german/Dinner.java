package factory.abstractfactory.meals.german;

import factory.abstractfactory.meals.Meal;

public class Dinner implements Meal {

    private String description;
    private boolean isDelicious;

    public Dinner() {
        description = "Beef Brisket";
        isDelicious = true;
    }

    @Override
    public void dispayMeal() {
        System.out.println(description + " is " + (isDelicious ? "delicious" : "disgusting"));
    }
}
