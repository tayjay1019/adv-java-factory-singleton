package factory.abstractfactory.shapes.threedshapes;

import factory.abstractfactory.shapes.Shape;
import factory.abstractfactory.shapes.ShapeFactory;

/**
 * This factory create three-dimensional shapes
 * that also have a height component.
 */
public class ThreeDShapeFactoryImpl implements ShapeFactory {

    @Override
    public Shape make(String shapeName) {
        switch (shapeName) {
            case "circle":
                return new Cylinder();
            case "square":
                return new Cube();
            case "triangle":
                return new TriangularPrism();
        }

        return null;
    }
}
