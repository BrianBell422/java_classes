import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestPrinter {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(10, 50);
    }

    @Test
    public void hasPaper(){
        assertEquals(10, printer.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(50, printer.getToner());
    }

    @Test
    public void canPrint(){
        printer.printDocument(2, 3);
        assertEquals(4, printer.getPaper());
        assertEquals(44, printer.getToner());
    }

    @Test
    public void cannotPrint(){
        assertFalse(printer.printDocument(5, 3));
    }
}
