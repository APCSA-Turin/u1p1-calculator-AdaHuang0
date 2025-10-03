package com.example;
import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW   
        
        double tipCost = Math.round(cost * (percent )) / 100.00;
        double totalCost = (cost + tipCost);
        double costPerPerson = Math.round((cost / people) * 100.00)  / 100.00;
        double tipPerPerson = Math.round(tipCost / people * 100.00)  / 100.00;
        double totalPerPerson = Math.round((cost * (percent * 0.01) + cost) / people * 100.00) / 100.00;
        // I learned about Math.round() from https://www.w3schools.com/java/ref_math_round.asp
        // I learned about rounding to 2 decimal places from  https://stackoverflow.com/questions/8825209/rounding-decimal-points

        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + tipCost + "\n" +
                       "Total Bill with tip: $" + totalCost + "\n" +
                       "Per person cost before tip: $" + costPerPerson + "\n" +
                       "Tip per person: $" + tipPerPerson + "\n" +
                       "Total cost per person: $" + totalPerPerson + "\n" +
                       "-------------------------------\n";

        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {
       //String result = "Extra credit not implemented";
        boolean condition = true;
        Scanner scan = new Scanner(System.in);
        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 
        double tipCost = Math.round(cost * (percent )) / 100.00;
        double totalCost = (cost + tipCost);
        double costPerPerson = Math.round((cost / people) * 100.00)  / 100.00;
        double tipPerPerson = Math.round(tipCost / people * 100.00)  / 100.00;
        double totalPerPerson = Math.round((cost * (percent * 0.01) + cost) / people * 100.00) / 100.00;

        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + tipCost + "\n" +
                       "Total Bill with tip: $" + totalCost + "\n" +
                       "Per person cost before tip: $" + costPerPerson + "\n" +
                       "Tip per person: $" + tipPerPerson + "\n" +
                       "Total cost per person: $" + totalPerPerson + "\n" +
                       "-------------------------------\n" + "Items ordered:\n";

        
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops
        String ans = "";
        while (condition == true) {
            //enter your code here

            System.out.println("Enter an item name or type '-1' to finish");
            ans = scan.nextLine();
            //System.out.println(ans);
            if(ans.equals("-1")) {
                // I learned about .equals() from https://medium.com/@AlexanderObregon/understanding-the-difference-between-equals-and-in-java-10a075326720
                condition = false;
                result += "-------------------------------\n";
            } else {
                result += ans + "\n";
            }
        }

        return result;
    }
    
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=10; 
        int percent=8;
        double cost=10.5;              
        //System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));
    }
}
        
