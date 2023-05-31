package Quiz;

import java.util.Random;
import java.util.Scanner;

public class Random_number {
    String name;
    String start;
    int userGuess;
    int count;
    Scanner input =new Scanner(System.in);
    Random random =new Random(); int rand=random.nextInt(20);

    public void goOn(){
        System.out.println();
        System.out.println("Continue Playing \ny/n: ");
        String goon=input.next();

        if(goon.equals("y")){
            System.out.println("Welcome To The Tiki Quiz");
            userDisplay();
        }else {
            System.out.println("Goodbye See You Soon........");
        }
    }

    public void userDisplay(){
        welcome();
        if(start.equals("y")){
            //System.out.println("Random Number: "+rand);
            AnswerValid();
        } else if (start.equals("n")){
            System.out.println("Goodbye..........");
        } else {
            System.out.println("wrong input Goodbye..........");
        }
    }

    public void AnswerValid(){
        count=0;
        while(count<=3){
            userInput();
            count++;
            if(userGuess==rand){
                System.out.print("\nCongratulation "+name+" \nyou won on your "+count+" try");
                break;
            }
            else if (userGuess< rand) {
                System.out.print("Guess a higher number");
            }
            else if (userGuess> rand) {
                System.out.print("Guess a lower number");
            }
        }
        if(count>=3){
            System.out.println();
            System.out.println("\n"+name+"\nGame Over\nThe answer was => "+rand);
        }
        goOn();
    }

    public void userInput(){
        System.out.print("\nGuess a number => ");
        userGuess =input.nextInt();
    }

    public void welcome(){
        System.out.println("Welcome To The Tiki Quiz");
        System.out.print("Please Enter Your Name => ");
        name =input.nextLine();
        System.out.print("Hi "+name+ " can we begin the game? \ny / n => ");
        start =input.nextLine();
    }
    public static void main(String[] args) {
        Random_number m =new Random_number();
        //m.welcome();
        m.userDisplay();
    }
}