import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ScientificPDFTest {

    @Test
    void operationTest() {
    }

    @Test
    public void categoryTest() {
        Document documentScientific = Producer_Factory.getDocumentScientific(true);
        IPDF PDFScientific = documentScientific.getDocumentPDF("ScientificPDF");
        String category = PDFScientific.Category("Law");
        String NotCategory = "Coding";
        assertEquals(category,"Law");
        String[] CategoryPDF = {"Art","Law","Engineering"};

        assertFalse(Arrays.asList(CategoryPDF).contains(NotCategory));
    }

    @Test
    public void testToStringTest() {
        String[] ListAuthors = {"Juan","Albert","Roger"};
        List<String> Authors = Arrays.asList(ListAuthors);
        String category = "Law";
        ScientificPDF PDFScientific = new ScientificPDF(1974, category, Authors,"3ra edition","MProduction","press","Spanish","1230",40,"First Example");
        ScientificPDF PDFScientific2 = new ScientificPDF(1975, category, Authors,"3ra edition","MProduction","press","Spanish","1230",40,"First Example");
        assertNotEquals(PDFScientific.toString(),PDFScientific2.toString());
    }
}