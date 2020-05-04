package factory.abstractfactory.shapes.colorfulshapes;


import factory.abstractfactory.shapes.Shape;
import factory.abstractfactory.shapes.ShapeFactory;

/**
 * This factory produces shapes that also
 * carry information about what color they
 * should be.
 */
public class ColorfulShapeFactoryImpl implements ShapeFactory {

    @Override
    public Shape make(String shapeName) {
        switch (shapeName) {
            case "circle":
                return new ColorfulCircle();
            case "square":
                return new ColorfulSquare();
            case "triangle":
                return new ColorfulTriangle();
        }

        return null;
    }

}
