package com.company.Java;

public class MatrixAdd2 {
    public int[][] matrixAddition(int row,int col,int[][] firstMatrix,int[][] secondMatrix){
        int[][] sum=new int[row][col];
        for(int rowIndex=0;rowIndex<row;rowIndex++){
            for(int colIndex=0;colIndex<col;colIndex++){
                sum[rowIndex][colIndex]=firstMatrix[rowIndex][colIndex]+secondMatrix[rowIndex][colIndex];
            }
        }
        return sum;
    }
}
