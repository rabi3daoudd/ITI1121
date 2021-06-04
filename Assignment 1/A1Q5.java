/*
Student name: Rabea Murad Daoud
Student number: 300164191
*/
import java.util.Scanner;

public class A1Q5{
    public static void main(String[] args){

        int[][] arrayOfArrays;

        //your code here
        Scanner sc = new Scanner(System.in);
        String Question = ("Enter the array of arrays one row per line. Enter an empty line when you are done.\n" +
                "Elements of each row should be separated by commas:");
        System.out.println(Question);                                   //asking the user a question

        String[] DoubleArray = new String[5];                           //since max number of rows a user can input is 5 we can initialize
        int row = 0;                                                    //an array with size of 5

        do { DoubleArray[row] = sc.nextLine();                          //we will keep asking the user for input until two things
            if(DoubleArray[row].isEmpty()){                             //until the user enters an empty line or inputs 5 rows whichever one comes first
                break;
            }
            row++;
        } while(row < 5);
        sc.close();

        String delimiter = ",";
        arrayOfArrays = new int[row][];                                 //we will initiate the array given to us "arrayOfArrays" with the amount of rows the user has input
        for(int i = 0; i < row; i++){                                   //we will loop and split the numbers into a temporary array and then initiate the arrayOfArrays with whatever
            String[] temp = DoubleArray[i].split(delimiter);            //the size of the specific row that we are looping through.
            arrayOfArrays[i] = new int[temp.length];                    //since we have stored them in a String array we must convert it into an int array
            for(int j = 0; j < temp.length; j++){
                arrayOfArrays[i][j] = Integer.parseInt(temp[j]);
            }
        }
        display(arrayOfArrays);                                         //now that we have everything stored and organized we will pass the 2d array into method display
                                                                        //to display it to the user
    }
    public static void display(int[][] arrayOfArrays){

        System.out.println("The array of arrays is: ");
        //your code here
        for(int i = 0; i <arrayOfArrays.length; i++) {                  //loop through the outter layer of the 2d array if you want to think of it that way, which will tell us how many
            System.out.print("Row " + i + ": ");                        //rows there is, we will make a nested for loop and then loop through that array and then print the numbers
            for (int j = 0; j < arrayOfArrays[i].length; j++) {         //one of the challenges encountered was that I had used println rather than print which resulted in having them
                System.out.print(arrayOfArrays[i][j] + " ");            //in each line which then caused a problem, just a note so won't fall into that mistake again.
            }
            System.out.println();                                       // adding an empty line
        }
    }
}