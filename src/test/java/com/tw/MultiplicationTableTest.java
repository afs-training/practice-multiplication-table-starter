package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MultiplicationTableTest {
    @Test
    void should_return_null_when_multiply_given_start_number_2_end_number_1() {
        //given
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        int start = 2;
        int end = 1;

        //when
        String actual = multiplicationTable.create(start, end);

        //then
        assertNull(actual);
    }

    @Test
    void should_return_null_when_multiply_given_start_number_0_end_number_1001() {
        //given
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        int start = 0;
        int end = 1001;

        //when
        String actual = multiplicationTable.create(start, end);

        //then
        assertNull(actual);
    }

    @Test
    void should_return_single_equation_when_multiply_given_start_number_2_end_number_2() {
        //given
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        int start = 2;
        int end = 2;

        //when
        String actual = multiplicationTable.create(start, end);

        //then
        assertEquals("2*2=4", actual);
    }

    @Test
    void should_return_multiply_table_when_multiply_given_start_number_2_end_number_5() {
        //given
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        int start = 2;
        int end = 5;

        //when
        String actual = multiplicationTable.create(start, end);
        String expected = String.format("2*2=4%n2*3=6  3*3=9%n2*4=8  3*4=12  4*4=16%n2*5=10  3*5=15  4*5=20  5*5=25");

        //then
        assertEquals(expected, actual);
    }
}
