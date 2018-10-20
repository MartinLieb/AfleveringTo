package objectsconstructors;

import java.awt.*;

import static java.awt.Color.black;

public class PoelseConstructor {

    public static void main(String[] args) {

        // en constructor laver objekter ud fra de givne parametre i constructoren,
        // her laver vi en pølse constructor som kan vise pølsens farve længde og type

        PoelseConstructor poelse1 = new PoelseConstructor(black, 5, "frankfurter");

        }

    public PoelseConstructor(Color color, int lenght, String type){

        Color poelsefarve = color;
        int poelselenght = lenght;
        String poelsetype = type;

        System.out.println("New poelse object created");

    }
}
