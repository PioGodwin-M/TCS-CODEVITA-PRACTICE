package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Rock {
    private final int n;
    private final int k;
    public Rock(){

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Sample size : ");
        n=scan.nextInt();
        System.out.println("Enter the Range Queries Size : ");
        k=scan.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the sample values : ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        int[][] q=new int[k][2];
        System.out.println("Enter the range queries : ");
        for(int i=0;i<k;i++){
            q[i][0]=scan.nextInt();
            q[i][1]=scan.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(q,(a,b)->a[0]-b[0]);
        for(int i=0;i<k;i++){
            int l=q[i][0];
            int r=q[i][1];
            int ans=0;
            for(int j=0;j<n;j++){
                if(arr[j]>=l && arr[j]<=r){
                    ans++;
                }
               else if(arr[j]<l) break;
            }
            System.out.println(ans);

        }

    }


}
