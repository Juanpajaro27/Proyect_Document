import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ScientificOnlineTest {

    @Test
    public void getCategoryTest() {
        Document documentScientific = Producer_Factory.getDocumentScientific(true);
        IOnlinePDF onlineScientific = documentScientific.getDocumentOnline("ScientificOnline");
        String category = onlineScientific.GetCategory("Law");
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
        ScientificOnline ScientificOnline = new ScientificOnline(1974, category, Authors,"3ra edition","MProduction","press","Spanish","1230",40,"First Example");
        ScientificOnline ScientificOnline1 = new ScientificOnline(1975, category, Authors,"3ra edition","MProduction","press","Spanish","1230",40,"First Example");
        assertNotEquals(ScientificOnline.toString(),ScientificOnline1.toString());
    }
}