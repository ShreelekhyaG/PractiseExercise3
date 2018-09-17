package com.company.Java;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;

public class DateDisplay3 {
    public static void main(String[] args){
        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("EEE dd/MM/yyyy");
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        System.out.println("First date of week: "+format.format(c.getTime()));
        for(int i=0; i<6; i++)
        {
            c.add(Calendar.DATE, 1);
        }
        System.out.println("Last date of week: "+format.format(c.getTime()));
    }
}
