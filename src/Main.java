import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int[] dataPoints = new int[100];
        int sum = 0;
        int avg;
        int matchCount = 0;
        int matchPos = -1;
        int min = 100;
        int max = 0;
        for(int i = 0; i < 100; i++){
            dataPoints[i] = r.nextInt(100)+1;
        }

        for(int i = 0; i < 100; i++){
            System.out.print(dataPoints[i] + " | ");
            sum += dataPoints[i];
            if(i%20 == 0 && i != 0){
                System.out.println();
            }
            if(dataPoints[i] > max){
                max = dataPoints[i];
            }
            if(dataPoints[i] < min){
                min = dataPoints[i];
            }
        }
        System.out.println();
        avg = sum/100;
        System.out.println("The average of the random array is: " + avg);

        int guess = SafeInput.getRangedInt(s,"Enter an int",1,100);
        for(int i = 0; i < 100; i++){
            if(dataPoints[i] == guess){
                matchCount++;
            }
        }
        System.out.println(guess + " is found " + matchCount + " time(s) in the random array.");

        int guess2 = SafeInput.getRangedInt(s,"Enter another int",1,100);
        for(int i = 0; i < 100; i++){
            if(dataPoints[i] == guess2){
                matchPos = i;
            }
        }
        if(matchPos != -1) {
            System.out.println(guess2 + " was found at position " + matchPos + " in the random array.");
        }else{
            System.out.println(guess2 + " was not found in the random array.");
        }

        System.out.println("The min number in the random array is: " + min);
        System.out.println("The max number in the random array is: " + max);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int values[])
    {
        int sum = 0;
        int avg;
        for(int i = 0; i < 100; i++){
            sum += values[i];
        }
        avg = sum/100;
        return avg;
    }

}