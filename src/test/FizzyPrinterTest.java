package test;

import org.junit.Test;
import src.FizzyPrinter;

import static org.junit.Assert.assertEquals;

public class FizzyPrinterTest {
    @Test
    public void testDivisibleBy3() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        assertEquals("Fizz", fizzyPrinter.printFizzy(9, false));
    }

    @Test
    public void testDivisibleBy5() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        assertEquals("Buzz", fizzyPrinter.printFizzy(10, false));
    }

    @Test
    public void testDivisibleBy7(){
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        assertEquals("Bang",fizzyPrinter.printFizzy(14,false));
    }

    @Test
    public void testDivisibleBy3And5(){
        FizzyPrinter fizzyPrinter= new FizzyPrinter();
        assertEquals("Fizzbuzz",fizzyPrinter.printFizzy(15,false));
    }

}
