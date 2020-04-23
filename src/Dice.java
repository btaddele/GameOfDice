import java.util.Random;
import java.util.Scanner;
/*
* create integer and string datatypes with values
* print a "lets play" message on the console
* prompt the user to enter their answer
* Import scanner and random class for the the user and the system to select two random numbers and put the numbers in the values we created
* create a loop and write two conditions, inorder for the loop to continue
* the random number should be between 1-6
* print out the two numbers that the system picked
* if both values are equal to 1, print their sum as 25
* else if one of the value is 1 print their sum as 0, else print the sum of the two values
* Ask the user if they want to pay again
* If the user answered 'NO' or if the sum of the values is greater than 100 close the loop
 */
public class Dice {
    public static void main(String[] args) {
        int input1;
        int input2;
        int score = 0;
        String choice = "yes";
        int sum;
        String Ans;


        System.out.println("Welcome! Let's Play Roll Dice!" );
        Scanner scn = new Scanner(System.in);
        Random rm = new Random();


        while(choice.equalsIgnoreCase("yes") && score <= 100){
            input1 = (rm.nextInt(6)+1);
            input2 = (rm.nextInt(6)+1);
            System.out.println("Your rolls " + input1 + " & " + input2);
            if(input1 == 1 && input2 == 1){
                score = score + 25;
            }
            else if(input1 == 1 || input2 == 1){
                score = score + 0;
            }else {
                score = score + input1 + input2;
            }
            System.out.println("Scores " + score);
            System.out.print("Roll again? ");
            Ans = scn.nextLine();
            if(Ans.equalsIgnoreCase("no")){
                choice = "no";

            }
        }
        if(score > 100){
            System.out.println("You have scored over 100");
        }
        System.out.println("Thank you for playing!");





















    }
}
