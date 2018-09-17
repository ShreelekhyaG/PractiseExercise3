package com.company.Java;

public class Exceptions9 {
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        try{
            int[] negArr=new int[-1];
        }
        catch (NegativeArraySizeException e){
            System.out.println(e+" "+e.getMessage());
        }
        try{
            System.out.println(arr[20]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e+" "+e.getMessage());
        }
        try{
            String s=null;
            System.out.println(s.length());
        }
        catch (NullPointerException e){
            System.out.println(e+" "+e.getMessage());
        }
    }
}
