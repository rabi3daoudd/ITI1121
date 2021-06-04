/*
Student name: Rabea Murad Daoud
Student number: 300164191
*/
import java.util.Scanner;
public class A1Q1{

    public static int[] talk(String[] array, int n) {
        int[] result = new int[2];
        //your code here
        while(array != null) {                         //checking if the array is null or not
            int index = 0;
            int elem = array[0].length();              //getting the length of the first element and putting it into a
            for (int i = 1; i < array.length; i++) {   //variable then looping through the array then checking if the
                if (array[i].length() > elem) {        //sentence is bigger than the first sentence for which then if that's
                    index = i;                         //the case keeping track of the index then updating the elem with
                    elem = array[i].length();          //with the length of the the new longest sentence until the longest
                }                                      //sentence is reached
            }
            int longest = array[index].length();       //adding the length of the longest sentence into the array result
            result[0] = longest;

            int counter = 0;
            for (String s : array) {                   //looping through the array and if an element's length is equals
                if (s.length() == longest) {           //to our longest sentence length then counting that and then
                    counter++;                         //appending that to the the second element in result.
                }
            }
            result[1] = counter;
            break;                                     //breaking out of the while loop so it isn't infinite and that we
        }                                              //checked that array isn't null
        return result;                                 //returning result
    }


    public static void main(String[] args) {
        //your code here

        //call the method talk here
        Scanner sc = new Scanner(System.in);    // opening the scanner

        System.out.print("Please enter the number of sentences: ");     //asking the user to enter the number of sentences
        int NumOfSentences = sc.nextInt();                              //storing the input
        sc.nextLine();

        System.out.println("Please enter an array of " + NumOfSentences + " sentences separated by commas: ");  //asking the user to enter the sentences then storing them
        String sentences = sc.nextLine();
        sc.close();

        String delimiter = ",";
        String[] ArrayOfSentences = sentences.split(delimiter);     //splitting the sentences given into an array with a delimiter

        //display your result here
        int[] newResult = talk(ArrayOfSentences,NumOfSentences);    //calling the method talk with user's input

        System.out.println("The length of the longest sentence is: " + newResult[0]);   //printing the output from talk to what the length of the longest sentence is
        System.out.println("Sentences of this length are repeated : " + newResult[1] + " time(s)");     //and how many that length is repeated

    }

}
