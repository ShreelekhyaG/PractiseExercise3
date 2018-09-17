package com.company.Test;

import com.company.Java.Consecutive6;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Consecutive6Test {
    Consecutive6 consecutive6;
    @Before
    public void setUp() throws Exception {
        consecutive6=new Consecutive6();
    }

    @After
    public void tearDown() throws Exception {
        consecutive6=null;
    }

    @Test
    public void checkConsecutive() {
        assertEquals("failed","not consecutive",consecutive6.checkConsecutive("98,96,95,94,93"));
        assertEquals("failed","consecutive",consecutive6.checkConsecutive("54,53,52,51,50,49,48"));
        assertEquals("failed","not consecutive",consecutive6.checkConsecutive("1,2,3,4,5,6,6"));
    }
    @Test
    public void checkConsectiveFailure(){
        assertNotNull("failed",consecutive6.checkConsecutive("90"));
        assertNull(consecutive6.checkConsecutive(null));
    }
}