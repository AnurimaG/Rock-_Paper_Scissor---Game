import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissor
{
    public static void main(String [] args)
    {
        //Display the game name
        System.out.println("  WELCOME TO ROCK - PAPER - SCISSOR GAME");
        System.out.println("******************************************");
        System.out.println("     ARE YOU READY TO PLAY THE GAME!!");
        System.out.println("          THEN LET'S GET STARTED");
        
        int userinput,computerinput,rock,paper,scissor,count=0,count1=0;
        char ask;
        do{
        //Computer choice
        Random rnd= new Random();
        
        //User input
        Scanner s = new Scanner (System.in);
        System.out.println("How many number of rounds you would like to play");
        int num=s.nextInt();
        for(int i=0;i<num;i++)
        {
        System.out.println("Choose from the below options ");
        System.out.println("If you want to choose Rock then give input as 0");
        System.out.println("If you want to choose Paper then give input as 1");
        System.out.println("If you want to choose Scissor then give input as 2");
        userinput = s.nextInt();
        
        while(userinput>2)
        {
          System.out.println(" ");
          System.out.println("Invalid input please try again");
          System.out.println("Choose your option once again ");
          System.out.println("If you want to choose Rock then give input as 0");
          System.out.println("If you want to choose Paper then give input as 1");
          System.out.println("If you want to choose Scissor then give input as 2");
          userinput = s.nextInt();
          System.out.println(" ");
        }
        
        //User selection
        if(userinput == 0)
        {
            System.out.println("Your Choice is Rock");
            System.out.println(" ");
        }
        else{
            if (userinput == 1)
        {
            System.out.println("Your Choice is Paper");
            System.out.println(" ");
        }
            else
        {
            System.out.println("Your Choice is Scissor");
            System.out.println(" ");
        }
        }
        
        //Computer selection
        computerinput=rnd.nextInt(3);
        if(computerinput == 0)
        {
            System.out.println("Computer Choice is Rock");
            System.out.println(" ");
        }
        else
        {
            if(computerinput == 1)
            {
                System.out.println("Computer Choice is Paper");
                System.out.println(" ");
            }
            else
            {
                System.out.println("Computer Choice is Scissor");
                System.out.println(" ");
            }
        }
        
        //Result Selection
        if(userinput == computerinput)
        {
            System.out.println("             Draw match!");
            System.out.println("*************************************");
            System.out.println(" ");
        }
        else if (userinput==0 && computerinput ==1)
        {
           System.out.println("Computer Won ! Better luck next time");
           System.out.println("************************************");
           System.out.println(" ");
           count++; 
        }
        else if (userinput==0 && computerinput ==2)
        {
           System.out.println("      You Won ! Congratulation");
           System.out.println("************************************");
           System.out.println(" ");
           count1++; 
        }
        else if (userinput==1 && computerinput ==0)
        {
           System.out.println("      You Won ! Condratulation");
           System.out.println("************************************");
           System.out.println(" ");
           count1++;
        }
        else if (userinput==1 && computerinput ==2)
        {
           System.out.println("Computer Won! Better luck next time");
           System.out.println("************************************");
           System.out.println(" ");  
           count++;
        }
        else if (userinput==2 && computerinput ==0)
        {
           System.out.println("Computer Won ! Better luck next time");
           System.out.println("************************************");
           System.out.println(" ");
           count++;
        }
        else 
        {
           System.out.println("      You Won ! Congratulation");
           System.out.println("************************************");
           System.out.println(" ");
           count1++;
        }
      }
      System.out.println("   ");
      System.out.println("Number of times Computer won " + count);
      System.out.println("   ");
      System.out.println("Number of times You won " + count1);
      System.out.println(" ");
      if(count1>count)
      {
        System.out.println("   ");
        System.out.println("You played total " + num + " rounds , Finally you won . Congratulations !!! "); 
        System.out.println(" ");
      }
      else if(count>count1)
      {
        System.out.println("   ");
        System.out.println("You played total " + num + " rounds , Computer Won . Better luck next time !!! ");
        System.out.println(" ");
      }
      else
      {
          System.out.println("It's a draw match");
          System.out.println(" ");
      }
      Scanner sc = new Scanner (System.in);
      System.out.println("Would you like to play it again ?? Y/N");
      ask = sc.next().charAt(0);
      System.out.println(" ");
     }
     while(ask =='Y' || ask == 'y');
     System.out.println("***Thanks for playing !! Vist again***");
   }
}
