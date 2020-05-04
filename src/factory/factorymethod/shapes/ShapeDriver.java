package factory.factorymethod.shapes;


import factory.abstractfactory.shapes.ShapeFactory;
import factory.abstractfactory.shapes.colorfulshapes.ColorfulShapeFactoryImpl;

public class ShapeDriver {

    /**
     * In Abstract Factory, the driver made a factory object
     * and gave it to the application object. Now there is
     * no separate factory. The driver just makes the necessary
     * kind of application.
     *
     * One drawback to this is that the behavior of the
     * application can't be swapped out at runtime. It is
     * hardcoded in the application's factory method.
     * @param args
     */
    public static void main(String[] args) {
        MyRegularShapeApplication myApp = new MyRegularShapeApplication();
        myApp.run();
    }
}
