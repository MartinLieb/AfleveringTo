package objectsconstructors;

import java.awt.*;

import static java.awt.Color.black;

public class PoelseConstructor {

    public static void main(String[] args) {

        // en constructor laver objekter ud fra de givne parametre i constructoren,
        // her laver vi en pølse constructor som kan vise pølsens farve længde og type

        PoelseConstructor poelse1 = new PoelseConstructor(black, 5, "frankfurter");

        }

    public PoelseConstructor(Color color, int lenght, String type){ // her laves constructoren

        Color poelsefarve = color; // her defineres farven
        int poelselenght = lenght; // her defineres længden
        String poelsetype = type; // her defineres typen

        System.out.println("New poelse object created"); // her printer vi at objektet er blevet lavet

    }
}
