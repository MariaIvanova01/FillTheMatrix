package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");
        String pattern = input[1];
        int rows =Integer.parseInt(input[0]);

        int[][] matrix = new int[rows][rows];

        if (pattern.equals("A")){
            patternA(rows,matrix);
        }else if (pattern.equals("B")){
            patternB(rows,matrix);
        }

        for (int row = 0; row < rows; row++) {
            for (int columns = 0; columns < rows; columns++) {
                System.out.print(matrix[row][columns] + " ");
            }
            System.out.println();
        }


    }
    public  static void patternA(int rows, int[][] matrix){
        int numToIncrement = 1;
        for (int columns = 0; columns < rows; columns++) {
            for (int row = 0; row < rows; row++) {
                matrix[row][columns] = numToIncrement;
                numToIncrement++;
            }
        }
    }
    public  static void patternB(int rows, int[][] matrix){
        int numToIncrement = 1;
        for (int columns = 0; columns < rows; columns++) {
            if (columns % 2 == 0) {
                for (int row = 0; row < rows; row++) {
                    matrix[row][columns] = numToIncrement;
                    numToIncrement++;
                }
            }else{
                for (int row = rows - 1; row >= 0 ; row--) {
                    matrix[row][columns] = numToIncrement;
                    numToIncrement++;
                }
            }
        }
    }
}
