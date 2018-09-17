package com.company.Java;

public class ChessBoard5 {
    public static void main(String[] args){
        int[][] chess=new int[8][8];
        for(int row=0;row<8;row++){
            for(int col=0;col<8;col++){
                if(row%2==0){
                    if(col%2==0)
                        System.out.print("WW|");
                    else
                        System.out.print("BB|");
                }
                else{
                    if(col%2!=0)
                        System.out.print("WW|");
                    else
                        System.out.print("BB|");
                }
            }
            System.out.println();
        }
    }


}
