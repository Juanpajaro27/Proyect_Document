import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CientificPDFTest {

    @Test
    void operation() {
        Document documentCientific = Producer_Factory.getDocumentCientific(true);
        IPDF science = documentCientific.getDocumentPDF("CientificPDF");
        String operationPDF = science.operation("Copied");
        String NotOperationPDF = "Search";
        assertNotEquals(operationPDF,NotOperationPDF);
    }

    @Test
    void category() {
        Document documentCientific = Producer_Factory.getDocumentCientific(true);
        IPDF science = documentCientific.getDocumentPDF("CientificPDF");
        String category = science.Category("Law");
        String NotCategory = "Coding";
        assertNotEquals(category,NotCategory);
        String[] CategoryOnline = {"Art","Law","Engineering"};

        assertFalse(Arrays.asList(CategoryOnline).contains(NotCategory));
    }
}