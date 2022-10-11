import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ThesisOnlineTest {

    @Test
    public void getCategory() {
        Document documentThesis = Producer_Factory.getDocumentThesis(true);
        IOnlinePDF onlineThesis = documentThesis.getDocumentOnline("MagazinePDF");
        String category = onlineThesis.GetCategory("Law");
        String NotCategory = "Coding";
        assertNotEquals(category,NotCategory);
        String[] CategoryOnline = {"Art","Law","Engineering"};

        assertFalse(Arrays.asList(CategoryOnline).contains(NotCategory));
    }
}