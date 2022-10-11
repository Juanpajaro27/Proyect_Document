import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MagazineOnlineTest {

    @Test
    void getCategory() {
        Document documentMagazine = Producer_Factory.getDocumentMagazine(true);
        IOnlinePDF onlineMagazine = documentMagazine.getDocumentOnline("MagazineOnline");
        String category = onlineMagazine.GetCategory("Law");
        String NotCategory = "Coding";
        assertNotEquals(category,NotCategory);
        String[] CategoryOnline = {"Art","Law","Engineering"};

        assertFalse(Arrays.asList(CategoryOnline).contains(NotCategory));
    }
}