package utils;

import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    private Scanner scan = new Scanner(System.in);

    public void displayList(ArrayList<String> list, String msg){
        System.out.println(msg);
        for (String option : list) {
            System.out.println(option);
        }

    }
    public String promptText(String msg){
        System.out.println(msg);
        String input = scan.nextLine();
        return input;
    }
    public int promptNumeric(String msg){

        String input = promptText(msg);         //Give brugere et sted at placere sit svar og vente på svaret
        int number = Integer.parseInt(input);       //Konvertere svaret til et tal
        return number;
    }
    public int promptChoice(ArrayList<String> optionslist, String msg) {//["Gin&Tonic", "Beer","Vine" ]

        displayList(optionslist, "");
        int input = promptNumeric("");//1
        // return optionslist.get(input-1);
        return input;
    }
        public void displayMsg (String msg) {
            System.out.println(msg);
        }
        // todo: initialize the Scanner attribute

        // todo: write displayMsg method
        //  1) use System.out.println to display the message parametre to the user

        // todo: write promptNumeric method
        //  1) display the message by calling the displayMsg method in this class
        //  2) prompt the user for a numeric value (Integer), assign the input to a local variable
        //  3) BEWARE THE SCANNER BUG. consume dangling newline character
        //  4) return the input


        // todo: write the promptText method
        //  1) display the message by calling the displayMsg method in this class
        //  2) prompt the user for a text value (String), assign the input to a local variable
        //  3) return the input


        // todo:  write the promptChoice method
        //  1) display the message by calling the displayMsg method in this class
        //  2) write a for loop and write each element of the list prefixed with a numeric value
        //  3) initialize an int variable 'choice' with the value of 0 (will hold the user's choice)
        //  4) write a conditional to check if the scanner has an int
        //   In the true clause...
        //    a. prompt the user for a numeric value using the promptNumeric method of this class - and assign the input to a local variable
        //    b. return the input
        //   todo later... Input validation
        //    In the false clause...
        //    c. clear the scanner buffer
        //    d. create a recursive call with appropriate message
        //   todo later...
        //    e. place the return statement (4.b) in a nested condition that checks that the choice is within the range of the passed list
        //    f. create a recursive call if it is not
        //
    }

