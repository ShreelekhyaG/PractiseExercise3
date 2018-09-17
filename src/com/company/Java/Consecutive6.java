package com.company.Java;

public class Consecutive6 {
    public String checkConsecutive(String input){
        if(input==null)
            return null;
        String[] nums=input.split(",");
        int[] numArray=new int[nums.length];
        for(int index=0;index<nums.length;index++)
            numArray[index]=Integer.parseInt(nums[index]);
        for(int index=0;index<nums.length-1;index++){
            int value=numArray[index];
            boolean inc=false,dec=false;
            if(value+1==numArray[index+1])
            {
                inc=true;
                if(dec==true)
                    return "not consecutive";
                else
                    continue;
            }
            else if(value-1==numArray[index+1]){
                dec=true;
                if(inc==true)
                    return "not consecutive";
                else
                    continue;
            }
            else
                return "not consecutive";

        }
        return "consecutive";
    }
}
