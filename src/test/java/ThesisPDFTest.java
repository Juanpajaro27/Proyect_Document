import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

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
        assertEquals(category,"Law");
        String[] CategoryOnline = {"Art","Law","Engineering"};

        assertFalse(Arrays.asList(CategoryOnline).contains(NotCategory));

    }

    @Test
    public void testToString() {
        String[] Authorslist = {"Juan","Albert","Roger"};
        List<String> Authors = Arrays.asList(Authorslist);
        String category = "Law";
        ThesisPDF thesisPDF = new ThesisPDF(1974, category, Authors,"3ra edicion","MProduction","Impreso","Español","1230",40,"Primer ejemplo");
        ThesisPDF thesisPDF1 = new ThesisPDF(1975, category, Authors,"3ra edicion","MProduction","Impreso","Español","1230",40,"Primer ejemplo");
        assertNotEquals(thesisPDF.toString(),thesisPDF1.toString());
    }
}