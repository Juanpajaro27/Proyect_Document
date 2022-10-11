import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BookPDFTest {

    @Test
    void operation() {
        Document documentBook = Producer_Factory.getDocumentBook(true);
        IPDF book = documentBook.getDocumentPDF("BookPDF");
        String operationPDF = book.operation("Copied");
        String NotOperationPDF = "Search";
        assertNotEquals(operationPDF,NotOperationPDF);
    }

    @Test
    void category() {
        Document documentBook = Producer_Factory.getDocumentBook(true);
        IPDF book = documentBook.getDocumentPDF("BookPDF");
        String category = book.Category("Law");
        String NotCategory = "Coding";
        assertNotEquals(category,NotCategory);
        String[] CategoryOnline = {"Art","Law","Engineering"};

        assertFalse(Arrays.asList(CategoryOnline).contains(NotCategory));
    }
}