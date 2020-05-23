//Raja Hammad Mehmood
// This program is going to take a question from the user and then give an answer from a limited number of selections.
import java.util.Scanner;


public class Magic8Ball {

    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        String question;// variable for taking the question by the user
        System.out.println("enter the question");
        question= scanner.nextLine();
        String[] answers = { "It is certain" , "It is decidedly so", "Without a doubt" , "Yes definitely" ,
                             "You may rely on it" , "As I see it yes", "Most likely" , "Outlook good" , "Yes, Signs point to yes", "Reply hazy try again", "Ask again later", " Better not tell you now", " Can't predict now"," Concentrate and ask again", " Don't count on it", " My reply is no", " My sources say no", " Outlook not so good", " Very doubtful"
                           };
                    System.out.println("len" + answers.length);          

        int i = (int)(Math.random()*20)+1; // generates a random answer
        System.out.println(answers[i-1]);// prints the answer





    }

}
