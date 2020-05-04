package factory.abstractfactory.shapes;

import java.util.Scanner;

public class MyApplication {

    /**
     * The factory's job is to call the
     * constructor of the concrete class
     * that is required. This alleviates
     * the application from creating shapes,
     * and thereby being coupled to their
     * classes.
     */
    private ShapeFactory shapeFactory;

    public MyApplication(ShapeFactory shapeFactory) {
        this.shapeFactory = shapeFactory;
    }

    public void run() {
        Scanner keyboard = new Scanner(System.in);
        String shapeName = "";
        do {
            System.out.print("What shape? ");
            shapeName = keyboard.nextLine().trim();

            Shape theShape = shapeFactory.make(shapeName);
            System.out.println(theShape);

        } while (!shapeName.isEmpty());
    }

}
