//Raja Hammad Mehmood
//This program would make 8 bars of random heights with some space in between and the tallest bar could touch the top
import java.awt.*;
import javax.swing.*;
public class BarChart {
    public static void main(String[]args) {
        Paint.buildWindow("Raja Hammad", 0, 0, 1150, 1000, Color.WHITE);// background
           
                int [] bar = new int [8]; // 8 bars
                for (int i = 0 ; i < 8; i++) {
                    bar [i] = (int) (Math.random()*1000)+1;
                }
                 
                  for(int i = 0; i < bar.length; i++){
                   Paint.setColor( Color.RED);
                   Paint.fillRect(150*i,1000 - bar[i], 100, bar[i]); // draws rectangle of random height.
                  }

    }
}




