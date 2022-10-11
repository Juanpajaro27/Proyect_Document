import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ThesisPDFTest {

    @Test
    public void operation() {
        Document documentThesis = Producer_Factory.getDocumentThesis(true);
        IPDF thesis = documentThesis.getDocumentPDF("Thesis");
        String operationPDF = thesis.operation("Copied");
        String NotOperationPDF = "Search";
        assertNotEquals(operationPDF,NotOperationPDF);
    }

    @Test
    public void category() {
        Document documentthesis = Producer_Factory.getDocumentThesis(true);
        IPDF thesis = documentthesis.getDocumentPDF("Thesis");
        String category = thesis.Category("Law");
        String NotCategory = "Coding";
        assertNotEquals(category,NotCategory);
        String[] CategoryOnline = {"Art","Law","Engineering"};

        assertFalse(Arrays.asList(CategoryOnline).contains(NotCategory));

    }
}