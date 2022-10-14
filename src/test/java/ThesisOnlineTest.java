import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ThesisOnlineTest {

    @Test
    public void getCategory() {
        Document documentThesis = Producer_Factory.getDocumentThesis(true);
        IOnlinePDF onlineThesis = documentThesis.getDocumentOnline("MagazinePDF");
        String category = onlineThesis.GetCategory("Law");
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
        ThesisOnline thesisOnline = new ThesisOnline(1974, category, Authors,"3ra edicion","MProduction","Impreso","Español","1230",40,"Primer ejemplo");
        ThesisOnline thesisOnline1 = new ThesisOnline(1975, category, Authors,"3ra edicion","MProduction","Impreso","Español","1230",40,"Primer ejemplo");
        assertNotEquals(thesisOnline.toString(),thesisOnline1.toString());
    }
}