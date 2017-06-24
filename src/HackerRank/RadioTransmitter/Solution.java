package HackerRank.RadioTransmitter;

/**
 * Created by Akashravindranath on 6/23/17.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }

        Helper(x, k);
    }

    private static void Helper(int[] locations, int range){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : locations){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        int totalDistance = max - min;
        totalDistance = totalDistance - 1;
        range = (range*2) + 1;
        int count = ( totalDistance / range ) + 1;

        System.out.println(count);
    }
}

