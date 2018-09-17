package com.company.Test;

import com.company.Java.StudentMarks1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarks1Test {
    StudentMarks1 studentMarks1;
    @Before
    public void setUp()  {
        studentMarks1=new StudentMarks1();
    }

    @After
    public void tearDown()  {
        studentMarks1=null;
    }

    @Test
    public void takeInput() {
        assertEquals("failed","no error",studentMarks1.takeInput(3,new int[]{20,40,90}));
        assertEquals("failed","no error",studentMarks1.takeInput(1,new int[]{50}));
        assertEquals("failed","error",studentMarks1.takeInput(4,new int[]{20,109,40,90}));
    }
    @Test
    public void takeInputFailure() {
        assertNotNull("failed",studentMarks1.takeInput(2,new int[]{40,90}));
        assertNotNull("failed",studentMarks1.takeInput(0,new int[]{}));
    }
}