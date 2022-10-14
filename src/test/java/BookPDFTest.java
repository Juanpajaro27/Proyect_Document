import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookPDFTest {

    @Test
    public void operationTest() {
        Document documentBook = Producer_Factory.getDocumentBook(true);
        IPDF book = documentBook.getDocumentPDF("BookPDF");
        String operationPDF = book.operation("Copied");
        String NotOperationPDF = "Search";
        assertNotEquals(operationPDF,NotOperationPDF);
    }

    @Test
    public void categoryTest() {
        Document documentBook = Producer_Factory.getDocumentBook(true);
        IPDF book = documentBook.getDocumentPDF("BookPDF");
        String category = book.Category("Law");
        String NotCategory = "Coding";
        assertEquals(category,"Law");
        String[] CategoryOnline = {"Art","Law","Engineering"};

        assertFalse(Arrays.asList(CategoryOnline).contains(NotCategory));
    }

    @Test
    public void testToStringTest() {
        String[] ListAuthors = {"Juan","Albert","Roger"};
        List<String> Authors = Arrays.asList(ListAuthors);
        String category = "Law";
        BookPDF bookPDF = new BookPDF(1974, category, Authors,"3ra edition","MProduction","Press","Spanish","1230",40,"First Example");
        BookPDF bookPDF1 = new BookPDF(1975, category, Authors,"3ra edition","MProduction","Press","Spanish","1230",40,"First Example");
        assertNotEquals(bookPDF.toString(),bookPDF1.toString());
    }
}