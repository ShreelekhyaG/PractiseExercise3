package com.company.Java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDisplay3 {
    public String[] getDate(Date date){
        if(date==null)
            return null;
        SimpleDateFormat format=new SimpleDateFormat("EEE dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.set(date.getYear(), (date.getMonth() - 1), date.getDate());
        calendar.getTime();
        calendar.set(calendar.DAY_OF_WEEK, calendar.MONDAY);
        String[] result=new String[2];
        result[0]=format.format(calendar.getTime());
        System.out.println("First date of week: "+format.format(calendar.getTime()));
        for(int i=0; i<6; i++)
        {
            calendar.add(calendar.DATE, 1);
        }
        result[1]=format.format(calendar.getTime());
        System.out.println("Last date of week: "+format.format(calendar.getTime()));
        return result;
    }
}
