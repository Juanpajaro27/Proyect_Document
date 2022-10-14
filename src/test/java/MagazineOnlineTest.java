import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MagazineOnlineTest {

    @Test
    public void getCategoryTest() {
        Document documentMagazine = Producer_Factory.getDocumentMagazine(true);
        IOnlinePDF onlineMagazine = documentMagazine.getDocumentOnline("MagazineOnline");
        String category = onlineMagazine.GetCategory("Law");
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
        MagazineOnline MagazineOnline = new MagazineOnline(1974, category, Authors,"3ra Edition","MProduction","Press","Spanish","1230",40,"First Example");
        MagazineOnline magazineonline = new MagazineOnline(1975, category, Authors,"3ra Edition","MProduction","Press","Spanish","1230",40,"First Example");
        assertNotEquals(MagazineOnline.toString(),magazineonline.toString());
    }
}