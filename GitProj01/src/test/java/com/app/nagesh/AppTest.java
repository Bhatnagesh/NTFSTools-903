package com.app.nagesh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class AppTest {

    
    @Test
    public void testSumWithPositives() {
    	
    	int expected=300;
        App app=new App();
       int actual= app.sumOfTwoDigit(100,200);
       assertEquals(expected,actual);
    	
    }
    @Test
    public void testSumWithNegatives() {
    	
    	int expected=-300;
        App app=new App();
       int actual= app.sumOfTwoDigit(-100,-200);
       assertEquals(expected,actual);
    	
    }
}
