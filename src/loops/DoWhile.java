package loops;

public class DoWhile {

    public static void main(String[] args) {

        // Her tjekkes conditionen efter statementet er kørt i stedet for ligesom et while loop bare at køre

        int count = 1; // her definerer vi vores int værdi
        do {
            System.out.println("Count is: " + count);
            count++; // her incrementer vi vores count
        } while (count < 100); // her fortæller vi loopet hvor vi vil stoppe
    }
}
