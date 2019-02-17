package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DaysOfMonthTest {
    DaysOfMonth daysOfMonth;

    @Before
    public void setUp(){
        daysOfMonth = new DaysOfMonth();
    }

    @Test
    public void JanMonthTest(){
        assertEquals(31, daysOfMonth.getDaysOfMonth(1,2019));
    }

    @Test
    public void NovMonthTest(){
        assertEquals(30, daysOfMonth.getDaysOfMonth(11,2019));
    }

    @Test
    public void FebMonthTest(){
        assertEquals(28, daysOfMonth.getDaysOfMonth(2,2019));
    }

    @Test
    public void FebLeapYearTest(){
        assertEquals(29, daysOfMonth.getDaysOfMonth(2,2020));
    }
}