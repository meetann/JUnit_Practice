package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class StringConverterTest {
    private StringConverter stringConverter;

    @Before
    public void setup(){
        stringConverter = new StringConverter();
        System.out.println("InsideBefore");
    }

    @After
    public void tearDown(){
        stringConverter = null;
        System.out.println("InsideAfter");
    }
    @BeforeClass
    public static void setupBeforeClass(){
        System.out.println("InsideBeforeClass");
    }
    @AfterClass
    public static void setupAfterClass(){
        System.out.println("InsideAfterClass");
    }

    @Test
    public void concatAndToUpperCase() {

        //act
        String result = stringConverter.concatAndToUpperCase("hi", "hello");
        //assert
        assertNotNull(result);
        assertEquals("HIHELLO", result);

    }
    @Test
    public void convertToUpperCase(){

        //act
        String result = stringConverter.convertToUpperCase("hi");
        //assert
        assertNotNull(result);
        assertEquals("HI", result);

    }

    @Test
    public void givenANullValueShouldReturnErrorMessage(){
        //act
        String result = stringConverter.convertToUpperCase(null);
        //assert
        assertNotNull(result);
        assertEquals("Please provide normal value!", result);

    }
}