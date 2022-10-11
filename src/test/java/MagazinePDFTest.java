import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MagazinePDFTest {

    @Test
    public void operation() {
        Document documentMagazine = Producer_Factory.getDocumentMagazine(true);
        IPDF Magazine = documentMagazine.getDocumentPDF("MagazinePDF");
        String operationPDF = Magazine.operation("Copied");
        String NotOperationPDF = "Search";
        assertNotEquals(operationPDF,NotOperationPDF);
    }

    @Test
    public void category() {
        Document documentMagazine = Producer_Factory.getDocumentMagazine(true);
        IPDF Magazine = documentMagazine.getDocumentPDF("MagazinePDF");
        String category = Magazine.Category("Law");
        String NotCategory = "Coding";
        assertNotEquals(category,NotCategory);
        String[] CategoryOnline = {"Art","Law","Engineering"};

        assertFalse(Arrays.asList(CategoryOnline).contains(NotCategory));
    }
}