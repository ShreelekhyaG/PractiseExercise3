package com.company.Test;

import com.company.Java.DateDisplay3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class DateDisplay3Test {
    DateDisplay3 dateDisplay3;
    @Before
    public void setUp() throws Exception {
        dateDisplay3=new DateDisplay3();
    }

    @After
    public void tearDown() throws Exception {
        dateDisplay3=null;
    }

    @Test
    public void getDate() throws ParseException {
        Date date=new Date(2018,9,18);
        String[] result={"Mon 17/09/2018","Sun 23/09/2018"};
        assertEquals("failed",result,dateDisplay3.getDate(date));
        date=new Date(1997,9,6);
        result= new String[]{"Mon 01/09/1997", "Sun 07/09/1997"};
        assertEquals("failed",result,dateDisplay3.getDate(date));
    }
    @Test
    public void getDateFailure(){
        assertNotNull("failed",dateDisplay3.getDate(new Date(1996,2,23)));
        assertNull(dateDisplay3.getDate(null));
    }
}