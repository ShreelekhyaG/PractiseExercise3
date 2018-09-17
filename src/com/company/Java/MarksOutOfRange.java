package com.company.Java;

class MarksOutOfRange extends Exception{
    public MarksOutOfRange(int num){
        super(String.valueOf(num));
    }
}
