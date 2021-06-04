/*
Student name: Rabea Murad Daoud
Student number: 300164191
*/
import java.util.Scanner;

public class A1Q3 {

    public static void main(String[] args) {
        //your code here
        Scanner sc = new Scanner(System.in);
        String delimiter = ",";

        System.out.println("Please enter the items names separated by commas: ");          //asking the user for their input
        String items = sc.nextLine();                                                      //then splitting them into a String Array
        String[] itemsArray = items.split(delimiter);

        System.out.println("Please enter the items quantities separated by commas: ");
        String quantities = sc.nextLine();
        String[] TempQuantitiesArray = quantities.split(delimiter);

        int[] quantitiesArray = new int[TempQuantitiesArray.length];                      //Here I am converting the quantaties into and array of Int
        for(int i = 0; i < TempQuantitiesArray.length; i++){
            quantitiesArray[i] = Integer.parseInt(TempQuantitiesArray[i]);
        }
        int i = 0;                                                                        // initializing 2 variables
        int j = 0;
        while(i < itemsArray.length && j < quantitiesArray.length){               //first while loop will pass the input into "Class Item" as long as the variables
            Item Item = new Item(itemsArray[i++],quantitiesArray[j++]);           //are less than the array's length which means in a situation where array1 == array2
            Item.display();                                                       //then it will only use this loop, or this will keep looping until one of the array gets to 0
        }                                                                         //in that case we have two more while loops which will check for that, which means if array1 is bigger
        while(i < itemsArray.length){                                             //then we go into the second while loop and we will be passing 0 with the excess of array1 and we have
            Item Item = new Item(itemsArray[i++],0);                      //a third while loop for the exact oppisit where array2 is bigger so we will pass unkown with the quality
            Item.display();
        }
        while(j < quantitiesArray.length) {
            Item Item = new Item("unknown", quantitiesArray[j++]);
            Item.display();
        }

    }
}

// Create a class Item with
// name and quantity as attributes
class Item {

    private String name;
    private int quantity;

    // Item class constructor
    Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    // display() method to display Item information
    public void display() {
        System.out.print(this.name + " : " + this.quantity+" - ");
    }
}