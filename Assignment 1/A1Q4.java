/*
Student name: Rabea Murad Daoud
Student number: 300164191
*/
import java.util.Scanner;
public class A1Q4 {
    /*
    Playerdata is a method that takes all of the player's data
    then it will calculate his/her bonus code based on their data,
    - Group 1. Players who have been a member of the team for 5 years
    or more and who have participated in more than 55 matches during the regular season.
    - Group 2. Players who have been a member of the team for 5 years or more and who have participated in 55 matches or less during the regular season.
    - Group3. Players who have been a member of the team for less than 5 years, regardless of the number of matches played during the regular season.

    Group 1 will get a bonus code 3
    Group 2 will get a bonus code 2
    Group 3 will get a bonus code 1

    */
    public static int Playerdata(int goals, int assists, int penalties, int matches, int service){
        int code = 0;
        if(goals > 20 || assists > 25 || penalties < 25) {  //checking if they at least pass the basics to have a bonus code
            if (service >= 5 && matches > 55) {             //if that condition isn't met then its 0
                code = 3;
            }
            if (service >= 5 && matches <= 55) {
                code = 2;
            }
            if (service < 5 && service > 0) {               //although in the assignment PDF it says players who has been less than 5 are
                code = 1;                                   //conditional however if I haven't put the && condition and put 0 for everything
            }                                               //we will get 1 when should be 0
        }
        return code;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of the player goals during the season: ");         //in all of these little blocks of code we are asking the user
        int goals = sc.nextInt();                                                               //to input all of the data while checking if they entered a -ive number
        while(goals < 0){                                                                       //to keep asking them
            System.out.print("Enter the number of the player goals during the season: ");
            goals = sc.nextInt();
        }
        sc.nextLine();

        System.out.print("Enter the number of the player assists during the season: ");
        int assists = sc.nextInt();
        while(assists < 0) {
            System.out.print("Enter the number of the player assists during the season: ");
            assists = sc.nextInt();
        }
        sc.nextLine();

        System.out.print("Enter the number of penalties during the season: ");
        int penalties = sc.nextInt();
        while(penalties < 0) {
            System.out.print("Enter the number of penalties during the season: ");
            penalties = sc.nextInt();
        }
        sc.nextLine();

        System.out.print("Enter the number of matches played: ");
        int matches = sc.nextInt();
        while(matches < 0) {
            System.out.print("Enter the number of matches played: ");
            matches = sc.nextInt();
        }
        sc.nextLine();

        System.out.print("Enter the number of years of service: ");
        int service = sc.nextInt();
        while(service < 0) {
            System.out.print("Enter the number of years of service: ");
            service = sc.nextInt();
        }
        sc.nextLine();

        int BonusCode = Playerdata(goals, assists, penalties, matches, service);            //passing the data from the user into playerdata then printing out the player's BonusCode
        System.out.println("The bonus code of this player is: " + BonusCode);
    }


}
