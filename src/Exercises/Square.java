package Exercises;

import Utils.Display;
import Utils.Limit;

public class Square extends Shape {

    private int lado;

    public Square(Display display) {
        super(display);
        setInput(display);
    }

    @Override
    public String getPerimeter() {
        return "Perimetro: "+ (lado+lado+lado+lado);
    }

    @Override
    public String getArea() {
        return "Area: "+(lado*lado);
    }

    private void setInput(Display display) {
        lado = display.getInt("Ingrese lado: ", new Limit(0, 100));
    }
}
