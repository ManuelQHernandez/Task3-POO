import Exercises.Circle;
import Exercises.Octagon;
import Exercises.Rectangle;
import Exercises.Square;
import Exercises.NullShape;
import Exercises.Shape;
import Utils.Display;
import Utils.Limit;

public class Menu {

    private Display display;

    private Shape shape;
    private final int NUMBER_OPTION = 8;
    private final int FIRST_OPTION = 1;

    public static void main(String[] args) {
        new Menu().play();
    }

    public Menu() {
        display = new Display();
        shape = new NullShape(display);
    }

    public void play() {
        int option = 0;

        String msg = "Ingrese la opcion: ";
        Limit limit = new Limit(FIRST_OPTION, NUMBER_OPTION);

        do {
            printMenu();

            option = display.getInt(msg, limit);

            getOption(option);

        }while (option != NUMBER_OPTION);
    }

    private void getOption(int option){
        switch (option) {
            case 1:
                shape = new Square(display);
                break;
            case 2:
                shape = new Circle(display);
                break;
            case 3:
                shape = new Rectangle(display);
                break;
            case 4:
                shape = new Octagon(display);
                break;
            case 5:
                display.printTitleMessage("Resultado: "+ shape.getPerimeter());
                break;
            case 6:
                display.printTitleMessage("Resultado: " + shape.getArea());
                break;
            case 7:
                display.printTitleMessage("Tipo Figura: "+ shape.getTypes());
                break;
            default:
                display.printTitleMessage("Gracias! por participar");
                break;
        }
    }

    private void printMenu() {
        display.printText("1) Crear Cuadrado: ");
        display.printText("2) Crear Circulo: ");
        display.printText("3) Crear Rectangulo: ");
        display.printText("4) Crear Octagono");
        display.printText("5) Imprimir Perimetro");
        display.printText("6) Imprimir Area");
        display.printText("7) Imprimir tipo de figura");
        display.printText("8) Salir");
    }
}
