import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ThesisPDFTest {

    @Test
    public void operationTest() {
        Document documentThesis = Producer_Factory.getDocumentThesis(true);
        IPDF thesis = documentThesis.getDocumentPDF("Thesis");
        String operationPDF = thesis.operation("Copied");
        String NotOperationPDF = "Search";
        assertNotEquals(operationPDF,NotOperationPDF);
    }

    @Test
    public void categoryTest() {
        Document documentThesis = Producer_Factory.getDocumentThesis(true);
        IPDF thesis = documentThesis.getDocumentPDF("Thesis");
        String category = thesis.Category("Law");
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
        ThesisPDF thesisPDF = new ThesisPDF(1974, category, Authors,"3ra edition","MProduction","Press","Spanish","1230",40,"First Example");
        ThesisPDF thesisPDF1 = new ThesisPDF(1975, category, Authors,"3ra edition","MProduction","Press","Spanish","1230",40,"First Example");
        assertNotEquals(thesisPDF.toString(),thesisPDF1.toString());
    }
}