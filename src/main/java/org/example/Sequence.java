package org.example;

import java.util.Scanner;

public class Sequence {
    private final int n;
    private final int[] arr;

    public Sequence(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter no.of Elements in the array : ");
        n=scan.nextInt();
        arr=new int[n];
        System.out.println("Enter the array Elements : ");
        for (int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int[] dp=new int[n];
        dp[0]=1;
        int ans=1;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                dp[i]=dp[i-1]+1;
                ans=Math.max(ans,dp[i]);
            }
            else{
                dp[i]=1;

            }

        }
        System.out.println(ans);
    }


}
