package factory.abstractfactory.meals.german;

import factory.abstractfactory.meals.Meal;

public class Lunch implements Meal {

    private String description;

    public Lunch() {
        description = "Currywurst";
    }

    @Override
    public void dispayMeal() {
        System.out.println(description);
    }
}
