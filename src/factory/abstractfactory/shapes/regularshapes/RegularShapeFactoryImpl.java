package factory.abstractfactory.shapes.regularshapes;


import factory.abstractfactory.shapes.Shape;
import factory.abstractfactory.shapes.ShapeFactory;

/**
 * This factory produces regular shapes. Nothing
 * fancy about them!
 */
public class RegularShapeFactoryImpl implements ShapeFactory {

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

}
