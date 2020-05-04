package factory.abstractfactory.shapes;


/**
 * There are many variations (many families)
 * of shapes. You can have Circles, Squares,
 * and Triangles that are three-dimensional.
 * Or Circles, Squares, and Triangles that
 * have a color.
 *
 * Each family of shapes (3D ones, colorful
 * ones) has its own factory class that
 * implements this interface and produces
 * that type of Circle, Square, and Triangle.
 */
public interface ShapeFactory {

    Shape make(String shapeName);
}
