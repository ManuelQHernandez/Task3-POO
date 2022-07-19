package Exercises;

import Utils.Display;



public class NullShape extends Shape {

    public final String ERROR = "No se ha creado una figura en especifico";


    public NullShape(Display display) {
        super(display);
    }

    @Override
    public String getPerimeter() {
        return ERROR;
    }

    @Override
    public String getArea() {
        return ERROR;
    }

    @Override
    public String getTypes() {
        return ERROR;
    }
}
