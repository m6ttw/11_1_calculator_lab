import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 1000);
    }

    @Test
    public void canGetNumberOfSheets(){
        assertEquals(100, printer.getNumberOfSheets());
    }

    @Test
    public void canPrintIfEnoughSheets(){
        printer.print(8, 12);
        assertEquals(4, printer.numberOfSheets);
    }

    @Test
    public void cannotPrintIfNotEnoughSheets(){
        printer.print(9, 12);
        assertEquals(100, printer.numberOfSheets);
    }

    @Test
    public void printingReducesTonerVolume(){
        printer.print(8, 12);
        assertEquals(904, printer.tonerVolume);
    }

    @Test
    public void printingMoreThanVolumeLeavesZero(){
        Printer newPrinter = new Printer(100, 20);
        newPrinter.print(8, 12);
        assertEquals(0, newPrinter.tonerVolume);
    }
}
