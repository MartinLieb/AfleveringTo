package Loops;

public class DoWhile {

    public static void main(String[] args) {

        // Her tjekkes conditionen efter statementet er kørt i stedet for ligesom et while loop bare at køre

        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 100);
    }
}
