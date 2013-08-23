package com.diycomputerscience.minesweeper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SquareTest {

    private Square square;

    @Before 
    public void setUp() throws Exception {
        this.square = new Square();
    }

    @After
    public void tearDown() throws Exception {
        this.square = null;
    }

    @Test
    public void testMine() throws Exception {
        this.square.setMine(true);
        assertTrue(this.square.isMine());
    }
}