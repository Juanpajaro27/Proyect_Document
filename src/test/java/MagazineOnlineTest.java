import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MagazineOnlineTest {

    @Test
    public void getCategory() {
        Document documentMagazine = Producer_Factory.getDocumentMagazine(true);
        IOnlinePDF onlineMagazine = documentMagazine.getDocumentOnline("MagazineOnline");
        String category = onlineMagazine.GetCategory("Law");
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
        MagazineOnline Magagineonline = new MagazineOnline(1974, category, Authors,"3ra edicion","MProduction","Impreso","Español","1230",40,"Primer ejemplo");
        MagazineOnline magazineonline = new MagazineOnline(1975, category, Authors,"3ra edicion","MProduction","Impreso","Español","1230",40,"Primer ejemplo");
        assertNotEquals(Magagineonline.toString(),magazineonline.toString());
    }
}