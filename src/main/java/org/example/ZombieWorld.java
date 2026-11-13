package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieWorld {
    private final int t;
    public ZombieWorld(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter no.of test-cases : ");
        t=scan.nextInt();
        int v=t;
        while(v-->0){
            System.out.println("Enter no. of Zombies : ");
            int n=scan.nextInt();
            System.out.println("Enter maximum time : ");
            int time=scan.nextInt();
            int[] z=new int[n];
            System.out.println("Enter zombie health : ");
            for(int i=0;i<n;i++){
                z[i]=scan.nextInt();
            }
            Arrays.sort(z);
            System.out.println("Enter the initial energy : ");
            int r=scan.nextInt();
            System.out.println("Enter the min energy : ");
            int d=scan.nextInt();
            if(n>time){
                System.out.println("NO");
                return;
            }
            for(int i=0;i<n;i++){
                if(z[i]<=r){
                    r+=r-z[i];
                }
                else{
                    System.out.println("NO");
                    return;
                }
            }
            if(r>=d) System.out.println("YES");
            else System.out.println("NO");
        }
    }


}
