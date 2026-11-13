package org.example;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Rat {
    private final int n;
    private final char[][] grid;
    private final int r;
    private final int[][] loc;

    public Rat(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the matrix : ");
        n=scan.nextInt();
        grid=new char[n][n];
        System.out.println("Enter the matrix value");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=scan.next().charAt(0);
            }
        }
        System.out.println("Enter no. of rats : ");
        r= scan.nextInt();
        loc=new int[r][2];
        System.out.println("Enter rat location : ");
        for(int i=0;i<r;i++){
            loc[i][0]=scan.nextInt()-1;
            loc[i][1]=scan.nextInt()-1;
            char c=grid[loc[i][0]][loc[i][1]];
            if(c=='X') {
                System.out.println("Impossible placing of Rats at closed Location");
                return;
            }
        }

        System.out.println(helper());
    }
    public boolean helper(){
        Queue<int[]> q=new ArrayDeque<>();
        q.add(loc[0]);
        while(!q.isEmpty()){
            int[] curr=q.peek();
            q.remove();

            int[] dr=new int[]{-1,0,1,0};
            int[] dc=new int[]{0,-1,0,1};
            for(int i=0;i<4;i++){
                int nr=curr[0]+dr[i];
                int nc=curr[1]+dc[i];
                if(nr>=0 && nr<n && nc>=0 && nc<n && grid[nr][nc]=='O'){
                    grid[nr][nc]='x';
                    q.add(new int[]{nr,nc});
                }
            }

        }
        for(int i=0;i<r;i++){
            if(grid[loc[i][0]][loc[i][1]]=='O') return false;
        }
        return true;
    }



}
