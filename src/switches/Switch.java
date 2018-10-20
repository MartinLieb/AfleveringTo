package switches;

public class Switch {

    public static void main(String[] args) {

        // her laves et switch statement, hvor en int værdi repræsenterer den flotteste elev fra klassen

        int student = 5; // her henvises den den 5. case i switch statementet
        String studentString = "";
        switch (student) {
            case 1: studentString = "Mads"; // her vil vores switch gå videre uden at breake
                break;
            case 2: studentString = "Lucas"; // her vil vores switch gå videre uden at breake
                break;
            case 3: studentString = "Kenneth"; // her vil vores switch gå videre uden at breake
                break;
            case 4: studentString = "Mathias"; // her vil vores switch gå videre uden at breake
                break;
            case 5: studentString = "Martin"; // her vil vores switch gå ind og tage data ud som vi skal bruge
                break;
            case 6: studentString = "Tobias"; // denne linje bliver ikke brugt da switchen stopper på case 5
                break;

        }

        System.out.println("Den flotteste elev i klassen er " + studentString);
    }
}
