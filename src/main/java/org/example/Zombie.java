package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Zombie {
    private final int n;
    private final int z;
    private final int[] energy;

    public Zombie(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the initial Energy :");
        n=scan.nextInt();
        System.out.println("Enter no. of Zombies : ");
        z=scan.nextInt();
        energy=new int[z];
        System.out.println("Enter the health of  Zombies ");
        for(int i=0;i<z;i++){
            energy[i]=scan.nextInt();
        }
        Arrays.sort(energy);
        int t=n;
        for(int i=z-1;i>=0;i--){
            if(t>=energy[i]){
                t-=((energy[i]%2)+energy[i]/2);
            }
            else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

}
