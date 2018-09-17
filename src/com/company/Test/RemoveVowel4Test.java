package com.company.Test;

import com.company.Java.RemoveVowel4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowel4Test {
    RemoveVowel4 removeVowel4;
    @Before
    public void setUp() throws Exception {
        removeVowel4=new RemoveVowel4();
    }

    @After
    public void tearDown() throws Exception {
        removeVowel4=null;
    }

    @Test
    public void eleminateVowels() {
        assertEquals("failed",new String[]{"Ind","Untd Stts","Grmny","Egypt","czchslvk"},removeVowel4.eleminateVowels(new String[]{"India","United States","Germany","Egypt","czechoslovakia"}));
        assertEquals("failed",new String[]{"bcd"},removeVowel4.eleminateVowels(new String[]{"abcd"}));
    }
    @Test
    public void eleminateVowelsFailure() {
        assertNotNull("failed",removeVowel4.eleminateVowels(new String[]{"aeiou"}));
        assertEquals("failed",new String[]{""},removeVowel4.eleminateVowels(new String[]{""}));
    }
}