/*
Student name: Rabea Murad Daoud
Student number: 300164191
*/
import java.util.Scanner;

public class A1Q2{

    public static int myCalc(int[] intArray, int n){
        int R;
        //your code here
        int PosElemCounter = 0;         //initiating a variable to count the +ive elements
        int NegElemCounter = 0;         //initiating a variable to count the -ive elements

        for (int i : intArray) {        //Looping through the numbers of the array
            if (i > 0) {                //checking the value of the number whether
                PosElemCounter++;       //the number is +ive or -ive then incrementing
            }                           //to where it belongs.
            if (i < 0) {
                NegElemCounter++;
            }
        }
        R = PosElemCounter - NegElemCounter; //checking the number of +ive elem minus the -ive elem
        return R;
    }

    public static void main(String[] args){
        //your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter an array of values separated by commas: ");  //asking the user for their input
        String ArrayOfNum = sc.nextLine();


        String delimiter = ",";
        String[] NumArray = ArrayOfNum.split(delimiter); //splitting the user input into an array

        int num = NumArray.length;
        int[] intArray = new int[num];
        for(int i = 0; i < num; i++){
            intArray[i] = Integer.parseInt(NumArray[i]); //since the array is a String we are creating a new array
        }                                                //that converts it into an int array.


        System.out.println("The number of positive elements minus the number of negative elements is: " + myCalc(intArray,num));

    }
}