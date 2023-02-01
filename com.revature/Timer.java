import java.util.Scanner;

public class Timer{

    int startTime;
    String stopTime;
    int timerEnd;
    String upOrDown; // Scanner

    public void intro(Scanner sc){
        System.out.println("How many seconds would you like to start with?");
        System.out.println("You can type exit to end the program.");
        String input = sc.nextLine();

        startTime = Integer.parseInt(input);

        System.out.println("Do you want to count down or do you want to count up?"
        +"\nPlease enter \"Count Down\" to reduce time or \"Count Up\" to increase time");

        upOrDown = sc.nextLine();
        if(upOrDown.equalsIgnoreCase("Count Down")){

        }else if(upOrDown.equalsIgnoreCase("Count Up")){
            System.out.println("When would you like the time to stop?");
            stopTime = sc.nextLine();
            timerEnd = Integer.parseInt(stopTime);
            System.out.println("Counting upwards from " + startTime + " to " + timerEnd);
            System.out.println(countUpwards());
        }else{
            System.out.println("Sorry I didnt' understand.");
        }

    }

    public String countUpwards(){
        String output = "";
        //All loops have a starting point and a ending point. 
        while(startTime < timerEnd){
            output = "Timer Started: ";
            System.out.println(startTime++);
            output = startTime + "\nbeep beep beep";

        }
        return output;
    }


}