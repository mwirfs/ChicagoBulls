package com.example;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args)
    {
        System.out.println("Chicago Bulls 2015-2016 regular season stats");
        //sorted by points

        double [] points = {20.9, 16.5, 16.4, 11.8, 9.4, 8.6, 7.5, 7.2, 7.1, 7.0, 6.5, 5.3, 4.3, 3.8, 3.4, 1.9 };
        double [] rebounds = {5.3, 11.0, 3.4, 5.5, 2.4, 6.9, 2.3, 2.7, 1.5, 5.4, 2.3, 3.1, 8.8, 1.7, 3.3, 1.6};
        double [][] top3 = new double[][] {{ 45.2, 43.3, 42.5},
                                        {2.3, 2.3, 2.4} };

        double totalpts = 0;
        for (int i = 0; i < points.length; i++)
        {
             totalpts += points[i];
        }
        System.out.println("The average amount of points scored per player was " + totalpts/points.length);

        double totalreb = 0;
        for (int i = 0; i < rebounds.length; i++)
        {
             totalreb += rebounds[i];
        }
        System.out.println("The average amount of rebounds per player was " + totalreb/points.length);

        System.out.println("The top three percentage 3 point shooters were ");
        System.out.println("E'Twaun Morre: " + top3[0][0] + "%");
        System.out.println("Justin Holiday: " + top3[0][1] + "%");
        System.out.println("Doug McDermott: " + top3[0][2] + "%");


        double top3avg = 0;
        for (int i = 0; i <top3.length; i++)
        {
            top3avg += top3[1][i];
        }
        System.out.println("The average amount of rebounds for the top 3 percentage 3 point shooters was " + top3avg/top3.length);

        System.out.println("Enter the number of points scored by Jimmy Butler");
        Scanner input1 = new Scanner(System.in);
        int butlerpts = input1.nextInt();

        System.out.println("Enter the number of points scored by Derrick Rose");
        Scanner input2 = new Scanner(System.in);
        int rosepts = input2.nextInt();

        if (butlerpts > rosepts)
        {
            System.out.println("Jimmy Butler was the better player");
        }
        else
        {
            System.out.println("Derrick Rose was the better player");
        }

    }
}