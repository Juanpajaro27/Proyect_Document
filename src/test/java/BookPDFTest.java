import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookPDFTest {

    @Test
    public void operation() {
        Document documentBook = Producer_Factory.getDocumentBook(true);
        IPDF book = documentBook.getDocumentPDF("BookPDF");
        String operationPDF = book.operation("Copied");
        String NotOperationPDF = "Search";
        assertNotEquals(operationPDF,NotOperationPDF);
    }

    @Test
    public void category() {
        Document documentBook = Producer_Factory.getDocumentBook(true);
        IPDF book = documentBook.getDocumentPDF("BookPDF");
        String category = book.Category("Law");
        String NotCategory = "Coding";
        assertEquals(category,"Law");
        String[] CategoryOnline = {"Art","Law","Engineering"};

        assertFalse(Arrays.asList(CategoryOnline).contains(NotCategory));
    }

    @Test
    public void testToString() {
        String[] Authorslist = {"Juan","Albert","Roger"};
        List<String> Authors = Arrays.asList(Authorslist);
        String category = "Law";
        BookPDF bookPDF = new BookPDF(1974, category, Authors,"3ra edicion","MProduction","Impreso","Español","1230",40,"Primer ejemplo");
        BookPDF bookPDF1 = new BookPDF(1975, category, Authors,"3ra edicion","MProduction","Impreso","Español","1230",40,"Primer ejemplo");
        assertNotEquals(bookPDF.toString(),bookPDF1.toString());
    }
}