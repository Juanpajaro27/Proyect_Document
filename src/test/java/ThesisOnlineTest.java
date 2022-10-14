import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ThesisOnlineTest {

    @Test
    public void getCategoryTest() {
        Document documentThesis = Producer_Factory.getDocumentThesis(true);
        IOnlinePDF onlineThesis = documentThesis.getDocumentOnline("MagazinePDF");
        String category = onlineThesis.GetCategory("Law");
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
        ThesisOnline thesisOnline = new ThesisOnline(1974, category, Authors,"3ra edition","MProduction","Press","Spanish","1230",40,"First Example");
        ThesisOnline thesisOnline1 = new ThesisOnline(1975, category, Authors,"3ra edition","MProduction","Press","Spanish","1230",40,"First Example");
        assertNotEquals(thesisOnline.toString(),thesisOnline1.toString());
    }
}