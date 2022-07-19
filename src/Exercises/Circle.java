package Exercises;

import Utils.Display;
import Utils.Limit;

public class Circle extends Shape {

    private int ratio;

    public Circle(Display display) {
        super(display);
        setInput(display);
    }

    @Override
    public String getPerimeter() {
        return "Perimetro: "+ (2*Math.PI*ratio);
    }

    @Override
    public String getArea() {
        return "Area: "+ (2*Math.PI*ratio*ratio);
    }

    private void setInput(Display display) {
        ratio = display.getInt("Ingrese el radio", new Limit(0, 100));

    }


}
