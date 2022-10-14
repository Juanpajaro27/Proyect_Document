import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CientificOnlineTest {

    @Test
    public void getCategory() {
        Document documentCientific = Producer_Factory.getDocumentCientific(true);
        IOnlinePDF onlineCientific = documentCientific.getDocumentOnline("CientificOnline");
        String category = onlineCientific.GetCategory("Law");
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
        CientificOnline cientificOnline = new CientificOnline(1974, category, Authors,"3ra edicion","MProduction","Impreso","Español","1230",40,"Primer ejemplo");
        CientificOnline cientificOnline1 = new CientificOnline(1975, category, Authors,"3ra edicion","MProduction","Impreso","Español","1230",40,"Primer ejemplo");
        assertNotEquals(cientificOnline.toString(),cientificOnline1.toString());
    }
}