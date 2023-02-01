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
        while(!input.equalsIgnoreCase("exit")){
        startTime = Integer.parseInt(input);

        System.out.println("Do you want to count down or do you want to count up?"
        +"\nPlease enter \"Count Down\" to reduce time or \"Count Up\" to increase time");

        upOrDown = sc.nextLine();
        if(upOrDown.equalsIgnoreCase("Count Down")){
            System.out.println(countDown());
        }else if(upOrDown.equalsIgnoreCase("Count Up")){
            System.out.println("When would you like the time to stop?");
            stopTime = sc.nextLine();
            timerEnd = Integer.parseInt(stopTime);
            System.out.println("Counting upwards from " + startTime + " to " + timerEnd);
            System.out.println(countUpwards());
        }else{
            System.out.println("Sorry I didnt' understand.");    
        }

        if(input.equalsIgnoreCase("exit")){
            break;
        }else{
            System.out.println("How many seconds would you like to start with?");
            System.out.println("You can type exit to end the program.");
            input = sc.nextLine();
            // continue; will not work as it will fall into the else block of the
            // if-else statment above this one
        }
    }

}

    public String countUpwards(){
        String output = "";
        //All loops have a starting point and a ending point. 
        // while(startTime < timerEnd){
        //     output = "Timer Started: ";
        //     System.out.println(startTime++);
        //     output = startTime + "\nbeep beep beep";
        // }

        //for(starting point; condition; increament or decrement){

       //   }

        for(int index = startTime; index <= timerEnd; index++ ){
            output = "Timer Started: ";
            System.out.println(index);
            
        }
        output = "beep beep beep";
        return output;
    }


    public String countDown(){
        String output = "";
        //Will always execute at least 1 time before checking the condition. 
        // do{
        //     output = "Timer Started: ";
        //     System.out.println(startTime--);
        //     output = startTime + "\nbeep beep beep";
        // }while(startTime > 0); // >= starttime till -1
        System.out.println("Timer Started: ");
        for(int i = startTime; i >= 0; i--){
           
            System.out.println(i);
            // if(i % 2 == 0){
            //     System.out.println(i);
            // }

        }
        output = "beep beep beep";
        return output;
    }

}