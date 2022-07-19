package Exercises;

import Utils.Display;
import Utils.Limit;

public class Octagon extends Shape {

    private int lado;
    public Octagon(Display display) {
        super(display);
        setInput(display);
    }

    @Override
    public String getPerimeter() {
        return "Perimetro: "+ (lado*8);
    }

    @Override
    public String getArea() {
        return "Area: "+ ((float) (2 * (1 + Math.sqrt(2)) * lado * lado));
    }

    private void setInput(Display display) {
        lado = display.getInt("Ingrese el tamano de los lados", new Limit(0, 100));
    }
}
