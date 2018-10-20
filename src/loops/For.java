package loops;

public class For {

    public static void main(String[] args) {

        // For statements er et loop der stopper når der ikke er mere data
        // og her vil loopet køre indtil tælleren er 10

        for(int i=1; i<11; i++){ // her defineres i, derefter blever den incrementet og til sidst definerer vi hvor den skal stoppe
            System.out.println("Count is: " + i); // her printer vi hele loopet
        }
    }
}
