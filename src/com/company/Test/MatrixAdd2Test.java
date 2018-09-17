package com.company.Test;

import com.company.Java.MatrixAdd2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdd2Test {
    MatrixAdd2 matrixAdd2;
    @Before
    public void setUp()  {
        matrixAdd2=new MatrixAdd2();
    }

    @After
    public void tearDown()  {
        matrixAdd2=null;
    }

    @Test
    public void matrixAddition() {
        assertEquals("failed",new int[][]{{10,10},{10,10},{10,10}},matrixAdd2.matrixAddition(3,2,new int[][]{{1,2},{3,4},{5,6}},new int[][]{{9,8},{7,6},{5,4}}));
        assertEquals("failed",new int[][]{{8,10,12},{8,8,8}},matrixAdd2.matrixAddition(2,3,new int[][]{{1,2,3},{4,5,6}},new int[][]{{7,8,9},{4,3,2}}));
    }
    @Test
    public void matrixAdditionFailure() {
        int[][] firstMatrix=new int[2][3];
        int[][] secondMatrix=new int[2][3];
        assertNotNull("failed",matrixAdd2.matrixAddition(3,2,new int[][]{{1,2},{3,4},{5,6}},new int[][]{{9,8},{7,6},{5,4}}));
        assertNotNull("failed",matrixAdd2.matrixAddition(2,3,firstMatrix,secondMatrix));
    }
}