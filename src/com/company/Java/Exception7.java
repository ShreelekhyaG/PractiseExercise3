package com.company.Java;

public class Exception7 {
    public static void main(String[] args){
        try{
            throw new MyException("string arg");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Reached finally");
        }
    }
}
