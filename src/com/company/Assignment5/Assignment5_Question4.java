/*
You are given an N*M grid. Each cell (i,j) in the grid is either blocked, or empty.
The rat can move from position (i,j), down or right on the grid. Initially rat is on the
position (1,1). It wants to reach position (N,M). Find the rightmost path through
which, rat can reach this position. A path is rightmost, if the rat is at position (i,j),
it will always move to (i,j+1), if there exists a path from (i,j+1) to (N,M).
Eg: 5 4             Output: 1 0 0 0
    OXOO                    1 1 0 0
    OOOX                    0 1 0 0
    OOXO                    0 1 1 1
    XOOO                    0 0 0 1
    XXOO
*/
package com.company.Assignment5;

import java.util.Arrays;

public class Assignment5_Question4 {
    public static void main(String[] args) {
        int[][] maze = {{1, 0, 1, 1},
                        {1, 1, 1, 0},
                        {1, 0, 0, 1},
                        {0, 1, 1, 1},
                        {0, 0, 1, 1}};
        int[][] sol = new int[maze.length][maze[0].length];
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length ; j++) {
                sol[i][j] = 0;
            }
        }
        if(maze_Solu(maze, sol, 0,0)){
            System.out.println(Arrays.deepToString(sol));
        }
        else{
            System.out.println("No solution");
        }
        //System.out.println(Arrays.deepToString(sol));

    }

    private static boolean maze_Solu(int[][] maze, int[][] sol, int i, int i1) {
        if(i == maze.length-1 && i1== maze[0].length-1 && maze[i][i1]==1){
            sol[i][i1]=1;
            //System.out.println(Arrays.deepToString(sol));
            return true;
        }
        if(issafe(maze,i,i1)){
            sol[i][i1]=1;
            if(maze_Solu(maze,sol,i,i1+1)){
                return true;
            }if(maze_Solu(maze,sol, i+1, i1)){
                return true;
            } else{
                sol[i][i1]=0;
            }

        }
        return false;
    }

    private static boolean issafe(int[][] maze, int i, int i1) {
        return (i>=0 && i< maze.length && i1>=0 && i1<maze[0].length && maze[i][i1]==1);
    }
}
