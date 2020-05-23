//Raja Hammad Mehmood
// This program would take number of different prize options by the user and then compute the average number of purchases needed to obtain a complete set of prizes.
import java.util.Scanner;


public class PrizeCollectorSim {

    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        int prizenumber;// the random prize number generated
        int noofprize; // number of prizes available inputted by the user
         System.out.println(" how many prizes are available");
         noofprize=scanner.nextInt();
        int[] prize = new int[noofprize];

        double averagepurchase;// computes the average purchase
        boolean flag=true; // checking variable 
        int x;// loop controlling variable
        int z;// loop controlling variable
        z=0;
        int count; // counts the time purchases are done
        count=0;
        for (int y=0 ; y<5 ; y++ ) {  //runs the whole program for 5 times  
          for (int u=0 ; u<prize.length ; u++){ // sets the prize arrays values to zero
            prize[u]= 0;
          }
          z=0;
        while (true){
         count=count+1;
        prizenumber = (int)(Math.random()*noofprize)+1; // generates a random answer
         flag=true;
         boolean condition=true;
         for(x=0 ; x<prize.length ; x++){ // checks if the prize value is redundant
         if (prizenumber== prize[x] ) {
             flag=false;
         }
    }
      if (flag != false){
        prize[z]=prizenumber;
        
        z=z+1;
      }
       for(int i=0 ; i<prize.length ; i++){ // checks when all of the prizes are recieved
         if (prize[i]==0 ) {
            condition=false;
        
        }
    }
   
    if (condition==true){ // breaks out of while loop when all the different prizes are filled in the array
        
        break;
    }
    
}
        }

averagepurchase=(double)(count)/5 ;// calculates the average
System.out.println("average number of purchases needed to obtain a complete set of prizes are "+ averagepurchase);
    }
}