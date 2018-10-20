package methods;

public class CalculateVolume {

    public static void main(String[] args) {


        CalculateVolume udregning = new CalculateVolume();
        System.out.println(udregning.calculateVolume(5,5,5));

    }


    // her bruges en metode til at udregne volumen af en firkant ved at intaste de 3 værdier (ses over)
    // I metoden skriver man hvilken variabel man gerne vil have som resultat (double her)
    // og hvilke variabler man vil bruge til at finde resultatet (double, int og double her)


    public double calculateVolume(double lenght, int height, double width){
        double volume;
        volume = lenght * height * width;
        return volume;
    }
}