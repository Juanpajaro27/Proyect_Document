import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MagazinePDFTest {

    @Test
    public void operationTest() {
        Document documentMagazine = Producer_Factory.getDocumentMagazine(true);
        IPDF Magazine = documentMagazine.getDocumentPDF("MagazinePDF");
        String operationPDF = Magazine.operation("Copied");
        String NotOperationPDF = "Search";
        assertNotEquals(operationPDF,NotOperationPDF);
    }

    @Test
    public void categoryTest() {
        Document documentMagazine = Producer_Factory.getDocumentMagazine(true);
        IPDF Magazine = documentMagazine.getDocumentPDF("MagazinePDF");
        String category = Magazine.Category("Law");
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
        MagazinePDF MagazinePDF = new MagazinePDF(1974, category, Authors,"3ra edition","MProduction","Press","Spanish","1230",40,"First Example");
        MagazinePDF MagazinePDF1 = new MagazinePDF(1975, category, Authors,"3ra edition","MProduction","Press","Spanish","1230",40,"First Example");
        assertNotEquals(MagazinePDF.toString(),MagazinePDF1.toString());
    }
}