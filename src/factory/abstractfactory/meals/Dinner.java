package factory.abstractfactory.meals;

import java.sql.SQLOutput;

public class Dinner implements Meal{
    private String description;
    private boolean isDelicious;
    private int calories;

    public Dinner() {
        description = "T-Bone Steak";
        isDelicious = true;
        calories = 600;

    }

    @Override
    public void dispayMeal() {
        System.out.println(description + " is " + calories + " calories");
        System.out.println("Is it good?\n" + (isDelicious ? "delicious" : "disgusting"));
    }
}
