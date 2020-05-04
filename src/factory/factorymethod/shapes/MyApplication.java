package factory.factorymethod.shapes;

import factory.abstractfactory.shapes.Shape;

public interface MyApplication {
    /**
     * In Abstract Factory, the application contained a factory object.
     * It would tell that object to .make() shapes.
     *
     * In Factory Method, the application contains a method that
     * does the same thing as the factory object did: makes shapes.
     * @param shapeName
     * @return
     */
    Shape make(String shapeName);
}
