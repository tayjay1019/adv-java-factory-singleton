package factory.factorymethod.shapes;

import factory.abstractfactory.shapes.Shape;
import factory.abstractfactory.shapes.regularshapes.Circle;
import factory.abstractfactory.shapes.regularshapes.Square;
import factory.abstractfactory.shapes.regularshapes.Triangle;

import java.util.Scanner;

public class MyRegularShapeApplication implements MyApplication {

    /**
     * In the Abstract Factory pattern, this method was in the
     * concrete factory implementations. In the Factory Method
     * pattern, it is implemented by the application directly.
     * Hence the name of the pattern. This method IS the factory.
     *
     * Pros: fewer classes, a bit faster than Abstract Factory
     * Cons: can't swap behavior at runtime, may violate SRP
     * @param shapeName
     * @return
     */
    @Override
    public Shape make(String shapeName) {
        switch (shapeName) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "triangle":
                return new Triangle();
        }

        return null;
    }


    /**
     * This method is the same in MyColorfulShapeApplication
     * and MyRegularShapeApplication. Could it have been
     * implemented in an abstract superclass? Probably.
     */
    public void run() {
        Scanner keyboard = new Scanner(System.in);
        String shapeName = "";
        do {
            System.out.print("What shape? ");
            shapeName = keyboard.nextLine().trim();

            Shape theShape = make(shapeName);
            System.out.println(theShape);

        } while (!shapeName.isEmpty());
    }

}
