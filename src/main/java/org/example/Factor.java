package org.example;

import java.util.Scanner;

public class Factor {
    private final int n;
    private final int k;
    public Factor(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        n= scan.nextInt();
        System.out.println("Enter the value of k : ");
        k=scan.nextInt();
        System.out.println(helper());
    }

    private int  helper(){
        int v=0;
        for (int i=n;i>=1;i--){
            if(n%i==0){
                v++;
                if(v==k) return i;
            }
        }
        return 1;
    }




}
