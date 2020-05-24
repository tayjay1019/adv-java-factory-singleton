package factory.abstractfactory.meals;


public class OtherMealFactory implements MealFactory{
    public Meal getMeal(String mealType) {
        switch (mealType) {
            case "breakfast":
                return new Breakfast();
            case "lunch":
                return new Lunch();
            case "dinner":
                return new Dinner();
            default:
                return null;
        }

    }
}
