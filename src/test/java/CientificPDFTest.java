import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CientificPDFTest {

    @Test
    public void operation() {
        Document documentCientific = Producer_Factory.getDocumentCientific(true);
        IPDF science = documentCientific.getDocumentPDF("CientificPDF");
        String operationPDF = science.operation("Copied");
        String NotOperationPDF = "Search";
        assertNotEquals(operationPDF,NotOperationPDF);
    }

    @Test
    public void category() {
        Document documentCientific = Producer_Factory.getDocumentCientific(true);
        IPDF science = documentCientific.getDocumentPDF("CientificPDF");
        String category = science.Category("Law");
        String NotCategory = "Coding";
        String[] CategoryPDF = {"Art","Law","Engineering"};
        assertFalse(Arrays.asList(CategoryPDF).contains(NotCategory));
        assertTrue(Arrays.asList(CategoryPDF).contains(category));


    }

    @Test
    public void testToString() {
        String[] Authorslist = {"Juan","Albert","Roger"};
        List<String> Authors = Arrays.asList(Authorslist);
        String category = "Law";
        CientificPDF cientificPDF = new CientificPDF(1974, category, Authors,"3ra edicion","MProduction","Impreso","Español","1230",40,"Primer ejemplo");
        CientificPDF cientificPDF1 = new CientificPDF(1975, category, Authors,"3ra edicion","MProduction","Impreso","Español","1230",40,"Primer ejemplo");
        assertNotEquals(cientificPDF.toString(),cientificPDF1.toString());
    }
}