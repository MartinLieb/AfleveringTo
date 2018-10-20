package loops;

public class While {

    public static void main(String[] args) {

        // Meget simpelt while loop hvor tælleren incrementer 1 indtil 99

        int count = 1; // her defineres i
        while (count < 100) { // her stoppes loopet på 99
            System.out.println("Count is: " + count); // her printes loopet
            count++; // her incrementer vi tælleren
        }
    }
}
