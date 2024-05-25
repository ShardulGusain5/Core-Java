package ProblemSolving;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count =0;
        for(int i =2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count ==1)
        {
            System.out.println("not prime");
        }
        else
        {
            System.out.println("is prime");
        }
    }
}
