import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

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
        assertEquals(category,"Law");
        String[] CategoryOnline = {"Art","Law","Engineering"};

        assertFalse(Arrays.asList(CategoryOnline).contains(NotCategory));
    }

    @Test
    public void testToString() {
        String[] Authorslist = {"Juan","Albert","Roger"};
        List<String> Authors = Arrays.asList(Authorslist);
        String category = "Law";
        MagazinePDF MagaginePDF = new MagazinePDF(1974, category, Authors,"3ra edicion","MProduction","Impreso","Español","1230",40,"Primer ejemplo");
        MagazinePDF MagazinePDF1 = new MagazinePDF(1975, category, Authors,"3ra edicion","MProduction","Impreso","Español","1230",40,"Primer ejemplo");
        assertNotEquals(MagaginePDF.toString(),MagazinePDF1.toString());
    }
}