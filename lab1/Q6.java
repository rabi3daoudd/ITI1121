import java.util.Scanner;
import java.util.*;
public class Q6{


    public static double[] main(String[] args){
        //your code here
        Scanner user = new Scanner(System.in);

        double[] sum = new double[11];

        int temp = 10;
        for(int i = 0; i <= temp; i++){
            System.out.println("Enter a grade: ");
            double grade1 = user.nextDouble();
            sum[i] = grade1;
        }

        return (sum);
    }

    public static double calculateAverage(double[] notes){
        //your code here
        double sum = 0;
        double avg = 0;
        for(int i = 0; i < notes.length; i++){
            sum = sum + notes[i];
        }

        avg = sum/notes.length;

        return avg;
    }

    public static double calculateMedian(double[] notes){
        //your code here
        double median = 0;
        Arrays.sort(notes);
        for(int i = 0; i < notes.length-1; i++){
            if(notes.length % 2 != 0){
                int odd = Math.round(notes.length / 2);
                median = notes[odd];
            }
            else{
                double even = notes[notes.length / 2];
                median = (even + notes[notes.length/2 - 1]) / 2;
            }
        }


        return median;
    }

    public static int calculateNumberFailed(double[] notes){
        //your code here
        int FailedGrade = 0;

        for(int i = 0; i < notes.length; i++){
            if(notes[i] < 50){
                FailedGrade++;
            }
        }
        return FailedGrade;
    }

    public static int calculateNumberPassed(double[] notes){
        //your code here
        int PassedGrade = 0;

        for(int i = 0; i < notes.length; i++){
            if(notes[i] >= 50){
                PassedGrade++;
            }
        }
        return PassedGrade;
    }

}