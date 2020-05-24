package factory.abstractfactory.meals;


import factory.abstractfactory.meals.german.GermanMealFactory;

public class MealDriver {

    public static void main(String[] args) {
        OtherMealFactory mealFactory = new OtherMealFactory();
        Hotel hotel = new Hotel(mealFactory);
        hotel.serveMeals();
    }
}
