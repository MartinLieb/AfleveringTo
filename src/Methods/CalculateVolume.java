package Methods;

public class CalculateVolume {

    public static void main(String[] args) {


        CalculateVolume udregning = new CalculateVolume();
        System.out.println(udregning.calculateVolume(5,5,5));

    }


    public double calculateVolume(double lenght, int height, double width){
        double volume;
        volume = lenght * height * width;
        return volume;
    }
}