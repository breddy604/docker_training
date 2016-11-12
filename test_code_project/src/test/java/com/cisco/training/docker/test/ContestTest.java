package com.cisco.training.docker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cisco.training.docker.code.Contest;

public class ContestTest {

    @Test
    public void test() {
        Contest c = new Contest();
        
        assertEquals("101", c.decimalToBinay(5));
    }

}
