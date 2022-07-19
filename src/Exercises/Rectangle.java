package Exercises;

import Utils.Display;
import Utils.Limit;

public class Rectangle extends Shape {

    private int base, altura;

    public Rectangle(Display display) {
        super(display);
        setInput(display);
    }

    @Override
    public String getPerimeter() {
        return "Perimetro: " + (base*2 + altura*2);
    }

    @Override
    public String getArea() {
        return "Area: " + (base*altura);
    }

    private void setInput(Display display) {
        base = display.getInt("Ingrese la base", new Limit(0, 100));
        altura = display.getInt("Ingrese la altura", new Limit(0, 100));

    }
}
