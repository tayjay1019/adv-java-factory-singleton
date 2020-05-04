package factory.abstractfactory.meals;


import factory.abstractfactory.meals.german.GermanMealFactory;

public class MealDriver {

    public static void main(String[] args) {
        GermanMealFactory mealFactory = new GermanMealFactory();
        Hotel hotel = new Hotel(mealFactory);
        hotel.serveMeals();
    }
}
