package factory.abstractfactory.shapes;


import factory.abstractfactory.shapes.colorfulshapes.ColorfulShapeFactoryImpl;

public class ShapeDriver {

    /**
     * This driver class creates one factory (in this case, a
     * factory that produces Circles, Squares, and Triangles
     * with color information). It creates the main application
     * and passes it the factory to use.
     *
     * The application is unaware what type of factory it's
     * been given. Maybe it's producing 3D shapes, or regular
     * shapes. All the application knows is it's been given
     * a ShapeFactory.
     * @param args
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ColorfulShapeFactoryImpl();
        MyApplication myApp = new MyApplication(shapeFactory);
        myApp.run();
    }
}
