import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100);
    }

    @Test
    public void canGetNumberOfSheets(){
        assertEquals(100, printer.getNumberOfSheets());
    }

    @Test
    public void canPrintIfEnoughSheets(){
        assertEquals(4, printer.print(8, 12));
    }

    @Test
    public void cannotPrintIfNotEnoughSheets(){
        assertEquals(100, printer.print(9, 12));
    }
}
