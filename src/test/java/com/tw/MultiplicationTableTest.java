package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTableTest {
    @Test
    void should_return_true_when_validate_given_start_smaller_than_end() {
        //given
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        int start = 2;
        int end = 3;

        //when
        Boolean actual = multiplicationTable.isStartNotBiggerThanEnd(start, end);

        //then
        assertTrue(actual);
    }

    @Test
    void should_return_false_when_validate_given_start_bigger_than_end() {
        //given
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        int start = 4;
        int end = 2;

        //when
        Boolean actual = multiplicationTable.isStartNotBiggerThanEnd(start, end);

        //then
        assertFalse(actual);
    }

    @Test
    void should_return_false_when_validate_given_start_0() {
        //given
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        int start = 0;

        //when
        Boolean actual = multiplicationTable.isInRange(start);

        //then
        assertFalse(actual);
    }

    @Test
    void should_return_false_when_validate_given_end_1001() {
        //given
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        int end = 1001;

        //when
        Boolean actual = multiplicationTable.isInRange(end);

        //then
        assertFalse(actual);
    }

    @Test
    void should_return_true_when_validate_given_start_4_and_end_100() {
        //given
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        int start = 4;
        int end = 100;

        //when
        Boolean actual = multiplicationTable.isValid(start, end);

        //then
        assertTrue(actual);
    }

    @Test
    void should_return_multiplication_expression_when_multiply_given_multiplicand_2_and_multiplier_3() {
        //given
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        int multiplicand = 2;
        int multiplier = 3;

        //when
        String actual = multiplicationTable.generateSingleExpression(multiplicand, multiplier);
        String expected = "2*3=6";

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_multiplication_line_when_multiply_given_start_2_and_row_5() {
        //given
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        int start = 2;
        int row = 5;

        //when
        String actual = multiplicationTable.generateLine(start, row);
        String expected = "2*5=10  3*5=15  4*5=20  5*5=25";

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_multiply_table_when_multiply_given_start_number_2_end_number_5() {
        //given
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        int start = 2;
        int end = 5;

        //when
        String actual = multiplicationTable.generateTable(start, end);
        String expected = String.format("2*2=4%n2*3=6  3*3=9%n2*4=8  3*4=12  4*4=16%n2*5=10  3*5=15  4*5=20  5*5=25");

        //then
        assertEquals(expected, actual);
    }

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
}
