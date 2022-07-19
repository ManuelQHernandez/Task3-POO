package Exercises;

import Utils.Display;

public abstract class Shape  {

    private Display display;

    public Shape(Display display) {
        this.display = display;
    }

    public abstract String getPerimeter();

    public abstract String getArea();

    public String getTypes() {
        return this.getClass().getSimpleName();
    }
}
